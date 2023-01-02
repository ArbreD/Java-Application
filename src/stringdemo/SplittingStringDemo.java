/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringdemo;

import java.util.StringTokenizer;

/**
 *
 * @author shana
 */
public class SplittingStringDemo {
    public static void main(String[] args) {
        String str = "I study hard. Therefore, I pass the examimation.";
        // Using the method String[] split() of the String class
        String[] strs = str.split("[., ]+");
        for (String s: strs) System.out.println(s);
        
        System.out.println("----------");
        // Using the java.util.StringTokenizer class
        StringTokenizer stk = new StringTokenizer(str, "[ ,.]");
        while(stk.hasMoreTokens()) System.out.println(stk.nextToken());
    }
}
