/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.Number;

class FloatDemo{
    public static void Print(Float f){
        System.out.println("Значение Float: "+f.toString());
        System.out.print("compare("+f+", 5.6) : ");
        System.out.println(Float.compare(f, new Float(5.6)));
        System.out.print("compareTo("+7.2+") : ");
        System.out.println(f.compareTo(new Float(7.2)));
        System.out.print("f.doubleValue():");
        System.out.println(f.doubleValue());
        System.out.print("f.floatValue():");
        System.out.println(f.floatValue());
        System.out.print("f.equals(new Double(3.7))):");
        System.out.println(f.equals(new Float(3.7)));
        System.out.print("floatToIntBits(this.f):");
        System.out.println(Float.floatToIntBits(f));
        System.out.print("Float.floatToRawIntBits(3.7): ");
        System.out.println(Float.floatToRawIntBits(new Float(3.7)));        
        System.out.print("f.hashCode():");
        System.out.println(f.hashCode());
        System.out.print("intBitsToFloat(1080872141):");
        System.out.println(Float.intBitsToFloat(1080872141));
        System.out.print("intBitsToFloat(1076677837):");
        System.out.println(Float.intBitsToFloat(1076677837));
        System.out.print("intValue():");
        System.out.println(f.intValue());
        System.out.print("isInfinite():");
        System.out.println(f.isInfinite());
        System.out.print("Float.isInfinite(new Float(334324234234):");
        System.out.println(Float.isInfinite(new Float(334324234234.0)));
        System.out.print("Float.toHexString("+f+"):");
        System.out.println(Float.toHexString(f));
        System.out.print("f.longValue(): ");
        System.out.println(f.longValue());
        System.out.print("Float.parseFloat('43.44'):");
        System.out.println(Float.parseFloat("43.44"));
        System.out.println(1/0.0);
        System.out.println(new Double(1.0));
        System.out.println(new Byte((byte)77).doubleValue());
        System.out.println("Byte size: " + Byte.SIZE);
        System.out.println("Short size: " + Short.SIZE);
        System.out.println("Integer size: " + Integer.SIZE);
        System.out.println("Long.SIZE:"+Long.SIZE);
        System.out.println("Float size: " + Float.SIZE);
        System.out.println("Double size: " + Double.SIZE);
        System.out.println(Long.highestOneBit(8));
        System.out.println(Long.lowestOneBit(7));
        System.out.println(Long.parseLong("0111", 2));
        System.out.println(Integer.toUnsignedString(15,2));
    }
}
/**
 *
 * @author Sergey
 */
public class NumberDemo {
    public static void main(String[] args){
        FloatDemo.Print(new Float(3.7));
        
          byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};
        String value = new String(byteArray);
        System.out.println(value);
    }
}
