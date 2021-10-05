package fr.diginamic.models;

public class ObjectConnecte {
    private int limitVolts;

    public ObjectConnecte(int limitVolts) {
        this.limitVolts = limitVolts;
    }

    public int getLimitVolts() {
        return limitVolts;
    }

    public void setLimitVolts(int limitVolts) {
        this.limitVolts = limitVolts;
    }
}
