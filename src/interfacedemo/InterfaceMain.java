/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author shana
 */
public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceDemo_1 obj = new Interface_1_Use();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        System.out.println("3 x 3 = " + InterfaceDemo_1.sqr(3));
    }
}
