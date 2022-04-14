package com.example.onlineapply;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class images extends AppCompatActivity {

    private final int requests = 500;
    ImageView aadharimage; // global variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        aadharimage = findViewById(R.id.aadharimage);
        Button gallery = findViewById(R.id.gallery);

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myPhoto = new Intent(Intent.ACTION_PICK);
                myPhoto.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(myPhoto, requests);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            if(resultCode== requests){
                aadharimage.setImageURI(data.getData());
            }
        }
    }
}