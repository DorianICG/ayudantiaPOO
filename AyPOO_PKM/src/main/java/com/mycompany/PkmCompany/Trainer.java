package com.mycompany.PkmCompany;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Trainer {
    
    private String name;
    private int victories = 0;
    private Pokemon [] selectPkms = new Pokemon[3];
    private Hashtable<Integer,Trainer>trainers=new Hashtable<>();
    
    public Trainer() {
    }

    public Trainer(String name) {
        this.name = name;
    }

    public Pokemon[] getSelectPkms() {
        return selectPkms;
    }

    public String getName() {
        return name;
    }

    public int getVictories() {
        return victories;
    }

    public Hashtable<Integer, Trainer> getTrainers() {
        return trainers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public void setSelectPkms(Pokemon[] selectPkms) {
        this.selectPkms = selectPkms;
    }

    public void setTrainers(Hashtable<Integer,Trainer> trainers) {
        this.trainers = trainers;
    }
    
    public void options(){
        int option;
        Scanner scan = new Scanner(System.in);
        do{
            do{
                System.out.println("""
                                   JOIN A OPTION TO TRAINER:
                                   
                                   1.- CREATE
                                   2.- MODIFY
                                   3.- DELETE
                                   4.- PRINT
                                   0.- BACK
                                   
                                   """);
                option = scan.nextInt();
                if(option<0|option>4)
                {
                    System.out.println("""
                                       
                                       OPCIÓN INGRESADA NO VÁLIDA
                                       
                                       """);
                }
            }while(option<0|option>4);
            switch(option){
                    case 1 -> createTrainer();
                    case 2 -> {   
                    }
                    case 3 -> {
                }
                    case 4 -> printTrainer();
                    case 0 -> {
                }
                    default -> {
                }
            }
                        
        }while(option!=0);
    }

    public void createTrainer(){
        Scanner scan = new Scanner(System.in);
        String newName;
        int newID;
        do{
            newID = (int)(Math.random()*100000+1);
        }while(checkCreate(newID));
        System.out.print("Ingrese el nombre del entrenador: ");
        newName = scan.next();
        trainers.put(newID, new Trainer(newName));
    }

    public boolean checkCreate(int idFound){
        for(Map.Entry trainerling : trainers.entrySet()){
            if(trainerling.getKey()==(Object)idFound){
                return true;
            }
        }
        return false;
    }
     
    public void printTrainer(){
        
        for(Integer id: trainers.keySet()){
            Trainer trainerling = trainers.get(id);
            System.out.println("""
                               ---------------------------------------
                               ID TRAINER :"""+ id+"\n"
                              +"TRAINER :"+trainerling.name+"\n"+
                               "---------------------------------------\n");
        }
    }
}
