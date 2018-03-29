/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.String;
import my.utils.out.Print.*;
/**
 *
 * @author Sergey
 */
public class StringBuferDemo {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sbb;
        sb.append(5);
        sbb = sb.delete(3,6);
        System.out.println(sb +" - "+sb.capacity());
        System.out.println(sbb);
        
    }
            
}
