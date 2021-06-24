#ifndef CALCULATOR_H
#define CALCULATOR_H

class Calculator
{

private:
    int stored_var;

public:
    Calculator();
    int add(int a, int b);
    int subtract(int a, int b);
    double multiply(int a, int b);
    double square(int x);
    void add_to_memory(int x);
    int recall_memory();
};

#endif
