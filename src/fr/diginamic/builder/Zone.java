package fr.diginamic.builder;

import java.util.Set;

public class Zone {
    private String name;
    private int capacite;
    private Set<Animal> animaux;

    protected Zone(String name, int capacite) {
        this.name = name;
        this.capacite = capacite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setAnimaux(Set<Animal> animaux) {
        this.animaux = animaux;
    }
}
