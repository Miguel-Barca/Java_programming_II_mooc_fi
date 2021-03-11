/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

/**
 *
 * @author Miguel
 */
public class TemperatureSensor implements Sensor {
    private boolean isItOn;
    
    public TemperatureSensor() {
        this.isItOn = false;
    }
    
    @Override
    public boolean isOn() {
        return this.isItOn;
    }

    @Override
    public void setOn() {
        this.isItOn = true;
    }

    @Override
    public void setOff() {
        this.isItOn = false;
    }

    @Override
    public int read() {
        if(isOn()) {
            Random random = new Random();
            return random.nextInt(30 + 30) - 30;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
