/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Container {
    int quantity;
    int limit;

    public Container() {
        this.quantity = 0;
        this.limit = 100;
    }

    public void add(int number) {
        if(number >= 0) {
            if(this.quantity + number <= this.limit) {
                this.quantity += number;
            } else {
                this.quantity = this.limit;
            }
        }
    }
    
    public void remove(int number) {
        if(this.quantity - number >= 0) {
            this.quantity -= number;
        }
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLimit() {
        return limit;
    }
}
