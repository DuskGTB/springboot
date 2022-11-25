package com.springapi.models;

public class jeux {
    private long id;
    private int taille;
    private String name;

    public jeux(long id, String string, String name) {
    }

    public Integer getId() {
        return (int) id;
    }

    public void setId(long index) {
        this.id = index;
    }

    public int gettaille() {
        return taille;
    }

    public void settaille(int taille) {
        this.taille = taille;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

}
