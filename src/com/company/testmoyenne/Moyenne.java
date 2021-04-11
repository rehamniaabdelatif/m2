package com.company.testmoyenne;

import java.util.ArrayList;

public class Moyenne {
    private float notes;
    private int nomberDeNote;

    public void initialise(){
        notes = 0;
        nomberDeNote = 0;
    }

    public Moyenne(){
        notes = 0;
        nomberDeNote = 0;
    }

    public Moyenne(float a){
        this.notes = a;
        this.nomberDeNote = 0;
    }

    public Moyenne(float b, int c){
        this.notes = b;
        this.nomberDeNote = c;
    }

    public void ajoutNote(double note){
        this.note.add(note);
        this.notes += note;
        this.nomberDeNote += 1;
    }

    public int afficheNombreDeNote(){
        return this.nomberDeNote;
    }

    public double calculMoyenne(){
        return ( this.notes / this.nomberDeNote );
    }

// start project from here
    private ArrayList<Double> note = new ArrayList();

    public double maxNotes(){
        Double maxNote = note.get(0);

        for (int i = 1; i < note.size(); i++)
            if ( maxNote < note.get(i) )
                maxNote = note.get(i);

        return maxNote;
    }

    public void triNotes(){
        double swap;
        for (int i = 0; i < (note.size()-1); ++i){

            for (int j = 0; j < (note.size()-i-1); j++){

                if (note.get(j+1) < note.get(j)){
                    swap = note.get(j);
                    note.set(j, note.get(j+1));
                    note.set(j+1, swap);
                }

            }
        }
    }




}
