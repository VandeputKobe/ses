package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DoublerTest {
    @Test
    public void gegevenOperationDivideX2Y1_wanneerDoubleCalculator_danResultIs4() {
        //arange
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.divide(2f, 1f)).thenReturn(2.0f);

        Doubler doubler = new Doubler();

        //act
        float result = doubler.doubleCalculator(calculatorMock, "divide", 2, 1);

        //assert
        assertThat(result).isEqualTo(4.0f).withFailMessage("result was " + result + " but expected 4.0.");
        verify(calculatorMock).divide(2f, 1f);
    }

    @Test
    public void gegevenOperationMultiplyX2Y3_wanneerDoubleCalculator_danResultIs6(){
        //arange
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.multiply(2f, 3f)).thenReturn(6.0f);
    
        Doubler doubler = new Doubler();
    
        //act
        float result = doubler.doubleCalculator(calculatorMock, "multiply", 2, 3);
    
        //assert
        assertThat(result).isEqualTo(12.0f).withFailMessage("result was " + result + " but expected 12.0.");
        verify(calculatorMock).multiply(2f, 3f);
  }

    @Test
    public void gegevenOperationAddX2Y3_wanneerDoubleCalculator_danResultIs5(){
        //arange
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.add(2f, 3f)).thenReturn(10.0f);

        Doubler doubler = new Doubler();

         //act
        float result = doubler.doubleCalculator(calculatorMock, "add", 2, 3);

        //assert
        assertThat(result).isEqualTo(10.0f).withFailMessage("result was " + result + " but expected 10.0.");
        verify(calculatorMock).add(2f, 3f);
    }

    @Test
    public void gegevenOperationsubtractX2Y1_wanneerDoubleCalculator_danResultIs6(){
        //arange
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.substract(2f, 1f)).thenReturn(2.0f);

        Doubler doubler = new Doubler();

         //act
        float result = doubler.doubleCalculator(calculatorMock, "substract", 2, 1);

        //assert
        assertThat(result).isEqualTo(2.0f).withFailMessage("result was " + result + " but expected 2.0.");
        verify(calculatorMock).substract(2f, 1f);
    }
}