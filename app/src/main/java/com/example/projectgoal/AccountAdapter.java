package com.example.projectgoal;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectgoal.Fragment.HomeFragment;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {

    private final ArrayList<Account> accounts;
    private final HomeFragment context;

    public AccountAdapter(ArrayList<Account> accounts, HomeFragment context) {
        this.accounts = accounts;
        this.context = context;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account account = accounts.get(position);
        holder.setData(account);
    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView pi_tv_name, pi_tv_username, pi_tv_caption;
        ImageView pi_iv_profile, pi_iv_post;
        Uri uriPost;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pi_iv_post = itemView.findViewById(R.id.pi_iv_post);
            pi_iv_profile = itemView.findViewById(R.id.pi_iv_profile);
            pi_tv_caption = itemView.findViewById(R.id.pi_tv_caption);
            pi_tv_name = itemView.findViewById(R.id.pi_tv_name);
            pi_tv_username = itemView.findViewById(R.id.pi_tv_username);
        }

        public void setData(Account account) {
            if (account.getUriPost() != null){
                pi_iv_post.setImageURI(account.getUriPost());
            } else {
                pi_iv_post.setImageResource(account.getPost());
            }
            pi_iv_profile.setImageResource(account.getProfile());
            pi_tv_caption.setText(account.getCaption());
            pi_tv_name.setText(account.getName());
            pi_tv_username.setText(account.getUsernamen());
        }
    }
}
