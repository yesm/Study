/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.lambda;

interface CountFunc<T>{
    int func(T[] vals, T v);
}

class MyArrayOps{
    public static<T> int countMatching( T[] vals, T val){
        int count=0;
        for(T v : vals)
            count += (v == val)?1:0;
        return count;
    }
}
/**
 *
 * @author Sergey
 */
public class GenericMethodRefDemo {
    static <T> int myOp(CountFunc<T> f, T[] vals, T v){
        return f.func(vals, v);
    }
    public static void main(String[] args){
        int count;
        Integer[] ivals = {0,1,5,3,3,2,2,3,4,3,4,2,3,4,2,3,4,2,5,6,6,7};
        String[] sVals = {"one", "two", "three","one","two", "two"};
        
        count = myOp(MyArrayOps::<Integer>countMatching, ivals, 2);
        System.out.println("Number 2 in array: "+count);
    }
}
