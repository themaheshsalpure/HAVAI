package com.example.healthyassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class HOSPIAYUSHMANACT extends AppCompatActivity {
    private FloatingActionButton navigation_btn;
    private FloatingActionButton navigation_btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospiayushmanact);
        navigation_btn=findViewById(R.id.launch);
        navigation_btn1=findViewById(R.id.launch2);
        navigation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a Uri for the location you want to navigate to
                Uri gmmIntentUri = Uri.parse("google.navigation:q=22.6592339,88.435534&mode=l");

                // Create an Intent to launch Google Maps with the specified Uri
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                // Check if there is an app installed that can handle the Intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

//second location
        navigation_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a Uri for the location you want to navigate to
                Uri gmmIntentUri = Uri.parse("google.navigation:q=62.6592339,84.435534&mode=l");

                // Create an Intent to launch Google Maps with the specified Uri
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                // Check if there is an app installed that can handle the Intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }}