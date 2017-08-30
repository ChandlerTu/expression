package com.chandlertu.expression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionEvaluator {

	public void evaluate(String expression) {
	}

	public List<String> toSymbols(String expression) {
		List<String> symbols = new ArrayList<String>();

		StringBuilder sb = new StringBuilder();

		char[] charArray = expression.toCharArray();
		for (char c : charArray) {
			if (Character.isLetterOrDigit(c)) {
				sb.append(c);
			} else {
				if (sb.length() > 0) {
					symbols.add(sb.toString());
					sb.delete(0, sb.length());
				}

				if (!Character.isWhitespace(c)) {
					symbols.add(String.valueOf(c));
				}
			}
		}

		if (sb.length() > 0) {
			symbols.add(sb.toString());
		}

		return symbols;
	}

}
