/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringdemo;

/**
 *
 * @author shana
 */
public class PrintWithFormat {

    public static void main(String[] args) {
        String S = "Hello";
        int i = 5;
        long l = 58;
        float f = 7.2f;
        double d = 8.9;
        boolean b = true;
        char c = 'A';
        System.out.format("%s,%2d,%4X,%5.2f,%4.2f,%b,%3c\n", S, i, l, f, d, b, c);
        // format: % + [order start from 1]$ + [number of space] [type]
        System.out.format("%3$5b,%1$3d,%2$6s\n", i, S, b);
    }
}
