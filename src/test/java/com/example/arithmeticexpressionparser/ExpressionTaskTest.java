package com.example.arithmeticexpressionparser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTaskTest {

    @Test
    void testGetText1() {
        ExpressionTask expressionTask = new ExpressionTask("           1         ");
        assertEquals("1", expressionTask.getText());
    }

    @Test
    void testGetText2() {
        ExpressionTask expressionTask = new ExpressionTask("(    1         )");
        assertEquals("( 1 )", expressionTask.getText());
    }

    @Test
    void testCalculate1() {
        ExpressionTask expressionTask = new ExpressionTask("sin(0)+5*2 - 19/3");
        assertEquals(3.666666666666667, expressionTask.calculate());
    }

    @Test
    void testCalculate2() {
        ExpressionTask expressionTask = new ExpressionTask("sin(1.57079632679) + 1 * 1");
        assertEquals(2, expressionTask.calculate());
    }

    @Test
    void testCalculate3() {
        ExpressionTask expressionTask = new ExpressionTask("sin(0.52359877559) + 0.5");
        assertEquals(0.999999999992813, expressionTask.calculate());
    }

    @Test
    void testCalculate4() {
        ExpressionTask expressionTask = new ExpressionTask("exp(3)+2");
        assertEquals(22.085536923187668, expressionTask.calculate());
    }

    @Test
    void testCalculate5() {
        ExpressionTask expressionTask = new ExpressionTask("tan(3.14159265359/4)");
        assertEquals(1.0000000000001035, expressionTask.calculate());
    }
}