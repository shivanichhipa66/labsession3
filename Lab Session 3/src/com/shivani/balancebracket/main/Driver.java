package com.shivani.balancebracket.main;
import com.shivani.balancebracket.services.*;

public class Driver {

	public static void main(String[] args) {
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		String bracketExpression = "([[{}]]";

		Boolean result;

		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);

		if(result)
			System.out.println("The entered string has balanced Brackets");
		else
			System.out.println("The entered string do not contain Balanced Brackets");
	}


}
