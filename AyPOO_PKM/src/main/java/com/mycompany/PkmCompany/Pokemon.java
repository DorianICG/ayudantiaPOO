/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PkmCompany;

/**
 *
 * @author Sala-2-11-PC25
 */
public class Pokemon {
    
    
    private TypePkm typePkm;
    private int id, hp;
    private String name;
    private Ability [] ability = new Ability[4];

    public Pokemon() {
    }

    public Pokemon(TypePkm typePkm, int id, int hp, String name) {
        this.typePkm = typePkm;
        this.id = id;
        this.hp = hp;
        this.name = name;
    }

    public TypePkm getTypePkm() {
        return typePkm;
    }

    public int getId() {
        return id;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public Ability[] getAbility() {
        return ability;
    }

    public void setTypePkm(TypePkm typePkm) {
        this.typePkm = typePkm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbility(Ability[] ability) {
        this.ability = ability;
    }
    
    public enum TypePkm{
        bug, dark, dragon, electric, fairy, fighting, fire, flying, ghost, grass, ground, ice, normal, poison, psychic, rock, steel, water
    }
}
