/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringdemo;

import java.text.DecimalFormat;

/**
 *
 * @author shana
 */
public class DecimalFormatDemo {

    private static String customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        return myFormatter.format(value);
    }

    public static void main(String[] args) {
        System.out.println("Patern ###,###.###: " + customFormat("###,###.###", 123456.789));
        System.out.println("Patern ###.##: " + customFormat("###.##", 123456.789));
        System.out.println("Patern 000000.000: " + customFormat("000000.000", 123.45));
        System.out.println("Patern $###,###.###: " + customFormat("$###,###.###", 12345.67));
    }
}
