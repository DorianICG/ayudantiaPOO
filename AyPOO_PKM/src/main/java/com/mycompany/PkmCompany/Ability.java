package com.mycompany.PkmCompany;

public class Ability {
    private int damage;
    private String name;
    private String accuary;

    public Ability() {
    }

    public Ability(int damage, String name, String accuary) {
        this.damage = damage;
        this.name = name;
        this.accuary = accuary;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getAccuary() {
        return accuary;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccuary(String accuary) {
        this.accuary = accuary;
    }

}
