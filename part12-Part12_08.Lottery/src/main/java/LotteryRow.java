
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Miguel
 */
public class LotteryRow {

    private ArrayList<Integer> numbers;

    /**
     *
     */
    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    /**
     *
     */
    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful (there are no repeats)
        Random randomizer = new Random();
        
        int randomNumber;
        
        while(this.numbers.size() < 7) {
            randomNumber = randomizer.nextInt(41 - 1) + 1;
            if(!this.numbers.contains(randomNumber)) {
                this.numbers.add(randomNumber);
            }    
        }
        
    }

    /**
     *
     * @param number
     * @return
     */
    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if(!this.numbers.contains(number)) {
          return false;  
        }
        
        return true;
    }
}

