
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput == 0) {
                if(numbers.size() == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(avgPositiveNumbers(numbers));
                break;
            } else { 
                numbers.add(userInput);
            }
        }
    }
    
    public static double avgPositiveNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        int positiveNumbers = 0;
        
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 0) {
                sum += numbers.get(i);
                positiveNumbers++;
            }
        }
        return 1.0 * sum / positiveNumbers;
    }
}
