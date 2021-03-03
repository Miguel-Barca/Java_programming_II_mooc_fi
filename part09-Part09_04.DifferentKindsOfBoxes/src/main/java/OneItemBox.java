
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
public class OneItemBox extends Box {
    private ArrayList<Item> justOne;
    
    public OneItemBox() {
        this.justOne = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(this.justOne.size() < 1) {
            this.justOne.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.justOne.contains(item);
    }
    
}
