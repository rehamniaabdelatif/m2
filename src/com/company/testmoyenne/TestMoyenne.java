package com.company.testmoyenne;

public class TestMoyenne {
    public static void main(String[] args){
        int j;
        double y;
        float k = 2.5F;
        int N = 5;// N est le nombre max des notes.
        Lecture L = new Lecture(); //declaration et creation de l'objet L
        Moyenne M1 = new Moyenne();
        Moyenne M2 = new Moyenne(k);
        for (j = 0; j <= N-1; j++){
            y = L.saisirDouble();
            M1.ajoutNote(y);
            M2.ajoutNote(y);
        }

        System.out.println("la Moyenne est : "+ M1.calculMoyenne() );
        int A = M1.afficheNombreDeNote();
        System.out.println("le nombre de note : " + A);
        System.out.println(M1.maxNotes());


    }
}
