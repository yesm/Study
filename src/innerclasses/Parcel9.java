/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;
import my.utils.interfaces.Destination;
/**
 *
 * @author Sergey
 */
public class Parcel9 {
    protected Destination destination(final String dest){
        return new Destination(){
            private String label = dest;
            @Override
            public String readLabel(){ return label;} 
    };
    }
    
    public static void main(String[] args){
       Parcel9 p = new Parcel9();
       Destination d = p.destination("Hllow Sergey");
       System.out.println(d.readLabel());
    }
            
}
