
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        // if the word isn't in the dictionary
        dictionary.putIfAbsent(word, new ArrayList<>());
        
        
        //if there's already an entry for the word
        this.dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        // Get our translations out of the dictionary
        ArrayList<String> translations = this.dictionary.get(word);
        
        if(translations == null) {
            return new ArrayList<>();
        } 
        return translations;
    }
    
    public void remove(String word) {
        if(!this.dictionary.containsKey(word)) {
            System.out.println("There is no such word in the dictionary");
            return;
        }
        this.dictionary.remove(word, this.dictionary.get(word));
    }
}
