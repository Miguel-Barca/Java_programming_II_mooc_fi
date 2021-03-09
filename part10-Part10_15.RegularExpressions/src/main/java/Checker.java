
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Miguel
 */
public class Checker {
    List<String> days;

    public Checker() {
        this.days = new ArrayList<>();
        
    }
    
    public void addDays() {
        this.days.add("mon");
        this.days.add("tue");
        this.days.add("wed");
        this.days.add("thu");
        this.days.add("fri");
        this.days.add("sat");
        this.days.add("sun");
    }
    
    public boolean isDayOfWeek(String string) {
        addDays();
        for(String day : days) {
            if(string.matches(day)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean allVowels(String string) {
        String regex = "[a,e ,i ,o ,u]*";
        
        if(string.matches(regex)) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
    
    public boolean timeOfDay(String string) {
        String regex = "^([0-1]+[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        
        if(string.matches(regex)) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
}
