/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

import my.utils.interfaces.Contents;
/**
 *
 * @author Sergey
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i = 11;
            public int value(){return i;}
        };
    }
    
    public static void main(String[] args){
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
