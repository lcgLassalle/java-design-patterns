package fr.diginamic.models;

public class Tablette extends ObjectConnecte{
    public Tablette(int limitVolts) {
        super(limitVolts);
    }
    @Override
    public String getname(){
        return "La tablette";
    }
}
