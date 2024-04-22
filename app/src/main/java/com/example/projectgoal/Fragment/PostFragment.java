package com.example.projectgoal.Fragment;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projectgoal.Account;
import com.example.projectgoal.R;

import java.util.ArrayList;


public class PostFragment extends Fragment {

    ImageButton iv_image;
    EditText et_caption;
    ImageView iv_account;
    TextView tv_nameaccount, tv_usernameaccount;
    Button btn_post;

    Uri uriPost;
    Boolean cekPost = false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iv_image = view.findViewById(R.id.iv_image);
        et_caption = view.findViewById(R.id.et_caption);
        iv_account = view.findViewById(R.id.iv_account);
        tv_nameaccount = view.findViewById(R.id.tv_nameaccount);
        tv_usernameaccount = view.findViewById(R.id.tv_usernameaccount);
        btn_post = view.findViewById(R.id.btn_post);


        ActivityResultLauncher<Intent> intentLaunch = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result ->{
                    if (result.getResultCode() == RESULT_OK && result.getData() != null ){
                        uriPost = result.getData().getData();
                        iv_image.setImageURI(uriPost);
                        cekPost = true;
                    }
                }
        );
        iv_image.setOnClickListener(v->{
            Intent toGallery = new Intent(Intent.ACTION_PICK);
            toGallery.setType("image/*");
            intentLaunch.launch(toGallery);
        });


        btn_post.setOnClickListener(v->{
            String caption = et_caption.getText().toString().trim();
            if (caption.isEmpty()){
                Toast.makeText(getActivity(), "Silahkan isi caption", Toast.LENGTH_SHORT).show();
            } else if ( cekPost == false) {
                Toast.makeText(getActivity(), "Silahkan pilih gambar", Toast.LENGTH_SHORT).show();
            } else {
                ArrayList<Account> accounts = new ArrayList<>();
                accounts.add(new Account("PSM MAKASSAR",
                        "@psmmakassar",
                        caption,
                       R.drawable.psm,
                        0,
                        uriPost));

                HomeFragment homeFragment = new HomeFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("accounts", accounts);
                homeFragment.setArguments(bundle);

                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.beginTransaction().
                        replace(R.id.frame_layout, homeFragment, HomeFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }

        });
    }
}