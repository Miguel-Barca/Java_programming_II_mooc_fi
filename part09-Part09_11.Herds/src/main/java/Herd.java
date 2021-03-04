
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Herd implements Movable {
   private List<Movable> listOfOrganisms;

    public Herd() {
        this.listOfOrganisms = new ArrayList<>();
    }
   
    public void addToHerd(Movable movable) {
        this.listOfOrganisms.add(movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for(Movable organism : this.listOfOrganisms) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String string = "";
        if(this.listOfOrganisms.isEmpty()) {
            string +="No organisms found!";
        } 
        for(Movable organism : this.listOfOrganisms) {
                string +=  organism.toString() + "\n";
        }
        
        return string;
    }
    
    
}
