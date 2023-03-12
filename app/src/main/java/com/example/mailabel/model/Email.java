package com.example.mailabel.model;

import java.io.Serializable;

public class Email implements Serializable {
    public String nom;

    public String gmail;

    public int img;

    public String missatge = "Lorem ipsum dolor sit amet consectetur adipiscing elit euismod, " +
            "luctus primis habitant mus risus tempor natoque vestibulum felis, tellus hac etiam per fames torquent mollis. " +
            "Ac tortor nibh cum torquent imperdiet penatibus volutpat morbi hac iaculis nostra, " +
            "nunc cubilia tincidunt";

    public Email(String nom, String gmail, int img) {
        this.nom = nom;
        this.gmail = gmail;
        this.img = img;
    }

    public Email(String gmail) {
        this.gmail = gmail;
    }

    public Email(String gmail, String missatge) {
        this.gmail = gmail;
        this.missatge = missatge;
    }

    public Email() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMissatge() {
        return missatge;
    }

    public void setMissatge(String missatge) {
        this.missatge = missatge;
    }
}
