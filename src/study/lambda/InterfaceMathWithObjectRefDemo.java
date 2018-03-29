/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.lambda;

interface MyFunc<T>{
    boolean func(T v1, T v2);
}

class HighTemp{
    private int hTemp;
    HighTemp(int ht){
        hTemp = ht;
    }
    
    public boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }
    
    public boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }    
}

/**
 *
 * @author Sergey
 */
public class InterfaceMathWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v){
        int count = 0;
        for (T val : vals) {
            if (f.func(val, v)) {
                count++;
            } else {        
            }
        }
        return count;
    }
    public static void main(String[] args){
        int count; 
        
        HighTemp[] weekDayHighs = {new HighTemp(89),new HighTemp(84),new HighTemp(72),
                                    new HighTemp(90),new HighTemp(82),new HighTemp(86),
                                    new HighTemp(89),new HighTemp(91),new HighTemp(83) };
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней, когда была максимальная температура 89: "+count);
    }
}
