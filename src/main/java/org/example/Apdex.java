package org.example;

public class Apdex {

    public double validarApdex(double satisfatorio, double toleravel, double total){
        return (satisfatorio + (toleravel / 2)) / total;
    }
}
