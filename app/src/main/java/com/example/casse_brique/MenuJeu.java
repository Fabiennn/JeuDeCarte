package com.example.casse_brique;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class MenuJeu extends AppCompatActivity {

    // Creation
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlay = findViewById(R.id.Play);
        Button buttonQuit = findViewById(R.id.Quitter);
        final EditText nomJoueur = (EditText) findViewById(R.id.nomJoueur);
        final TextView warning = findViewById(R.id.Avertissement);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                // Creation d'une nouvelle activite, ici BoucleJeu
                if (!nomJoueur.getText().toString().trim().equals("")) {
                    Intent myIntent = new Intent(MenuJeu.this, BoucleJeu.class);
                    myIntent.putExtra("nomJoueur", nomJoueur.getText().toString());
                    MenuJeu.this.startActivity(myIntent);
                } else {
                    warning.setVisibility(View.VISIBLE);
                }
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