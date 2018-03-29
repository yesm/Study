/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.lambda;

interface StrFunc{
    String func(String str);
}

class StrOperation{
    String strReverse(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}
/**
 *
 * @author Sergey
 */
public class RefMethodDemo {
    static String strOp(StrFunc sf, String str){
        return sf.func(str);
    }
    public static void main(String[] args){
        String SourceString = "This is source string.";
        String reverseString = "";
        
        StrOperation reverseOperation = new StrOperation();
        reverseString = strOp(reverseOperation::strReverse, SourceString);
        System.out.println("Исходная строка: " + reverseString);
        System.out.println("Перевернутая строка: " + reverseString);
    }
}
