package com.example.projectgoal.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectgoal.PlayerAdapter;
import com.example.projectgoal.PlayerDataSource;
import com.example.projectgoal.R;

public class ScoreFragment extends Fragment {

    RecyclerView recyclerView;
    PlayerAdapter playerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_score, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rv_score);
        playerAdapter = new PlayerAdapter(PlayerDataSource.players, this);
        recyclerView.setAdapter(playerAdapter);
    }
}