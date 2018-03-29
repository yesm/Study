/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Polimorphism;

import java.util.Arrays;
import static my.utils.out.Print.print;

/**
 *
 * @author Sergey
 */
public class MultiArray {
    private final static int NUMBERITEMS = 10;
    public static void main(String args[]){        
        int ar[][] = new int[NUMBERITEMS][];        
        
        // инициализация
        for(int i=0; i < NUMBERITEMS; i++)
            ar[i] = new int[i+1];

        int k = 0;
        for(int j=0; j < NUMBERITEMS; j++)
          for(int i=0; i < j+1; i++)
            ar[j][i] = ++k;
        
        int i=0;
        for(int[] x : ar){
            System.out.println();
            System.out.print(++i + ": ");
            for(int xx : x){
                System.out.print(xx+" ");
            }            
        }        
        //System.out.println(ar[0][0]);
    }
}
