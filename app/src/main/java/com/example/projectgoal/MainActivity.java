package com.example.projectgoal;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.projectgoal.Fragment.AboutFragment;
import com.example.projectgoal.Fragment.ClubFragment;
import com.example.projectgoal.Fragment.HomeFragment;
import com.example.projectgoal.Fragment.PlayerFragment;
import com.example.projectgoal.Fragment.PostFragment;
import com.example.projectgoal.Fragment.ProfileFragment;
import com.example.projectgoal.Fragment.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton titlebar_menu;
    LinearLayout home, profile, post, clubrank, topscore, listplayer, about, exit;

    TextView titlebar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        titlebar_menu = findViewById(R.id.titlebar_menu);
        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile);
        post = findViewById(R.id.post);
        clubrank = findViewById(R.id.clubrank);
        topscore = findViewById(R.id.topscore);
        listplayer = findViewById(R.id.listplayer);
        about = findViewById(R.id.about);
        exit = findViewById(R.id.exit);

        titlebar_title = findViewById(R.id.titlebar_title);
        titlebar_title.setText("Home");


        AboutFragment aboutFragment = new AboutFragment();
        ClubFragment clubFragment = new ClubFragment();
        HomeFragment homeFragment = new HomeFragment();
        PlayerFragment playerFragment = new PlayerFragment();
        PostFragment postFragment = new PostFragment();
        ProfileFragment profileFragment = new ProfileFragment();
        ScoreFragment scoreFragment = new ScoreFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, homeFragment).addToBackStack(null).commit();

        titlebar_menu.setOnClickListener(v->{
            drawerLayout.openDrawer(GravityCompat.START);
        });

        home.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, homeFragment).addToBackStack(null).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            titlebar_title.setText("Home");
        });


        profile.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, profileFragment).addToBackStack(null).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            titlebar_title.setText("Profile");
        });

        post.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, postFragment).addToBackStack(null).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            titlebar_title.setText("Posting");
        });

        clubrank.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, clubFragment).addToBackStack(null).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            titlebar_title.setText("Club Rangking");
        });

        about.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, aboutFragment).addToBackStack(null).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            titlebar_title.setText("About");
        });

        topscore.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, scoreFragment).addToBackStack(null).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            titlebar_title.setText("Top Score");
        });

        listplayer.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, playerFragment).addToBackStack(null).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            titlebar_title.setText("List Player");
        });

       exit.setOnClickListener(v->{
           finish();
        });










    }
}