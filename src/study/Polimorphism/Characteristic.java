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
public class Characteristic {
    static {
        print("Static in Characteristic.");
    }
    private String s;
    public Characteristic(String s) {
        this.s = s;
        print("создание Characteristic " + s);
    }

    public void dispose(){
        print("Завершаем Dispose " + s);
    }
}
