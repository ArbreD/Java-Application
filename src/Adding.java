
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<List<Integer>> value = new HashSet<List<Integer>>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(5);
        tmp.add(2);
        value.add(tmp);
        List<Integer> tmp2 = new ArrayList<>();
        tmp2.add(5);
        tmp2.add(2);
        value.add(tmp2);
        System.out.println(value);
    }
}
