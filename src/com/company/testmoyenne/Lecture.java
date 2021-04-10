package com.company.testmoyenne;

import java.util.Scanner;

public class Lecture {
    public static Scanner lire = new Scanner(System.in);

    public int saisirInt(){
        System.out.println("entrer un entier :");
        return lire.nextInt();
    }

    public float saisirFloat(){
        System.out.println("etrer un reel: ");
        return lire.nextFloat();
    }

    public double saisirDouble(){
        System.out.println("entrer un reel: ");
        return lire.nextDouble();
    }

    public String saisirString(){
        System.out.println("entrer un nom: ");
        return lire.next();
    }

}
