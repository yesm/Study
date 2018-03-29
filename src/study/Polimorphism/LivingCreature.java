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
public class LivingCreature {
    private Characteristic p = new Characteristic("Живое существо1");
    private Description t = new Description("Обычное живое существо");
    public LivingCreature(){
        print("LivingCreature()");
    }
    
    public void dispose(){
        print("dispose в LivingCreature.");
        t.dispose();
        p.dispose();
    }
}
