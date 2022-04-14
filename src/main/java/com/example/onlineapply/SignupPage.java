package com.example.onlineapply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class SignupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        TextView firstname = (TextView) findViewById(R.id.firstname);
        TextView lastname = (TextView) findViewById(R.id.lastname);
        TextView emailid = (TextView) findViewById(R.id.emailid);
        TextView setpwd = (TextView) findViewById(R.id.setpwd);

        MaterialButton confirm_button = (MaterialButton) findViewById(R.id.confirm_button);

        confirm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstname.getText().toString().equals("admin") && lastname.getText().toString().equals("admin") && emailid.getText().toString().equals("admin") && setpwd.getText().toString().equals("admin")){
                    Toast.makeText(SignupPage.this, "Registration Completed", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SignupPage.this, "Registration Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void btn_photo(View view) {
        startActivity(new Intent(getApplicationContext(), images.class));
    }
}