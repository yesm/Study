/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

import my.utils.interfaces.*;
import static my.utils.out.Print.*;
/**
 *
 * @author Sergey
 */
public class Parcel5 {
    public Destination dest(String s){
        print("inner dest;");
        class PDestination implements Destination{
            private String label;
            public PDestination(String label){
                print("constructor PDestination()");
                this.label = label;
            }
            {
                print("В конструкторе по умолчанию PDestination");
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestination(s);
    }
    
    public static void main(String[] args){
        print("Parcel5.main(); Create Parcel5 object.");
        Parcel5 p = new Parcel5();
        print("Parcel5 p.dest()");
        Destination d = p.dest("Hello");
        System.out.println(d.readLabel());
    }
}
