/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

import static my.utils.out.Print.*;

abstract class Base{
    public Base(int i){
        print ("Конструктор Abstract Base , i=" + i++);
    }
    abstract public void f();
}
/**
 *
 * @author Sergey
 */
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i){
            { print("Инициализация экземпляра " + i); }
            @Override
            public void f(){
                print(" Безымянный f()" + i);
            }
        };
    }
    
    public static void main(String[] args){
        Base b = getBase(6);
        b.f();
    }
}
