package fr.diginamic.factory;

import fr.diginamic.enums.Type;
import fr.diginamic.models.ObjectConnecte;

public class TestFactory {
    public static void main(String[] arg){
        ObjectConnecte objet1 = ObjetCoFactory.getObjetCo(Type.Tablette, 55);
        ObjectConnecte objet2 = ObjetCoFactory.getObjetCo(Type.EnceinteConnectee, 80);
        ObjectConnecte objet3 = ObjetCoFactory.getObjetCo(Type.TelephonePortable, 70);

        objet1.recharger(42);
        objet2.recharger(80);
        objet3.recharger(90);
    }
}
