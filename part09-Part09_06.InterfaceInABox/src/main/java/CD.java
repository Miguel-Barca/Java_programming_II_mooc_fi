/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class CD implements Packable {
    private String artist;
    private String nameOfTheCd;
    private int year;
    private double weight;

    public CD(String artist, String nameOfTheCd, int year) {
        this.artist = artist;
        this.nameOfTheCd = nameOfTheCd;
        this.year = year;
        this.weight  = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.nameOfTheCd + " (" + this.year + ")";
    }

    
    
}
