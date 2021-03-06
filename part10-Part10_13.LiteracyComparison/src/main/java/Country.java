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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getLiteracyPerc() {
        return literacyPerc;
    }

    public void setLiteracyPerc(Double literacyPerc) {
        this.literacyPerc = literacyPerc;
    }

    @Override
    public String toString() {
        return this.nameOfCountry + " (" + this.year + ")," + this.gender + ", " + this.literacyPerc; 
    }
    
    
}
