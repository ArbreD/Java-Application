/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personmanagement;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class Menu {

    private final String[] hints;
    private int n = 0; // current number of hints
    // create a menu with size of elements

    Menu(int size) {
        if (size < 1) {
            size = 10;
        }
        hints = new String[size];
    }

    // add a hint
    void add(String aHint) {
        if (n < hints.length) {
            hints[n++] = aHint;
        }
    }

    // get user choice
    int getChoice() {
        int result = 0;
        if (n > 0) {
            // print out hints
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + "-" + hints[i]);
            }
            System.out.print("Please select an operation: ");
            Scanner sc = new Scanner(System.in); // object for the keyboard
            result = Integer.parseInt(sc.nextLine());
        }
        return result;
    }
}
