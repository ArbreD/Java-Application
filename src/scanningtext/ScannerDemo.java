/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanningtext;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class ScannerDemo {

    public static void main(String[] args) {
        String S = "Zhou Shen is my favorite singer";
        Scanner sc = new Scanner(S);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        System.out.println("----------");
        String S1 = "abc 123 29.9";
        Scanner sc1 = new Scanner(S1);
        System.out.println(sc1.next());
        System.out.println(sc1.nextInt());
        System.out.println(sc1.nextDouble());
        System.out.println("----------");
        String S2 = " How    are         you!";
        Scanner sc2 = new Scanner(S2);
        String delim = "[\\s]+";
        sc2.useDelimiter(delim);
        while (sc2.hasNext()) {
            System.out.println(sc2.next());
        }
    }
}
