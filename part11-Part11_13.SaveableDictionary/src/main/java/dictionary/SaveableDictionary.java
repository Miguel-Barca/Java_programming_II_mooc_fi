/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class SaveableDictionary {
    private Map <String, String> dictionary;
    private String nameOfTheFile;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.nameOfTheFile = file;
    }
    
    public boolean load() {
       try {
            Scanner fileReader = new Scanner(Paths.get(this.nameOfTheFile));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
            return true;
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
            
    }
    
    public boolean save() {
       try {
            PrintWriter writer = new PrintWriter(this.nameOfTheFile);
            List<String> allreadySaved = new ArrayList<>();

            this.dictionary.keySet().stream().forEach(key -> {
                if (allreadySaved.contains(key)) {
                    return;
                }
                writer.println(key + ":" + this.dictionary.get(key));

                allreadySaved.add(key);
                allreadySaved.add(this.dictionary.get(key));
            });

            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }
    
    public void add(String words, String translation) {
        if(!this.dictionary.keySet().contains(words)) {
            this.dictionary.put(words, translation);
        }
    }
    
    public String translate(String word) {
        for(String key : this.dictionary.keySet()) {
            if(key.equals(word)) {
                return this.dictionary.get(key);
            } else if(this.dictionary.get(key).equals(word)) {
                return key;
            }
        }
        return null;
    }
    
    public void delete(String word) {
        List<String> listOfKeys = new ArrayList<>();
        
        //let's first collect our keys to be removed
        this.dictionary.keySet().forEach((key) -> {
            if(key.equals(word)) {
                listOfKeys.add(key);
            } else if(this.dictionary.get(key).equals(word)) {
                listOfKeys.add(key);
            }
        });
        
        //now remove. This is to avoid ConcurrentModificationException exception
        for(String key : listOfKeys) {
            this.dictionary.remove(key);
        }
    }
}
