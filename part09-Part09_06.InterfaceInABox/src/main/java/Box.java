
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
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if(this.weight() + packable.weight() <= this.capacity) {
            this.items.add(packable);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for(Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
    
}
