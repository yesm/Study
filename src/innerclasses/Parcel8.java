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
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override
            public int value(){ return super.value() * 50; }
        };
    }
    public  static void main(String[] args){
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(90);
        System.out.print(w.value());
    }
}
