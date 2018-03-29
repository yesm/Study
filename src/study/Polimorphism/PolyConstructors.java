/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Polimorphism;

import static my.utils.out.Print.*;

class Glyph{
    void draw() {
        print("Gliphi.draw()");
    }
    Glyph(){
        print("Its Gliph(). Before call  draw()");
        draw();
        print("Its Gliph(). After call draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int i){
        this.radius = i;
        print("RoundGlyph RoundGlyph().radius = " + radius);
    }
    
    @Override
    void draw(){
        print("RoundGlyph.draw() radius = " + radius);
    }
}
/**
 *
 * @author Sergey
 */
public class PolyConstructors {
    public static void main(String... args){
        new RoundGlyph(6);
    }
}
