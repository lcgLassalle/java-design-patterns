package fr.diginamic.composite;

import java.util.HashSet;
import java.util.Set;

public class TestComposite {
    public static void main(String[] args){
        // Instanciation des différents employés
        Employe directeur = new Employe("RASPEY", "Cécile", 10000.0);
        Employe architecte = new Employe("BECHKAR", "Bilel", 8000);
        Employe chefServiceBD = new Employe("RAMNEY", "Jb", 7500);
        Employe concepteur = new Employe("DOE", "Jane", 3500);
        Employe ChefServiceJD = new Employe("GUINAU", "Kevin", 7500);
        Employe leadDev = new Employe("Martin", "Paul", 3500);

        //Instanciation des Services
        Service Service1 = new Service("DSIN");
        Service Service2 = new Service("Big Data");
        Service Service3 = new Service("Java Dev");

        //Instanciation des Elements de service
        Set<IElement> dsinSet = new HashSet<>();
        Set<IElement> bdSet = new HashSet<>();
        Set<IElement> jdSet = new HashSet<>();
        dsinSet.add(directeur);
        dsinSet.add(architecte);
        bdSet.add(chefServiceBD);
        bdSet.add(concepteur);
        jdSet.add(ChefServiceJD);
        jdSet.add(leadDev);

        Service1.setElementSet(dsinSet);
        Service2.setElementSet(bdSet);
        Service3.setElementSet(jdSet);

        //Calcul des salaires par service
        System.out.println(
                "Salaires des service de l'entreprise:"+ '\n'+
                        "Salaire de " + Service1.getNom() + ": "+ Service1.calculerSalaire()+ '\n'+
                        "Salaire de " + Service2.getNom() + ": "+ Service2.calculerSalaire()+ '\n'+
                        "Salaire de " + Service3.getNom() + ": "+ Service3.calculerSalaire()
        );
    }
}
