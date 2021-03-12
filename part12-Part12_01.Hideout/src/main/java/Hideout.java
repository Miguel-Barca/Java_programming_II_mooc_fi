
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
public class Hideout<T> {
    ArrayList<T> values;

    public Hideout() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if(this.values.isEmpty()) {
            this.values.add(toHide);
        } else {
            takeFromHideout();
            this.values.add(toHide);
        }
    }
   
    public T takeFromHideout() {
        if(this.values.isEmpty()) {
            return null;
        } else {
           T object = this.values.remove(0);
           return object; 
        }
        
    }
    
    public boolean isInHideout() {
        if(this.values.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
