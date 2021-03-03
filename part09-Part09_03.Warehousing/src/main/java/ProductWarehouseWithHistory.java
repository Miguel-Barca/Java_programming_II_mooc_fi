/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }
    
    public String history() {
            return this.changeHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.changeHistory.toString());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); 
        this.changeHistory.add(super.getBalance());
    }
  
    @Override
    public double takeFromWarehouse(double amount) {
        //the amount to be returned
        double amountTaken = 0.0;
        
        if(amount > super.getBalance()) {
            amountTaken = super.getBalance();
            super.takeFromWarehouse(amountTaken);
        } else {
            amountTaken = amount;
            super.takeFromWarehouse(amount);
        }
        
        this.changeHistory.add(super.getBalance());
        return amountTaken;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
  
}
