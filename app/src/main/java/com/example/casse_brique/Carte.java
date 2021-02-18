package com.example.casse_brique;

import android.media.Image;

public class Carte {
    private int id, influenceArgent, influenceAmour, influenceDivertissement, influenceSante;
    private String description;
    private Image image;
    private String personnage;

    public Carte(int id, int influenceArgent, int influenceAmour, int influenceDivertissement, int influenceSante, String description, Image image, String personnage) {
        this.id = id;
        this.influenceArgent = influenceArgent;
        this.influenceAmour = influenceAmour;
        this.influenceDivertissement = influenceDivertissement;
        this.influenceSante = influenceSante;
        this.description = description;
        this.image = image;
        this.personnage = personnage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInfluenceArgent() {
        return influenceArgent;
    }

    public void setInfluenceArgent(int influenceArgent) {
        this.influenceArgent = influenceArgent;
    }

    public int getInfluenceAmour() {
        return influenceAmour;
    }

    public void setInfluenceAmour(int influenceAmour) {
        this.influenceAmour = influenceAmour;
    }

    public int getInfluenceDivertissement() {
        return influenceDivertissement;
    }

    public void setInfluenceDivertissement(int influenceDivertissement) {
        this.influenceDivertissement = influenceDivertissement;
    }

    public int getInfluenceSante() {
        return influenceSante;
    }

    public void setInfluenceSante(int influenceSante) {
        this.influenceSante = influenceSante;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getPersonnage() {
        return personnage;
    }

    public void setPersonnage(String personnage) {
        this.personnage = personnage;
    }

    public Carte(int id, int influenceArgent, int influenceAmour, int influenceDivertissement, int influenceSante, String description) {
        this.id = id;
        this.influenceArgent = influenceArgent;
        this.influenceAmour = influenceAmour;
        this.influenceDivertissement = influenceDivertissement;
        this.influenceSante = influenceSante;
        this.description = description;
    }


}
