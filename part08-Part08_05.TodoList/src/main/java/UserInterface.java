
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList list, Scanner scanner) {
        this.todoList = list;
        this.scanner = scanner;
                
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            switch(command) {
                case "add":
                    System.out.print("To add: ");
                    String input = scanner.nextLine();
                    this.todoList.add(input);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int number = Integer.valueOf(scanner.nextLine());
                    this.todoList.remove(number);
                    break;
                default: 
                    System.out.println("No match");
            }
        }
    }
}
