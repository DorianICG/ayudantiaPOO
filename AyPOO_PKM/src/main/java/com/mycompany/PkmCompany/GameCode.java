package com.mycompany.PkmCompany;
import java.util.Scanner;

public class GameCode {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        int option;
        
        
        Scanner scan = new Scanner(System.in);
        do{
            do{
                System.out.println("""
                                   JOIN A OPTION:
                                   
                                   1.- TRAINER
                                   2.- POKEMON
                                   3.- ABILITY
                                   4.- BATTLE
                                   5.- POKEDEX
                                   0.- TERMINAR PROGRAMA
                                   
                                   """);
                option = scan.nextInt();
                if(option<0|option>5)
                {
                    System.out.println("""
                                       
                                       OPCIÓN INGRESADA NO VÁLIDA
                                       
                                       """);
                }
            }while(option<0|option>5);
            switch(option){
                    case 1 -> trainer.options();
                    case 2 -> {
                }
                    case 3 -> {
                }
                    case 4 -> {
                }
                    case 5 -> {
                }
                    case 6 -> {
                }
                    default -> {
                }
            }
                        
        }while(option!=0);
    }
       
}
