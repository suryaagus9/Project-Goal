package com.example.projectgoal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectgoal.Fragment.HomeFragment;
import com.example.projectgoal.Fragment.ScoreFragment;

import java.util.ArrayList;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {
    private final ArrayList<Player> players;
    private final ScoreFragment context;

    public PlayerAdapter(ArrayList<Player> players, ScoreFragment context) {
        this.players = players;
        this.context = context;
    }

    @NonNull
    @Override
    public PlayerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.score_item, parent, false);
        return new PlayerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerAdapter.ViewHolder holder, int position) {
        Player player = players.get(position);
        holder.setData(player);
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView si_iv_profile;
        TextView si_tv_name, si_tv_club, si_tv_goal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            si_iv_profile = itemView.findViewById(R.id.si_iv_profile);
            si_tv_name = itemView.findViewById(R.id.si_tv_player);
            si_tv_club = itemView.findViewById(R.id.si_tv_club);
            si_tv_goal = itemView.findViewById(R.id.si_tv_score);
        }

        public void setData(Player player) {
            si_iv_profile.setImageResource(player.getProfile());
            si_tv_name.setText(player.getName());
            si_tv_goal.setText(String.valueOf(player.getGoal()));
            si_tv_club.setText(String.valueOf(player.getClub()));
        }
    }
}
