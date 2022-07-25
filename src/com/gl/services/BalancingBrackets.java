package com.gl.services;

import java.util.Stack;

public class BalancingBrackets {

	public boolean findBalance(String input) {

		boolean rtnValue = false;

		if (input.length() % 2 != 0)
			return rtnValue;

		Stack<Character> brakets = new Stack<>();

		for (int index = 0; index < input.length(); index++) {
			char readChar = input.charAt(index);

			if (readChar == '{' || readChar == '[' || readChar == '(') {
				brakets.push(readChar);
				continue;
			}

			if (brakets.isEmpty()) {
				rtnValue = false;
				break;
			}
			if (readChar == '}') {
				char popChar = brakets.pop();
				if (popChar == '{')
					rtnValue = true;
				else {
					rtnValue = false;
					break;
				}
			}

			if (readChar == ']') {
				char popChar = brakets.pop();
				if (popChar == '[')
					rtnValue = true;
				else {
					rtnValue = false;
					break;
				}
			}

			if (readChar == ')') {
				char popChar = brakets.pop();
				if (popChar == '(')
					rtnValue = true;
				else {
					rtnValue = false;
					break;
				}
			}
		}
		return rtnValue;
	}
}