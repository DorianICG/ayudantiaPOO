/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PkmCompany;

/**
 *
 * @author Sala-2-11-PC25
 */
public class Battle {
    private Trainer winner;

    public Battle() {
    }

    public Battle(Trainer winner) {
        this.winner = winner;
    }

    public Trainer getWinner() {
        return winner;
    }

    public void setWinner(Trainer winner) {
        this.winner = winner;
    }


}
