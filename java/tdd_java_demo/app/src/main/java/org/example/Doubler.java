package org.example;

public class Doubler {

  public float doubleCalculator(Calculator calculator, String operation, float x, float y) {
    if (operation == "divide") {
      return calculator.divide(x, y) * 2;
    } 
    else if (operation == "add"){
      return calculator.add(x,y) * 2;
    }
    else if (operation == "multiply"){
      return calculator.multiply(x, y) * 2;
    }
    else if (operation == "substract"){
      return calculator.substract(x, y) * 2;
    }
    else {
      throw new UnsupportedOperationException("Wrong calculator operation selected");
    }
  }
}