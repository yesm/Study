/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Polimorphism;

import static my.utils.out.Print.*;
/**
 *
 * @author Sergey
 */
public class Description {
    private String s;
    public Description(String s){
        this.s = s;
        print("Создаем Description " + s);
    }
    public void dispose(){
        print("Удаляем Description " + s);
    }
}
