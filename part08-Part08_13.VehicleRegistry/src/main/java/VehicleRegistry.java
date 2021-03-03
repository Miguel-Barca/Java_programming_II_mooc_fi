
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(!hashmap.containsKey(licensePlate)) {
            hashmap.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return hashmap.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(!hashmap.containsKey(licensePlate)) {
            return false;
        }
        hashmap.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() { 
        for(LicensePlate licensePlate : hashmap.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for(String value : hashmap.values()) {
            if(!owners.contains(value)) {
                owners.add(value);
            }
        }
        for(String owner : owners) {
            System.out.println(owner);
        }
    }
}
