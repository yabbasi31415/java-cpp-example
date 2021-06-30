[![Say Thanks!](https://img.shields.io/badge/Say%20Thanks-!-1EAEDB.svg)](https://saythanks.io/to/remram44)

Example of using C++ code from Java
===================================

This repository contains three separate examples of calling a simple C++ library from Java code.

The example library doesn't do anything but contains a class, Calculator, forcing us to support C++ (and not just plain C).

CMake is used to build this, since locating the dependencies got outside the range of my make-fu. The project is supposed to be portable to all major platforms.

Three different wrappers are used, documented below. Each one achieves the same goal, which is using [this C++ class](cpplib/src/Calculator.cpp) from [Java code](java-jni/java/src/app/Main.java).

SWIG
----

This needs the SWIG tool: http://www.swig.org/

SWIG parses the C++ header file and generates both the C++ JNI code and the Java native and helper classes.

### To run the executable

$ `java -cp java-swig/java/bin -Djava.library.path=java-swig edu.nyu.cpptest.app.Main`