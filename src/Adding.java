/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shana
 */

// Pass args to main method: Right click on this project -> Properties -> Run
// -> choose Main Class Adding, pass arguments 24.5 5.4
public class Adding {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        System.out.println("Sum = " + (x+y));
    }
}
