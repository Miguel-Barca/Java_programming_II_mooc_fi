/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        for(Sensor sensor : this.sensors) {
            if(!sensor.isOn()) {
                return false;
            } 
        }
        return true;
    }

    @Override
    public void setOn() {
        this.sensors.stream()
                .forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if(!isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("There's a problem. Not all your sensors are set on or maybe there aren't any sensors on your database.");
        } else {
            int sum = 0;
            for(Sensor sensor : this.sensors) {
                sum += sensor.read();
            }

            this.readings.add(sum / this.sensors.size());

            return sum / this.sensors.size();
        }
    }
    
    public List<Integer> readings() {
        return this.readings;
    }

}
