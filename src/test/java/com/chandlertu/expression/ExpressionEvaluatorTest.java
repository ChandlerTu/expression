package com.chandlertu.expression;

import java.util.List;

import org.junit.Test;

public class ExpressionEvaluatorTest {

	@Test
	public void testToSymbols() {
		ExpressionEvaluator evaluator = new ExpressionEvaluator();
		String expression = "( TestEndTime - TestStartTime ) * 1000";
		List<String> symbols = evaluator.toSymbols(expression);
		System.out.println(symbols);
	}

}
