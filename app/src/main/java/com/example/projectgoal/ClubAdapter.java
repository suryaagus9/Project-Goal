package com.example.projectgoal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectgoal.Fragment.ClubFragment;

import java.util.ArrayList;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder> {
    private final ArrayList<Club> clubs;
    private final ClubFragment context;

    public ClubAdapter(ArrayList<Club> clubs, ClubFragment context) {

        this.clubs = clubs;
        this.context = context;
    }

    @NonNull
    @Override
    public ClubAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.club_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubAdapter.ViewHolder holder, int position) {
        Club club = clubs.get(position);
        holder.setData(club);
    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView ci_tv_club, ci_tv_country, ci_tv_point;
        ImageView ci_iv_profile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ci_tv_club = itemView.findViewById(R.id.ci_tv_club);
            ci_tv_country = itemView.findViewById(R.id.ci_tv_country);
            ci_tv_point = itemView.findViewById(R.id.ci_tv_points);
            ci_iv_profile = itemView.findViewById(R.id.ci_iv_profile);
        }

        public void setData(Club club) {
            ci_tv_club.setText(club.getName());
            ci_tv_country.setText(club.getCountry());
            ci_iv_profile.setImageResource(club.getProfile());
            ci_tv_point.setText(String.valueOf(club.getPoint()));
        }
    }
}
