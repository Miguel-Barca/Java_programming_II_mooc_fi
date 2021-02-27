
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.println("First: " + firstContainer.getQuantity() + "/" 
            + firstContainer.getLimit());
            
            System.out.println("Second: " + secondContainer.getQuantity() + "/" 
            + secondContainer.getLimit());

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                firstContainer.add(amount);
            } else if(command.equals("move")) {
                if(firstContainer.getQuantity() >= amount) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    amount = firstContainer.getQuantity();
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                }
            } else if(command.equals("remove")) {
                secondContainer.remove(amount);
            } 
        }
    }

}
