package fr.diginamic.composite;

import java.util.Set;

public class Service implements IElement{
    private String nom;
    private Set<IElement> elementSet;

    public Service(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<IElement> getElementSet() {
        return elementSet;
    }

    public void setElementSet(Set<IElement> elementSet) {
        this.elementSet = elementSet;
    }

    @Override
    public double calculerSalaire() {
        double salaireTotal = 0.0;
        for (IElement e:elementSet
             ) {
            salaireTotal+= e.calculerSalaire();
        }
        return salaireTotal;
    }
}
