/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study;

import Interfaces2.Music4;
import com.sun.prism.impl.BufferUtil;
import static my.utils.out.Print.*;

import study.Polimorphism.*;
import innerclasses.*;
        
class Inspect{
    private int i = 9;
    public int j;
    public static int x0;
    Inspect(){
      System.out.println("i="+i + "; j="+j);
      j = 37;
    }
    private static int x1 = printInit("Поле staic Inspect x1 инициалищировано.");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
    static {
        x0 = -1;
        System.out.println("Инициализировано поле static x0" + x0);
    }
    
    {
      System.out.println("Конструктор Inspect по умолчанию");
    }
}
/**
 *
 * @author Sergey
 */
public class Study extends Inspect{
    private int k = printInit("Поле Study k инициализировано.");
    public Study(){
       System.out.println("Конструктор Study");
       System.out.println("k="+k);
       System.out.println("j="+j);
    }
    {
      System.out.println("Конструктор Study по умолчанию");
    }
    public static int x2 = printInit("Поле static Study x2 инициализировано.");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
         Study s = new Study();        
        
        /*print("Polimorphism in FROG");
        Frog.main(args);*/
        
        /*ReferenceCounting.main(args);
        print("---------------------PolyConstructors----------------------------------");
        PolyConstructors.main(args);
        print("---------------------CovarianReturn----------------------------------");
        CovarianReturn.main(args);
        print("--------------------Interfaces---------------------------------------");
        Music4.main(args);
        print("--------------------innerclass Selector -----------------------------");
        Sequince.main(args);
        print("--------------------innerclass Parcel3 -----------------------------");
        Parcel3.main(args);
        print("--------------------innerclass Parcel5 -----------------------------");
        print("-------------------- безымянный внутренний класс -------------------");       
        Parcel5.main(args);
        print("--------------------innerclass Parcel8 -----------------------------");
        print("-------------------- безымянный внутренний класс с параметром -------------------");       
        Parcel8.main(args);
        print("--------------------innerclass Parcel9 -----------------------------");
        print("-------------------- безымянный базовый класс реализующий интерфейс, инициализация с параметром -------------------");       
        Parcel9.main(args);
        print("--------------------innerclass AnonymousConstructor -----------------------------");
        AnonymousConstructor.main(args);
        print("--------------------innerclass Factories реализация фабрики с безымянными классами  -----------------------------");
        Factories.main(args);
*/
        print("-------------------- многомерный массив лесенка -----------------------------");
        MultiArray.main(args);
    }    
}
