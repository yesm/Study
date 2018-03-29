/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;
import static my.utils.out.Print.*;

interface Selector{
    boolean end();
    Object current();
    void next();
}
/**
 *
 * @author Sergey
 */
public class Sequince {
    private Object[] items;
    private int next = 0;
    public Sequince(int size){
        items = new Object[size];
    }
    public void add(Object obj){
        if (next < items.length)
            items[next++] = obj;
    }
    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end(){
            return i == items.length;
        }
        public Object current(){
            return items[i];
        }
        public void next(){
            if (i < items.length)
                i++;
        }
    }
    public int length(){
        return items.length;
    }
    public Selector getSelector(){
        return new SequenceSelector();
    }
    
    public static void main(String[] args) {
        Sequince s = new Sequince(20);
        for (int i = 0; i < s.length(); i++)
            s.add(Integer.toString(i));
        
        Selector selector = s.getSelector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
    }
    
}
