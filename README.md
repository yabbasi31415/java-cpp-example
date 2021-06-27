### Example of using C++ code from Java
===================================

Forked from [Java-Cpp example](https://github.com/ychess/java-cpp-example.git)

This repository contains an example of calling a simple C++ library from Java code.

The example library doesn't do anything but contains a class, Calculator, forcing us to support C++ (and not just plain C).

CMake is used to build this. The project is supposed to be portable to all major platforms.

A JNI wrapper is used, documented below. Each one achieves the same goal, which is using [this C++ class](cpplib/src/Calculator.cpp) from [Java code](java/src/app/Main.java).

JNI
---

This examples uses JNI directly, without auto-generation. The `Calculator` class in Java code just declares its methods as being "native", they are provided by the dynamic library.

### To run the executable

<!-- $ `java -cp java/bin -Djava.library.path=java app.Main` -->
**Compile:** 

    $ mkdir build && cd build

    $ cmake ..

    $ make

**Run: (in build directory)** 

    $ `java -cp java/bin:../gson-2.8.7.jar -Djava.library.path=java app.Main`