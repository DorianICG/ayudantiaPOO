/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PkmCompany;
import java.util.ArrayList;
/**
 *
 * @author Sala-2-11-PC25
 */
public class Pokedex {
    private int TotalPkm;
    private ArrayList <Pokemon> pkms = new ArrayList<>();

    public Pokedex() {
    }

    public Pokedex(int TotalPkm) {
        this.TotalPkm = TotalPkm;
    }

    public int getTotalPkm() {
        return TotalPkm;
    }

    public ArrayList <Pokemon> getPkms() {
        return pkms;
    }

    public void setTotalPkm(int TotalPkm) {
        this.TotalPkm = TotalPkm;
    }

    public void setPkms(ArrayList <Pokemon> pkms) {
        this.pkms = pkms;
    }

}
