package fr.diginamic.builder;

import java.util.Set;

public class Zoo {
    private String name;
    private Set<Zone> zones;

    protected Zoo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZones(Set<Zone> zones) {
        this.zones = zones;
    }
}
