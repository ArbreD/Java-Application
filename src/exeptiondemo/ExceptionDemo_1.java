/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeptiondemo;

/**
 *
 * @author shana
 */
public class ExceptionDemo_1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 10;
        try {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + ", ");
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
