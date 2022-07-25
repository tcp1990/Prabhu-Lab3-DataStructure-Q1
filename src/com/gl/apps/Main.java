package com.gl.apps;

import com.gl.services.BalancingBrackets;

public class Main {

	public static void main(String[] args) {
		
		String braces = "([[{}]])";
		BalancingBrackets bBrac = new BalancingBrackets();
		
		if (bBrac.findBalance(braces)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
