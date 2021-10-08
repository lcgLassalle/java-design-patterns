package fr.diginamic.models;

public abstract class ObjectConnecte {
    private int limitVolts;

    public ObjectConnecte(int limitVolts) {
        this.limitVolts = limitVolts;
    }

    public int getLimitVolts() {
        return limitVolts;
    }

    public void setLimitVolts(int limitVolts) {
        this.limitVolts = limitVolts;
    }

    public void recharger(int volts){
        if (volts > this.limitVolts){
            System.out.println(this.getname() + "  est grillé");
        }else if (volts == this.limitVolts){
            System.out.println(this.getname() + " est en charge");

        }else{
            System.out.println("La tension est insuffisante pour recharger " + this.getname());
        }
    }

    public abstract String getname();
}
