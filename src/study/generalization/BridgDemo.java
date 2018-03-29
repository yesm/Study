/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.generalization;

class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
    public T getObj(){
        return ob;
    }
}

class Gen2 extends Gen<String>{
    Gen2(String s){
        super(s);
    }
    @Override
    public String getObj(){
        System.out.println("Gen2.getObj.");
        return ob;
    }
}

class Gen3<T, V>{
    T ob1;
    V ob2;
    
    void set(V o){
        ob2 = o;
    }
    T getT(){
        return ob1;
    }
    V getV(){
        return ob2;
    }
    
}
/**
 *
 * @author Sergey
 */
public class BridgDemo {
    public static void main(String[] args){
        Gen2 g = new Gen2("Строка...");
        System.out.println(g.getObj());
        Gen3<String, String> gg = new Gen3<>();
        gg.set("Who am I?");
        System.out.println(gg.getT());
        System.out.println(gg.getV());
    }
}
