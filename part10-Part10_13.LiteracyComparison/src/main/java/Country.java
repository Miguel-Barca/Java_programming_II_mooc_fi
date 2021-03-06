/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Country {
    private String theme;
    private String ageGroup;
    private String gender;
    private String nameOfCountry;
    private int year;
    private Double literacyPerc;
    
    public Country(String theme, String ageGroup, String gender, String nameOfCountry, int year, Double literacyPerc) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.nameOfCountry = nameOfCountry;
        this.year = year;
        this.literacyPerc = literacyPerc;
    }


    public Double getLiteracyPerc() {
        return literacyPerc;
    }

    @Override
    public String toString() {
        return this.nameOfCountry + " (" + this.year + ")," + this.gender + ", " + this.literacyPerc; 
    }
    
    
}
