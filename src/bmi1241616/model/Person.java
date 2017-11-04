/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi1241616.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author 1241616
 */
public class Person {
    
    private StringProperty measurement; //metric or english
    private BooleanProperty pregnant;
    private DoubleProperty weight;
    private DoubleProperty height;

    public Person()
    {
        this("", false, 0.0, 0.0);
    }
    public Person(final String measurement, final Boolean pregnant, final double weight, final double height) {
        this.measurement = new SimpleStringProperty(measurement);
        this.pregnant = new SimpleBooleanProperty(pregnant);
        this.weight = new SimpleDoubleProperty(weight);
        this.height = new SimpleDoubleProperty(height);
    }
    
    
}
