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
public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("может жить в воде");
    private Description t = new Description(" и на земле и в воде ");
    
    public Amphibian(){
        print("Amphibian()");
    }
    
    @Override
    public void dispose(){
        print("dispose() в Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
