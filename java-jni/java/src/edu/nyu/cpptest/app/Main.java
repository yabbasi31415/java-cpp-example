package edu.nyu.cpptest.app;

import edu.nyu.cpptest.cpplib.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add_to_memory(5);
		System.out.println("Add 5,6 = " + calc.add(5, 6));
		System.out.println("Subtract 15,6 = " + calc.subtract(15, 6));
		System.out.println("Square 8 = " + calc.square(8));
		System.out.println("Multiply 3,7 = " + calc.multiply(3, 7));
		System.out.println("Recalled from memory = " + calc.recall_memory());
	}
}
