/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.lambda;
import java.lang.*;
interface IntFunc{
    int func(int a);
}
interface StringFunc{
    String func(String s);
}

interface SameFunc<T>{
    T func(T val);
}

class LambdaArgumentDemo{
    static String strOpr(SameFunc<String> f, String s){
        return f.func(s.toUpperCase());
    }
}

interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
 	static final String PREFIX = "Array is null or empty"; 
 	public EmptyArrayException() {
		super(PREFIX);
	}
}
class LambdaExceptionDemo{
    private static int internalValue = 0;
    public static void main(String[] args) throws EmptyArrayException{
        int num = 0;
        double[] values = {1.0, 2.0, 3.0, 4.0};
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();
            
            for(int i=0; i < n.length; i++)
                sum += n[i];
            internalValue = n.length;
        
            return sum / n.length;
        };
        System.out.println("Average value: "+average.func(values));
       // System.out.println("Average value: "+average.func(new double[0]));
    }
    public static int getArrayLength(){
        return internalValue;
    }
}
/**
 *
 * @author Sergey
 */
public class LambdaDemo{
    public static void main(String[] args) throws EmptyArrayException{
        SameFunc<Integer> factorial = (Integer a) -> {
            int result = 1;
            for(int i = 1; i <= a; i++){
                result = result * i;
            }
            return result;
        };
        
        for (int i=1;i<=10;i++){
            System.out.println("Factorial("+i+")="+factorial.func(i));
        }
        
        SameFunc<String> reverce = (String s) -> {
            String result = "";
            for(int i=s.length()-1; i >= 0; i--)
                result += s.charAt(i);
            return result;
        };
        System.out.println(reverce.func("Sergey"));
        
        System.out.println(LambdaArgumentDemo.strOpr(reverce, "Hello"));
        
        LambdaExceptionDemo.main(args);
        System.out.println("Array length: " + LambdaExceptionDemo.getArrayLength());
        
    }
}
