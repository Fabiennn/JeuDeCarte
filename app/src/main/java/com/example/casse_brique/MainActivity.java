package com.example.casse_brique;

import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonnnn);
        final TextView message = findViewById(R.id.textTer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                message.setText(String.format("CA A MARCHE"));
            }
        });

    }
}