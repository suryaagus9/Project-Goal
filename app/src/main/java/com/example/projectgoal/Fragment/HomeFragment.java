package com.example.projectgoal.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectgoal.Account;
import com.example.projectgoal.AccountAdapter;
import com.example.projectgoal.AccountDataSource;
import com.example.projectgoal.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    AccountAdapter accountAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rv_home);
        accountAdapter = new AccountAdapter(AccountDataSource.accounts, this);
        recyclerView.setAdapter(accountAdapter);

        if (getArguments() != null){
            ArrayList<Account> accountsReceived = getArguments().getParcelableArrayList("accounts");
            if (accountsReceived != null) {
                AccountDataSource.accounts.addAll(0,accountsReceived);
                accountAdapter.notifyDataSetChanged();
            }
        }
    }
}