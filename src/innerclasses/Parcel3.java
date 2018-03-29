/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author Sergey
 */
public class Parcel3 {
    static class Contents{
        private int i = 22;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String s){ this.label = s;}
        String readLabel(){return label;}
    }
    
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Destination d = p.new Destination("Kyle");
        Contents content = new Contents();
    }
}
