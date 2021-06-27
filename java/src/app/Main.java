package app;

import cpplib.Calculator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    File config_file = new File("/home/emumba/emumba/JavaBindings/JNI_forked/java-cpp-example/config.json");

    BufferedReader br = new BufferedReader(new FileReader(config_file));

    String st;
    String config_str = "";

    System.out.println("Reading config file");
    while ((st = br.readLine()) != null) {
      // System.out.println(st);
      config_str = config_str + st;
    }

    // System.out.println(config_str);

    GsonBuilder builder = new GsonBuilder();
    builder.setPrettyPrinting();
    Gson gson = builder.create();
    Config conf = gson.fromJson(config_str, Config.class);
        System.out.println(conf);

    Calculator calc = new Calculator();

    int a = conf.get_arg1();
    int b = conf.get_arg2();

    System.out.println("Starting Calculator");
    calc.add_to_memory(a);
    System.out.println(a + "+" + b + "=" + calc.add(a, b));
    System.out.println(a + "-" + b + "=" + calc.subtract(a, b));
    System.out.println(a + "*" + b + "=" + calc.multiply(a, b));
    System.out.println("Square of " +  a + "=" + calc.square(a));
    System.out.println("Square of " +  b + "=" + calc.square(b));
    System.out.println("Recalled from memory = " + calc.recall_memory());
  }
}

class Config {
  private int arg_1;
  private int arg_2;

  public Config() {
  }

  public int get_arg1() {
    return arg_1;
  }

  public void set_arg1(int arg1) {
    this.arg_1 = arg1;
  }

  public int get_arg2() {
    return arg_2;
  }

  public void set_arg2(int arg2) {
    this.arg_2 = arg2;
  }

  public String toString() {
    return "Config [ arg1: " + arg_1 + ", arg2: " + arg_2 + " ]";
  }
}