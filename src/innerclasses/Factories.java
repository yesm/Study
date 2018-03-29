/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

import static my.utils.out.Print.*;

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    @Override
    public void method1(){
        print("Implements1.method1()");
    }
    
    @Override
    public void method2(){
        print("Implements.method2()");
    }
    public static ServiceFactory factory = new ServiceFactory(){
        public Service getService(){
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service{
    @Override
    public void method1(){
        print("Implementation2.method1");
    }
    
    @Override
    public void method2(){
        print("Implementation.method2()");
    }
    
    public static ServiceFactory factory = new ServiceFactory(){
        public Service getService(){
            return new Implementation2();
        }
    };
}


/**
 *
 * @author Sergey
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service service = fact.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args){
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
