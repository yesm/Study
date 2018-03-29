/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Polimorphism;

import static my.utils.out.Print.*;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    
    public void addRef(){
        ++refcount;
    }
    
    public Shared(){
        print("Создаем " + this);
    }
    
    public String toString(){
        return "Shared " + id;
    }
    public void dispose(){
        if (--refcount == 0)
            print("Disposing "+this);
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        print("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    
    public String toString(){
        return "Compising "+id;
    }
    public void dispose(){
        print("disposing "+ this);
        shared.dispose();
    }
}
/**
 *
 * @author Sergey
 */
public class ReferenceCounting {
    public static void main(String... args){
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared),
            new Composing(shared)};
        for(Composing c : composing)
            c.dispose();
    }
}
