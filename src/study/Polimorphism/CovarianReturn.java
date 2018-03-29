/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Polimorphism;


class Grain{
    @Override
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    @Override
    public String toString(){
        return "Wheat";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    @Override
    Wheat process(){
        return new Wheat();
    }
}
/**
 *
 * @author Sergey
 */
public class CovarianReturn {
    public static void main(String... args){
        Mill m = new Mill();
        Grain g = m.process();
        System.out.print(g);
        m = new WheatMill();
        g = m.process();
        System.out.print(g);
    }
}
