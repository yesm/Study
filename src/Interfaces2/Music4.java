/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces2;

import my.utils.music.Note;
import static my.utils.out.Print.*;

abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument{
    @Override
    public void play(Note n){
        print("Wind.play() " + n);
    }
    @Override
    public String what(){
        return "Wind";
    }
    @Override
    public void adjust(){}
}

class Percussion extends Instrument{
    @Override
    public void play(Note n){
        print("Prcussion.play() " + n);
    }
    @Override
    public String what(){
        return "Percussion";
    }
    @Override
    public void adjust(){}
}

class Stringed extends Instrument{
    @Override
    public void play(Note n){
        print("Stringed.play() " + n);
    }
    @Override
    public String what(){ return "Stringed"; }
    @Override
    public void adjust(){}
}

class Brass extends Wind{
    @Override
    public void play(Note n){
        print("Brass.play()" + n);
    }
    
    @Override
    public String what(){ 
        return "Brass";
    }
    
    @Override
    public void adjust(){
        print("Brass adjust()");
    }
}

class Woodwind extends Wind{
    @Override
    public void play(Note n){
        print("Woodwind.play()" + n);
    }
    
    @Override
    public String what(){
        return "Woodwind";
    }
    
    @Override
    public void adjust(){
        print("Woodwind.adjust()");
    }
}
/**
 *
 * @author Sergey
 */
public class Music4 {
    static void tune(Instrument i){
        i.play(Note.C_SHARP);
    }
    static void tuneAll(Instrument[] e){
        for(Instrument instr : e){
            tune(instr);
        }
    }
    
    public static void main(String... args){
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}
