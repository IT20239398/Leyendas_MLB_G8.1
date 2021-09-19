package com.example.Dahlia;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginFragment extends Fragment {

    EditText email,password;
    TextView forgetPassword;
    Button loginButton;
//    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_login, container, false);

        email = view.findViewById(R.id.editTextTextEmailAddress);
        password = view.findViewById(R.id.editTextTextPassword);
        forgetPassword = view.findViewById(R.id.forgetPassword);
        loginButton = view.findViewById(R.id.button_log);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),Profile.class);
                startActivity(intent);
            }
        });

//        email.setTranslationX(800);
//        password.setTranslationX(800);
//        forgetPassword.setTranslationX(800);
//        loginButton.setTranslationX(800);
//
//        email.setAlpha(v);
//        password.setAlpha(v);
//        forgetPassword.setAlpha(v);
//        loginButton.setAlpha(v);
//
//        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        forgetPassword.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        loginButton.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();


//    loginButton.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Intent intent = new Intent(LoginFragment.this.clone(), Profile.class);
//        }
//    });

        return view;
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        loginButton = getActivity().findViewById(R.id.button_log);
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(getActivity(),Profile.class);
//                getActivity().startActivity(intent);
//            }
//        });
//    }
}