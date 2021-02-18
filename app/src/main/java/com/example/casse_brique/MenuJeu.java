package com.example.casse_brique;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MenuJeu extends AppCompatActivity {

    // Creation
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imgPolytech);
        img.setImageResource(R.drawable.love);

        Button buttonPlay = findViewById(R.id.Play);

        Button buttonQuit = findViewById(R.id.Quitter);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                // Creation d'une nouvelle activite, ici BoucleJeu
                Intent myIntent = new Intent(MenuJeu.this, BoucleJeu.class);
                MenuJeu.this.startActivity(myIntent);
            }
        });

        buttonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quitte l'application
               finish();
            }

        });

    }
}