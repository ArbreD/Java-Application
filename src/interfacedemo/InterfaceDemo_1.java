/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author shana
 */
public interface InterfaceDemo_1 {

    final int MAX = 100; // constant
    int n = 0; // fields in interface must be initialized
    static public int sqr(int x) { return x*x;}
    public abstract void m1(); // abstract methods
    abstract public void m2();
    void m3(); // default methods
    void m4();
}

class Interface_1_Use implements InterfaceDemo_1{
    @Override
    public void m1() {
        System.out.println("M1");
    }
    
    @Override
    public void m2() {
        System.out.println("M2");
    }
    
    // Default methods of an interface must be overridden 
    // as public methods in concrete classes
    @Override
    public void m3() {
        System.out.println("M3");
    }
    
    @Override
    public void m4() {
        System.out.println("M4");
    }
}
