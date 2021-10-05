package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigLoad {
    private  ResourceBundle configuration = null;

    private ConfigLoad(){
        configuration = ResourceBundle.getBundle("configuration");
    };
    private static ConfigLoad instance = null;

    public static ConfigLoad getConfigLoad(){
        if (instance==null){
           instance = new ConfigLoad();

        }
        return instance;
    }
}

