package app;

import cpplib.Calculator;

import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    Calculator calc = new Calculator();

    System.out.println("Starting Calculator");
    calc.add_to_memory(15);
    System.out.println("32 + 18 = " + calc.add(32, 18));
    System.out.println("27 - 10 = " + calc.subtract(27, 10));
    System.out.println("Square of 9 = " + calc.square(9));
    System.out.println("12 * 5 = " + calc.multiply(12, 5));
    System.out.println("Recalled from memory = " + calc.recall_memory());
  }
}