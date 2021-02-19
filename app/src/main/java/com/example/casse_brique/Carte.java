package com.example.casse_brique;

import android.media.Image;

import java.util.HashMap;


public class Carte {
    private int id;
    private HashMap<String, Integer> influenceAnswerYes = new HashMap<>();
    private HashMap<String, Integer> influenceAnswerNo = new HashMap<>();
    private String description;
    private String image;
    private String personnage;

    public Carte(int id, int influenceArgentYes, int influenceAmourYes, int influenceDivertissementYes, int influenceSanteYes,
                 int influenceArgentNo, int influenceAmourNo, int influenceDivertissementNo, int influenceSanteNo, String description, String image, String personnage) {
        this.id = id;
        this.description = description;
        this.influenceAnswerYes.put("influenceArgent", influenceArgentYes);
        this.influenceAnswerYes.put("influenceAmour", influenceAmourYes);
        this.influenceAnswerYes.put("influenceDivertissement", influenceDivertissementYes);
        this.influenceAnswerYes.put("influenceSante", influenceSanteYes);

        this.influenceAnswerNo.put("influenceArgent", influenceArgentNo);
        this.influenceAnswerNo.put("influenceAmour", influenceAmourNo);
        this.influenceAnswerNo.put("influenceDivertissement", influenceDivertissementNo);
        this.influenceAnswerNo.put("influenceSante", influenceSanteNo);

        this.image = image;
        this.personnage = personnage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Integer> getInfluenceAnswerYes() {
        return influenceAnswerYes;
    }

    public void setInfluenceAnswerYes(HashMap<String, Integer> influenceAnswerYes) {
        this.influenceAnswerYes = influenceAnswerYes;
    }

    public HashMap<String, Integer> getInfluenceAnswerNo() {
        return influenceAnswerNo;
    }

    public void setInfluenceAnswerNo(HashMap<String, Integer> influenceAnswerNo) {
        this.influenceAnswerNo = influenceAnswerNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPersonnage() {
        return personnage;
    }

    public void setPersonnage(String personnage) {
        this.personnage = personnage;
    }
}
