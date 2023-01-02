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
public class PersonList {

    private Person[] list = null;
    private int count = 0; // current number of people

    PersonList(int size) {
        if (size < 1) {
            size = 1;
        }
        list = new Person[size];
    }

    // find position of a known-code person
    int find(String code) {
        for (int i = 0; i < count; i++) {
            if (list[i] == null) {
                continue;
            }
            if (code.equals(list[i].getCode())) {
                return i;
            }
        }
        return -1;
    }

    void add() {
        if (count == list.length) {
            System.out.println("\tList is full!");
            return;
        }
        //Entering new person details
        String newCode, newName;
        int newAge;
        Scanner sc = new Scanner(System.in);
        int pos; // variable for checking existing person by code
        do {
            System.out.print("Enter the person's code: ");
            newCode = sc.nextLine().toUpperCase();
            pos = find(newCode);
            if (pos >= 0) {
                System.out.println("\tPerson with this code existed!");
            }
        } while (pos >= 0);
        System.out.print("Enter the person's name: ");
        newName = sc.nextLine();
        System.out.print("Enter the person's age: ");
        int tmpAge = Integer.parseInt(sc.nextLine());
        newAge = tmpAge > 0 ? tmpAge : 0;
        list[count++] = new Person(newCode, newName, newAge);
        System.out.println("\tNew person has been added.");
    }

    void remove() {
        if (count == 0) {
            System.out.println("\tEmpty list!");
            return;
        }
        String removedCode;
        // Entering code of person to remove
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code of removed person: ");
        removedCode = sc.nextLine().toUpperCase();
        int removedPos = find(removedCode);
        if (removedPos == -1) {
            System.out.println("\tThis person does not existed!");
            return;
        }
        // Shift up hte remainder of the list
        for (int i = removedPos; i < count; i++) {
            if (i == count - 1) {
                list[i] = null;
                break;
            }
            list[i] = list[i + 1];
        }
        --count;
        System.out.println("\tThe person with code " + removedCode + " was removed.");
    }

    void remove2() {
        if (count == 0) {
            System.out.println("\tEmpty list!");
            return;
        }
        String removedCode;
        // Entering code of person to remove
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code of removed person: ");
        removedCode = sc.nextLine().toUpperCase();
        int removedPos = find(removedCode);
        if (removedPos == -1) {
            System.out.println("\tThis person does not existed!");
            return;
        }
        // Shift up hte remainder of the list
        for (int i = removedPos; i < count - 1; i++) {
            list[i] = list[i + 1];
        }
        --count;
        System.out.println("\tThe person with code " + removedCode + " was removed.");
    }

    void update() {
        if (count == 0) {
            System.out.println("\tEmpty list!");
            return;
        }
        String code;
        // Entering code of person to remove
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code of updated person: ");
        code = sc.nextLine().toUpperCase();
        int updatedPos = find(code);
        if (updatedPos == -1) {
            System.out.println("\tThis person does not existed!");
            return;
        }
        System.out.print("Enter the person's name: ");
        String newName = sc.nextLine();
        System.out.print("Enter the person's age: ");
        int tmpAge = Integer.parseInt(sc.nextLine());
        int newAge = tmpAge > 0 ? tmpAge : 0;
        list[updatedPos].setName(newName);
        list[updatedPos].setAge(newAge);
        System.out.println("\tThe person with code " + code + " was updated.");
    }

    void print() {
        if (count == 0) {
            System.out.println("\tEmpty list!");
            return;
        }
        System.out.println("\t\tLIST OF PERSONS:");
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                continue;
            }
            System.out.println((i + 1) + "-" + list[i].toString());
        }
    }

    void sort() {
        if (count == 0) {
            System.out.println("\tEmpty list!");
            return;
        }
        // Bubble sort based on person's age
        Person[] copyList = new Person[3];
        System.arraycopy(list, 0, copyList, 0, list.length);
        for (int i = 0; i < list.length; i++) {
            boolean isSwaped = false;
            for (int j = 0; j < count - i - 1; j++) {
                if (list[j].getAge() > list[j + 1].getAge()) {
                    Person tmp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = tmp;
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                break;
            }
        }
        print();
        list = copyList;
    }
}
