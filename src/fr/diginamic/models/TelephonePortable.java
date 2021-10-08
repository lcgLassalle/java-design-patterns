package fr.diginamic.models;

public class TelephonePortable extends ObjectConnecte{
    public TelephonePortable(int limitVolts) {
        super(limitVolts);
    }

    public String getname(){
        return "Le téléphone";
    }
}
