/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanningtext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author shana
 */
public class ScanningFile {
    public static void main(String[] args) {
        File f = new File("f1.txt");
        try {
            Scanner sc = new Scanner(f);
            sc.useDelimiter("[[.]\\d\\s]+");
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
