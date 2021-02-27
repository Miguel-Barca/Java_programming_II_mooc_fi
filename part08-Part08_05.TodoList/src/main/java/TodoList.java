
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
public class TodoList {
    private ArrayList <String> arrayList;

    public TodoList() {
        this.arrayList = new ArrayList<>();
    }
    
    
    public void add(String task) {
        arrayList.add(task);
    }
    
    public void print() {
        for(int i = 0; i < this.arrayList.size(); i++) {
            System.out.println( i + 1 + ": " + this.arrayList.get(i));
        }
    }
    
    public void remove(int number) {
        if(this.arrayList.size() > number ) {
            this.arrayList.remove(number - 1);
        }
    }
}
