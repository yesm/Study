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
public class Animal extends LivingCreature {
    private final Characteristic p = new Characteristic(" имеет сердце");
    private final Description t = new Description("не растение");
    
    public Animal(){
        print("Animal()");
    }
    
    @Override
    public void dispose(){
        print("dispose в Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
