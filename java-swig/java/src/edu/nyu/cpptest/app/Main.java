package edu.nyu.cpptest.app;
import java.util.logging.*;

import edu.nyu.cpptest.cpplib.Calculator;

public class Main {
	public static void main(String[] args) {

		Logger logger = Logger.getLogger(Main.class.getName());
		logger.setLevel(Level.INFO);

		ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.INFO);
        logger.addHandler(handler);

		Calculator calc = new Calculator();

		logger.log(Level.INFO, "Starting Calculator");
		calc.add_to_memory(15);

		logger.log(Level.FINE, "32 + 18 = " + calc.add(32, 18));
		logger.log(Level.FINE, "27 - 10 = " + calc.subtract(27,10));
		logger.log(Level.FINE, "Square of 9 = " + calc.square(9));
		logger.log(Level.FINE, "12 * 5 = " + calc.multiply(12,5));
		logger.log(Level.FINE, "Recalled from memory = " + calc.recall_memory());
	}
}
