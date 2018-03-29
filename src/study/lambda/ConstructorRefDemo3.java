/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.lambda;

interface MyFactoryFunc<T, V>{
    T func(V v);
}

class MyClass<T>{
    T val;
    MyClass(T t){
        val = t;
    }
    T getVal(){
        return val;
    }
}

class MyStringClass{
    String val;
    MyStringClass(String s){
        val = s;
    }
    String getVal(){
        return val;
    }
}

interface ArrayCreator<T>{
    T func(int count);
}


/**
 *
 * @author Sergey
 */
public class ConstructorRefDemo3 {
    static <T, R> T classFactory(MyFactoryFunc<T,R> impl, R val){
        return impl.func(val);
    }
    public static void main(String[] args){
        MyFactoryFunc<MyClass<Integer>,Integer> mf = MyClass<Integer>::new;
        MyClass<Integer> mc = classFactory(mf,50);
        System.out.println("My integer class's value: " + mc.getVal());
        
        MyFactoryFunc<MyStringClass, String> mfs = MyStringClass::new;
        MyStringClass sc = classFactory(mfs,"Say hello!");
        System.out.println("My integer class's value: " + sc.getVal());
        
        ArrayCreator<MyStringClass[]> ac = MyStringClass[]::new;
        MyStringClass[] msarr = ac.func(3);
        msarr[0] = classFactory(mfs,"Say");
        
    }
}
