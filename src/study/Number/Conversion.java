/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Number;
import java.io.*;

interface Conv <T extends Number> {
    String convert(T v, int i);
}

class ParceNumber{
    private <T extends Number> void PrintConversation(Conv<T> func,T val,int tp, String note){
        System.out.println(note + " " + func.convert(val,tp));
        
    }
    public void Engine() throws IOException{
        BufferedReader  buf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Conv<Long> longConv = Long::toString;
        
        do{
            str = buf.readLine();
            try{
                PrintConversation(longConv,new Long(str),2,"Эквивалент по основанию 2");
                PrintConversation(longConv,new Long(str),8,"Эквивалент по основанию 8");
                PrintConversation(longConv,new Long(str),16,"Эквивалент по основанию 16");
            }catch(NumberFormatException e){
                try{
                    //PrintConversation(Double::toString,new Double(str),2,"Эквивалент по основанию 2");
                    //PrintConversation(Double::toString,new Double(str),8,"Эквивалент по основанию 8");
                    //PrintConversation(Double::toString,new Double(str),16,"Эквивалент по основанию 16");
                    System.out.println(Double.toHexString(new Double(str)));
                }catch(NumberFormatException ee){
                    System.out.println("Неверныйй формат");
                }
            }
        }while(str.compareTo("0") != 0);
    }
}
/**
 *
 * @author Sergey
 */
public class Conversion {
    public static void main(String[] args){
        try{
            new ParceNumber().Engine();
        }catch(IOException e){
            System.out.println("Ощибка распарсивания");
        }
    }
}
