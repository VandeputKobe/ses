package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void gegevenTeller1Noemer2_dan0punt5(){
        // arrange
        Calculator calculator = new Calculator();

        //act
        float result = calculator.divide(1,2);

        //assert
        assertThat(result).isEqualTo(0.5f);
    }

    @Test
    public void gegevenTellerXNoemer0_danMathExeption(){
       
        //when 
        Throwable thrown = catchThrowable(()->{
            // arrange
            Calculator calculator = new Calculator();

            //act
            float result = calculator.divide(2,0);
        });

        // then
        assertThat(thrown)
        .isInstanceOf(ArithmeticException.class)
        .hasMessageContaining("/ by zero");
    }

    @Test 
    public void GegevenGetal15Getal11Getal9_dan36(){
        //arange
        Calculator calculator = new Calculator();

        //act
        float result = calculator.substract(15,11);
        result = calculator.multiply(result, 9);

        //assert
        assertThat(result).isEqualTo(36.0f);
    }
}
