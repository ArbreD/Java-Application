/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personmanagement;

/**
 *
 * @author shana
 */
public class ManagementProgram {

    public static void main(String[] args) {
        Menu menu = new Menu(6);
        menu.add("Add new person");
        menu.add("Update a person");
        menu.add("Remove a person");
        menu.add("List");
        menu.add("List without sort");
        menu.add("Quit");
        int choice;
        PersonList list = new PersonList(3);
        do {
            System.out.println("\t\t\t*** PERSON MANAGER ***");
            choice = menu.getChoice();
            if (choice == 6) {
                System.out.println("\tHave A Nice Day!");
                break;
            }
            switch (choice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.update();
                    break;
                case 3:
                    list.remove();
                    break;
                case 4:
                    list.sort();
                    break;
                case 5:
                    list.print();
                    break;
            }
        } while (choice >= 1 && choice <= 6);
    }
}
