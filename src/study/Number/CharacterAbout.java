/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Number;

/**
 *
 * @author yesm
 */
public class CharacterAbout {
    public static String WichAlpha(char ch){
       if (Character.isUpperCase(ch))
            return "прописная";
       if (Character.isLowerCase(ch))
           return "строчная";
       return " регистр буквы "+ch+" не определен";
    }
    public static String DefineChar(char ch){
        if (Character.isLetter(ch))
            return ch + " - " + WichAlpha(ch) + " буква.";
        if (Character.isDigit(ch))
            return ch + " - цифра.";
        if (Character.isWhitespace(ch))
            return ch + " - пробельный символ.";
        return ch + "Неизвестный символ";
    }
    public static void main(String[] args){
        System.out.println("Character bytes: " + Character.BYTES);
        System.out.println("Character MAX_RADIX: " + Character.MAX_RADIX);
        System.out.println("Character MIN_RADIX: " + Character.MIN_RADIX);
        System.out.println("Character MAX_VALUE: " + Character.MAX_VALUE);
        System.out.println("Character MIN_VALUE: " + Character.MIN_VALUE);
        System.out.println("Character TYPE: " + Character.TYPE);
        System.out.println();
        System.out.println("примеры символов.");
        char arr[] = {'a','b','5','A',' '};
        for (char ch : arr){
            System.out.println(DefineChar(ch));
        }
        final int NB = 8;        
        System.out.println("Цифра "+ NB +" по разным основаниям счисления");
        for(int i = Character.MIN_RADIX; i <= Character.MAX_RADIX; i++){
            System.out.print("; Основание счисления " + i +". Значение: " + Character.forDigit(NB, i));
        }
        
        for(int i = 0, j = 1; i <= 0xFFFF; i++){
            char ch = (char) i;
            if (Character.isSpaceChar(i)){
                System.out.print(i + ":"+  ch +"; ");
                j++;
            }
            if (j > 10){
                j = 0;
                System.out.println();
            }
        }
        
    }
}
