
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        if(!this.products.containsKey(product)) {
            this.products.put(product, price);
            this.stockBalance.put(product, stock);
        }
        if(this.products.containsKey(product)) {
            this.products.replace(product, this.stockBalance.get(product), this.stockBalance.get(product) + stock);
        }
    }
    
    public int price(String product) {
        if(!this.products.containsKey(product)) {
            return -99;
        }
        return this.products.get(product);
    }
    
    public int stock(String product) {
        if(!this.products.containsKey(product)) {
            return 0;
        }
        
        return this.stockBalance.get(product);
    }
    
    public boolean take(String product) {
        if(!this.products.containsKey(product) || this.stockBalance.get(product) <= 0) {
            return false;
        }
        this.stockBalance.replace(product, this.stockBalance.get(product), this.stockBalance.get(product) - 1);
        return true;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }
}
