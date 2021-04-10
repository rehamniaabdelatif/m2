package com.company.testmoyenne;

public class Moyenne {
    public float notes;
    public int nomberDeNote;

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
        this.notes += note;
        this.nomberDeNote += 1;
    }

    public int affichenombreDeNote(){
        return this.nomberDeNote;
    }

    public double calculMoyenne(){
        return ( this.notes / this.nomberDeNote );
    }


}
