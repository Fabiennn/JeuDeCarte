package com.example.casse_brique;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import java.io.File;
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
        Button buttonNo = findViewById(R.id.buttonNo);
        final Carte carte = new Carte(1, 5,5,5,5,5,5,5,5, "descriptionUN", R.drawable.portrait1, "Personnage");
        final Carte carte2 = new Carte(2, 5,5,5,100,5,5,5,5, "descriptionDEUX", R.drawable.portrait2, "Personnage");
        final Carte carte3 = new Carte(3, 5,5,5,100,5,5,5,5, "descriptionTROIS", R.drawable.portrait3, "Personnage");
        final Carte carte4 = new Carte(4, 5,5,5,100,5,5,5,5, "descriptionQUATRE", R.drawable.portrait4, "Personnage");
        final Carte carte5 = new Carte(5, 5,5,5,100,5,5,5,5, "descriptionCINQ", R.drawable.portrait5, "Personnage");
        final Carte carte6 = new Carte(6, 5,5,5,100,5,5,5,5, "descriptionSIX", R.drawable.portrait6, "Personnage");
        final Carte carte7 = new Carte(7, 5,5,5,100,5,5,5,5, "descriptionSEPT", R.drawable.portrait7, "Personnage");
        final Carte carte8 = new Carte(8, 5,5,5,100,5,5,5,5, "descriptionHUIT", R.drawable.portrait8, "Personnage");

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
        final TextView textLove = findViewById(R.id.textLove);
        final TextView textLaugh = findViewById(R.id.textLaugh);
        final TextView textMoney = findViewById(R.id.textMoney);
        final TextView description = findViewById(R.id.description);
        final ImageView portrait = findViewById(R.id.portrait);

        textHealth.setText(valueOfHealth + "%");
        textLove.setText(valueOfLove + "%");
        textLaugh.setText(valueOfLaugh + "%");
        textMoney.setText(valueOfMoney + "%");


        integerList.add(nombreAleatoire);
        carteActive = tamere.get(nombreAleatoire);
        description.setText(carteActive.getDescription());
        portrait.setImageResource(carteActive.getImage());
        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add stats of the card
                valueOfHealth += carteActive.getInfluenceAnswerYes().get("influenceSante");
                valueOfLaugh += carteActive.getInfluenceAnswerYes().get("influenceDivertissement");
                valueOfLove += carteActive.getInfluenceAnswerYes().get("influenceAmour");
                valueOfMoney += carteActive.getInfluenceAnswerYes().get("influenceArgent");
                textHealth.setText(valueOfHealth + "%");
                textLaugh.setText(valueOfLaugh + "%");
                textLove.setText(valueOfLove + "%");
                textMoney.setText(valueOfMoney + "%");

                if (integerList.size() < tamere.size()) {
                    do {
                        nombreAleatoire = 2 + (int) (Math.random() * (tamere.size() - 1));
                    } while (integerList.contains(nombreAleatoire));
                    System.out.println("MON CHIFFRE" + nombreAleatoire);

                    integerList.add(nombreAleatoire);
                    carteActive = tamere.get(nombreAleatoire);
                    description.setText(carteActive.getDescription());
                    portrait.setImageResource(carteActive.getImage());
                }
            }
            });

        buttonNo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOfHealth += carteActive.getInfluenceAnswerNo().get("influenceSante");
                valueOfLaugh += carteActive.getInfluenceAnswerNo().get("influenceDivertissement");
                valueOfLove += carteActive.getInfluenceAnswerNo().get("influenceAmour");
                valueOfMoney += carteActive.getInfluenceAnswerNo().get("influenceArgent");
                textHealth.setText(valueOfHealth + "%");
                textLaugh.setText(valueOfLaugh + "%");
                textLove.setText(valueOfLove + "%");
                textMoney.setText(valueOfMoney + "%");

                if (integerList.size() < tamere.size()) {
                    do {
                        nombreAleatoire = 2 + (int) (Math.random() * (tamere.size() - 1));
                    } while (integerList.contains(nombreAleatoire));
                    System.out.println("MON CHIFFRE" + nombreAleatoire);

                    integerList.add(nombreAleatoire);
                    carteActive = tamere.get(nombreAleatoire);
                    description.setText(carteActive.getDescription());
                    portrait.setImageResource(carteActive.getImage());
                }
            }
        }) );

        }

}