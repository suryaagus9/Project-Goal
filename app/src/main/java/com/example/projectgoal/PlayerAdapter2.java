package com.example.projectgoal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectgoal.Fragment.HomeFragment;
import com.example.projectgoal.Fragment.PlayerFragment;
import com.example.projectgoal.Fragment.ScoreFragment;

import java.util.ArrayList;

public class PlayerAdapter2 extends RecyclerView.Adapter<PlayerAdapter2.ViewHolder> {
    private final ArrayList<Player> players;
    private final PlayerFragment context;

    public PlayerAdapter2(ArrayList<Player> players, PlayerFragment context) {
        this.players = players;
        this.context = context;
    }

    @NonNull
    @Override
    public PlayerAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_item, parent, false);
        return new PlayerAdapter2.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerAdapter2.ViewHolder holder, int position) {
        Player player = players.get(position);
        holder.setData(player);
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pi_iv_profile;
        TextView pi_tv_name, pi_tv_club;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pi_iv_profile = itemView.findViewById(R.id.pi_iv_profile);
            pi_tv_name = itemView.findViewById(R.id.pi_tv_player);
            pi_tv_club = itemView.findViewById(R.id.pi_tv_club);
        }

        public void setData(Player player) {
            pi_iv_profile.setImageResource(player.getProfile());
            pi_tv_name.setText(player.getName());
            pi_tv_club.setText(String.valueOf(player.getClub()));
        }
    }
}

