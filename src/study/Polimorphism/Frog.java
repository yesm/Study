/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Polimorphism;

import static my.utils.out.Print.*;
/**
 *
 * @author Sergey
 */
public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Квакает");
    private Description t = new Description("ест жуков и мелких насекомых");
    
    public Frog(){
        print("Frog()");
    }
    
    @Override
    public void dispose(){
        print("dispose() in Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    
    public static void main(String... args){
        Frog f = new Frog();
        print("Пока!");
        f.dispose();
    }
}
