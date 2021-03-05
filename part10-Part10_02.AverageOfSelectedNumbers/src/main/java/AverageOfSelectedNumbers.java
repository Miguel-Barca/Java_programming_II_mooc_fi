
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs =  new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");
        
        while(true) {
            String numberInput = scanner.nextLine();
            
            if(numberInput.equals("end")) {
                break;
            }
            
            inputs.add(numberInput);
        }

        double averageNegativeNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s < 0)
                .average()
                .getAsDouble();
        
        double averagePositiveNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s > 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String commandInput = scanner.nextLine();
        
        if(commandInput.equals("n")) {
            System.out.println("Average of the negative numbers:" + averageNegativeNumbers);
        }
        
        if(commandInput.equals("p")) {
            System.out.println("Average of the positive numbers: " + averagePositiveNumbers);
        }
    }
}
