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
public class Person {

    private String code = "";
    private String name = "";
    private int age = 0;

    Person() {
    }

    Person(String c, String n, int a) {
        code = c;
        name = n;
        age = a > 0 ? a : 0;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age > 0 ? age : 0;
    }

    @Override
    public String toString() {
        return "Person{" + "code=" + code + ", name=" + name + ", age=" + age + '}';
    }

//    public void input() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the person's code: ");
//        code = sc.nextLine().toUpperCase();
//        System.out.print("Enter the person's name: ");
//        name = sc.nextLine();
//        System.out.print("Enter the person's age: ");
//        int tmpAge = Integer.parseInt(sc.nextLine());
//        age = tmpAge > 0 ? tmpAge : 0;
//    }
}
