/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptiondemo;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class TryCatchToInputInteger {

    static void input1() {
        boolean isValid;
        Scanner sc = new Scanner(System.in);
        int input = -1;
        do {
            isValid = true;
            try {
                System.out.print("Enter age (n >-1 && n <=100): ");
                input = Integer.parseInt(sc.nextLine());
                if (input < 0 || input > 100) {
                    throw new InvalidAge("Age must be from 0 to 100!");
                }
            } catch (NumberFormatException e) {
                isValid = false;
            } catch (InvalidAge e) {
                System.out.println(e);
            }
        } while (!isValid || input < 0 || input > 100);
        System.out.format("Your input: %d\n", input);
    }

    static void input2() {
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        int input = -1;
        do {
            try {
                System.out.print("Enter an integer (n > 0 && n <50): ");
                input = Integer.parseInt(sc.nextLine());
                cont = false;
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Integer required!");
            }
        } while (cont || input < 0 || input > 50);
        System.out.format("Your input: %d\n", input);
    }

    public static void main(String[] args) {
        input1();
//        input2();
    }
}
