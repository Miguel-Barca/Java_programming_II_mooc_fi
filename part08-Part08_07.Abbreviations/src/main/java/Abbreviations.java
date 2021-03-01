
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
public class Abbreviations {
    HashMap<String, String> hashMap;

    public Abbreviations() {
        this.hashMap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.hashMap.put(sanitizedString(abbreviation), sanitizedString(explanation));
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if(hashMap.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        if(hashMap.containsKey(abbreviation)) {
            return hashMap.get(abbreviation);
        } else {
            return null;
        }
    }
    
     public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
