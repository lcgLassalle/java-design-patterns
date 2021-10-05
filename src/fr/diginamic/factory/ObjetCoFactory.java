package fr.diginamic.factory;

import fr.diginamic.enums.Type;
import fr.diginamic.models.EnceinteConnectee;
import fr.diginamic.models.ObjectConnecte;
import fr.diginamic.models.Tablette;
import fr.diginamic.models.TelephonePortable;

public class ObjetCoFactory {

    public static ObjectConnecte getObjetCo(Type type, int limit){
        switch (type){
            case Tablette -> {
                return new Tablette(limit);
            }
            case EnceinteConnectee -> {
                return new EnceinteConnectee(limit);
            }
            case TelephonePortable -> {
                return new TelephonePortable(limit);
            }
        }
        return null;
    }
}
