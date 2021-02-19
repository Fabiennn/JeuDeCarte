package com.example.casse_brique;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class BoucleJeu extends AppCompatActivity {

    private final static int NB_CARTES = 5;
    private ArrayList<Integer> integerList = new ArrayList<>();
    private int valueOfHealth = 50;
    private int valueOfMoney = 50;
    private int valueOfLaugh = 50;
    private int valueOfLove = 50;
    private Carte carteActive;
    private int nombreAleatoire = 1;

    // Activité principale
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button buttonYes = findViewById(R.id.buttonYes);
        final Carte carte = new Carte(1, 5,5,5,5,5,5,5,5, "descriptionUN", "Image", "Personnage");
        final Carte carte2 = new Carte(2, 5,5,5,100,5,5,5,5, "descriptionDEUX", "Image", "Personnage");
        final Carte carte3 = new Carte(3, 5,5,5,100,5,5,5,5, "descriptionTROIS", "Image", "Personnage");
        final Carte carte4 = new Carte(4, 5,5,5,100,5,5,5,5, "descriptionQUATRE", "Image", "Personnage");
        final Carte carte5 = new Carte(5, 5,5,5,100,5,5,5,5, "descriptionCINQ", "Image", "Personnage");
        final Carte carte6 = new Carte(6, 5,5,5,100,5,5,5,5, "descriptionSIX", "Image", "Personnage");
        final Carte carte7 = new Carte(7, 5,5,5,100,5,5,5,5, "descriptionSEPT", "Image", "Personnage");
        final Carte carte8 = new Carte(8, 5,5,5,100,5,5,5,5, "descriptionHUIT", "Image", "Personnage");

        final HashMap<Integer, Carte> tamere = new HashMap<>();
        tamere.put(1,carte);
        tamere.put(2,carte2);
        tamere.put(3,carte3);
        tamere.put(4,carte4);
        tamere.put(5,carte5);
        tamere.put(6,carte6);
        tamere.put(7,carte7);
        tamere.put(8,carte8);
        final TextView textHealth = findViewById(R.id.textHealth);
        TextView textLove = findViewById(R.id.textLove);
        TextView textLaugh = findViewById(R.id.textLaugh);
        TextView textMoney = findViewById(R.id.textMoney);

        textHealth.setText(String.valueOf(valueOfHealth) + "%");
        textLove.setText(String.valueOf(valueOfLove) + "%");
        textLaugh.setText(String.valueOf(valueOfLaugh) + "%");
        textMoney.setText(String.valueOf(valueOfMoney) + "%");


        integerList.add(nombreAleatoire);
        carteActive = tamere.get(nombreAleatoire);


        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add stats of the card
                valueOfHealth += carteActive.getInfluenceAnswerYes().get("influenceSante");
                textHealth.setText(carteActive.getDescription());
                if (integerList.size() < tamere.size()) {
                    do {
                        nombreAleatoire = 2 + (int) (Math.random() * (tamere.size() - 1));
                    } while (integerList.contains(nombreAleatoire));
                    System.out.println("MON CHIFFRE" + nombreAleatoire);

                    integerList.add(nombreAleatoire);
                    carteActive = tamere.get(nombreAleatoire);
                }
            }
            });

        }

}