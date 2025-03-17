package org.example;

public class Calculator {
    public float divide(float teller, float noemer){
        if (noemer == 0){
            throw new ArithmeticException("kerel geen / by zero");
        }
        
        return teller/noemer;
    }

    public float add(float getal1, float getal2){
        return getal1 + getal2;
    }

    public float substract(float getal1, float getal2){
        return getal1 - getal2;
    }

    public float multiply(float getal1, float getal2){
        return getal1 * getal2;
    }
}
