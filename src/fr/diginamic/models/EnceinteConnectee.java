package fr.diginamic.models;

public class EnceinteConnectee extends ObjectConnecte{
    public EnceinteConnectee(int limitVolts) {
        super(limitVolts);
    }

    public String getname(){
        return "L'enceinte connectée";
    }
}
