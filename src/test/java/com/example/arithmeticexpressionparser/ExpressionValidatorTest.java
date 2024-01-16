package com.example.arithmeticexpressionparser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionValidatorTest {

    @Test
    void testIsMathExpression1() {
        String str = "1 + 2";
        assertTrue(ExpressionValidator.isMathExpression(str));
    }

    @Test
    void testIsMathExpression2() {
        String str = "cos(1) + sin(2)";
        assertTrue(ExpressionValidator.isMathExpression(str));
    }

    @Test
    void testIsMathExpression3() {
        String str = "log(1) + e^(2)";
        assertFalse(ExpressionValidator.isMathExpression(str));
    }

    @Test
    void testIsMathExpression4() {
        String str = "co(1) + si(2)";
        assertFalse(ExpressionValidator.isMathExpression(str));
    }

    @Test
    void testIsMathExpression5() {
        String str = "ln(1) + exp(2)";
        assertTrue(ExpressionValidator.isMathExpression(str));
    }

    @Test
    void testIsMathExpression6() {
        String str = "1.. + 1";
        assertFalse(ExpressionValidator.isMathExpression(str));
    }

    @Test
    void testIsMathExpression7() {
        String str = "tan(45) + 1";
        assertTrue(ExpressionValidator.isMathExpression(str));
    }

    @Test
    void isTrueMathExpression1() {
        String str = "1 ++ 1";
        assertFalse(ExpressionValidator.isTrueMathExpression(str));
    }

    @Test
    void isTrueMathExpression2() {
        String str = "(1 + 1)";
        assertTrue(ExpressionValidator.isTrueMathExpression(str));
    }

    @Test
    void isTrueMathExpression3() {
        String str = "(1 + 1))";
        assertFalse(ExpressionValidator.isTrueMathExpression(str));
    }

    @Test
    void isTrueMathExpression4() {
        String str = "((1 + 1)";
        assertFalse(ExpressionValidator.isTrueMathExpression(str));
    }

    @Test
    void isTrueMathExpression5() {
        String str = "1 ** 1";
        assertFalse(ExpressionValidator.isTrueMathExpression(str));
    }

    @Test
    void isTrueMathExpression6() {
        String str = "1 // 1";
        assertFalse(ExpressionValidator.isTrueMathExpression(str));
    }

    @Test
    void isTrueMathExpression7() {
        String str = "1 -- 1";
        assertFalse(ExpressionValidator.isTrueMathExpression(str));
    }
}