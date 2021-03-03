
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.removeAll(history);
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        double maxValue = 0;
        if(this.history.isEmpty()) {
            return maxValue;
        }
        
        for(int i = 0; i < this.history.size(); i++) {
            if(this.history.get(i) > maxValue) {
                maxValue = this.history.get(i);
            }
        }
        return maxValue;
    }
    
    public double minValue() {
        
        if(!this.history.isEmpty()) {
            double minValue = this.history.get(0);
            
            for(int i = 0; i < this.history.size(); i++) {
                if(this.history.get(i) < minValue) {
                    minValue = this.history.get(i);
                }
            }
            
            return minValue;
        }
        
        return 0;
    }
    
    public double average() {
        if(!this.history.isEmpty()) {
            double cumulator = 0.0;
            for(int i = 0; i < this.history.size(); i++) {
                cumulator += this.history.get(i);
            }
            return cumulator / this.history.size();
        }
        
        return 0;
    }
}
