/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.generalization;

class Stats<T extends Number>{
    T[] nums;
    Stats(T[] obj){
        nums = obj;
    }
    public double average(){
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum/nums.length;
    }
    
    public boolean sameAvg(Stats<?> ob){
        return average() == ob.average();
    }
}
/**
 *
 * @author Sergey
 */
public class WildcardDemo {
    public static void main(String[] args){
        Integer[] inum = {0, 1, 2, 3, 4, 5};
        Stats<Integer> inums = new Stats<Integer>(inum);
        
        Double[] d = {1.2, 1.3, 1.4, 2.9, 4.4};
        Stats<Double> dnums = new Stats<Double>(d);
        
        if (dnums.sameAvg(inums))
            System.out.println("The same");
        else
            System.out.println("Not same.");
    }
}
