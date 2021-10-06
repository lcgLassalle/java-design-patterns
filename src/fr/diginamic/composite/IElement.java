package fr.diginamic.composite;

public interface IElement {
    default double calculerSalaire() {
        return 0;
    }
}
