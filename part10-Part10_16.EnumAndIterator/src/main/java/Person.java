/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Person {
    private String name;
    private Education educationDegree;

    public Person(String name, Education educationDegree) {
        this.name = name;
        this.educationDegree = educationDegree;
    }

    @Override
    public String toString() {
        return name + ", " + educationDegree;
    }

    public Education getEducation() {
        return educationDegree;
    }
    
    
}
