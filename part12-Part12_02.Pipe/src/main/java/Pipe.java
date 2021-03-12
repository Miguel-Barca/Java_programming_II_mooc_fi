
import java.util.ArrayList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Pipe<T> {

    ArrayList<T> queue;
    
    public Pipe() {
        this.queue = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.queue.add(value);
    }

    public boolean isInPipe() {
        if(this.queue.isEmpty()) {
            return false;
        }
        return true;
    }

    public T takeFromPipe() {
        if(this.queue.isEmpty()) {
            return null;
        } else {
           T removedItem = this.queue.remove(0);
           return removedItem; 
        }
    }
    
}
