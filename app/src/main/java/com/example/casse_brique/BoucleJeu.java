package com.example.casse_brique;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class BoucleJeu extends AppCompatActivity {

    private final static int NB_CARTES = 5;
    private ArrayList<Integer> integerList = new ArrayList<>();

    // Activité principale
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Carte carte = new Carte(1, 5, -2, 0, 0, "Vous préférez passer votre saint Valentin à travailler afin de gagner un max de thunes.");
        Carte carte2 = new Carte(2, 5, -2, 0, 0, "Vous préférez passer votre saint Valentin à travailler afin de gagner un max de thunes.");
        Carte carte3 = new Carte(3, 5, -2, 0, 0, "Vous préférez passer votre saint Valentin à travailler afin de gagner un max de thunes.");
        ArrayList<Carte> cartes = new ArrayList<Carte>();
        cartes.add(carte);
        cartes.add(carte2);
        cartes.add(carte3);

        TextView description = findViewById(R.id.textView7);
        description.setText(carte.getDescription());


    }
}