package com.example.casse_brique;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlay = findViewById(R.id.Play);

        Button buttonQuit = findViewById(R.id.Quitter);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                setContentView(R.layout.first_card);
            }
        });

        buttonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }

        });

    }
}