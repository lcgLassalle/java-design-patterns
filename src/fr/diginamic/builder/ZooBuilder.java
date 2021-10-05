package fr.diginamic.builder;

import java.util.HashSet;
import java.util.Set;

public class ZooBuilder {
    private Zoo zoo;
    private Zone zone;
    private Animal animal;
    private Set<Zone> buildZones;
    private Set<Animal> buildAnimaux;

    public ZooBuilder(String zooname) {
        this.zoo = new Zoo(zooname);
    }

    public ZooBuilder appendZone(String zonename, int capacity){
        this.zone = new Zone(zonename, capacity);
        this.buildZones = new HashSet<>();
        this.buildZones.add(this.zone);
        this.zoo.setZones(this.buildZones);
        return this;
    }

    public ZooBuilder appendAnimal(String animalName){
        this.animal = new Animal(animalName);
        this.buildAnimaux = new HashSet<>();
        this.buildAnimaux.add(animal);
        this.zone.setAnimaux(this.buildAnimaux);
        return this;
    }
}
