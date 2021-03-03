
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class StorageFacility {
    private HashMap<String , ArrayList<String>> hashmap;

    public StorageFacility() {
        this.hashmap = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        //if there's no such unit
        this.hashmap.putIfAbsent(unit, new ArrayList<>());
        
        this.hashmap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> allItems = this.hashmap.get(storageUnit);
        
        if(allItems == null) {
            return new ArrayList<>();
        }
        
        return allItems;
    }
    
    public void remove(String storageUnit, String item) {
        if(!this.hashmap.keySet().contains(storageUnit)) {
            System.out.println("There is no such storage unit!");
            return;
        }
        
        if(this.hashmap.get(storageUnit).isEmpty()) {
            this.hashmap.remove(item, this.hashmap.get(item));
        } else {
            this.hashmap.get(storageUnit).remove(item);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsNames = new ArrayList<>();
        
        //let's add units that contain items
        for(String unit : this.hashmap.keySet()) {
            if(!this.hashmap.get(unit).isEmpty()) {
                unitsNames.add(unit);
            }
        }
        
        return unitsNames;
    }
}
