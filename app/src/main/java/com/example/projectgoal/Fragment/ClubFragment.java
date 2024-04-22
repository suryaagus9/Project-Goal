package com.example.projectgoal.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectgoal.AccountAdapter;
import com.example.projectgoal.AccountDataSource;
import com.example.projectgoal.ClubAdapter;
import com.example.projectgoal.ClubDataSource;
import com.example.projectgoal.R;

public class ClubFragment extends Fragment {

    RecyclerView recyclerView;
    ClubAdapter clubAdapterAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_club, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_club);
        clubAdapterAdapter = new ClubAdapter(ClubDataSource.clubs, this);
        recyclerView.setAdapter(clubAdapterAdapter);
    }
}