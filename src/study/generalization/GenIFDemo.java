/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.generalization;

interface MaxMin<T extends Comparable<T>>{
    T max();
    T min();
}

class Cmp<T extends Comparable<T>> implements MaxMin<T>{
    T[] vals;
    
    Cmp(T[] obj){
        vals = obj;
    }
    
    @Override
    public T max() {
        T var = vals[0];
        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(var) < 0)
                var = vals[i];
        return var;
    }

    @Override
    public T min() {
        T var = vals[0];
        for (int i = 1; i < vals.length; i++){
            if (vals[i].compareTo(var) > 0)
                var = vals[i];
        }
        return var;
    }
    
}
/**
 *
 * @author Sergey
 */
public class GenIFDemo {
    public static void main(String[] args){
        Integer[] nums = {0,2,3,4,6,4,23,4,34};
        Character[] chars = {'a','A','c','C','b','B'};
        
        Cmp<Integer> cmpNum = new Cmp<>(nums);
        Cmp<Character> cmpChars = new Cmp<>(chars);
        
        System.out.println("Max: "+cmpNum.max());
        System.out.println("Min: "+cmpNum.min());
        System.out.println("Max: "+cmpChars.max());
        System.out.println("Min: "+cmpChars.min());
    }
}
