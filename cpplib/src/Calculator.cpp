#include "cpplib/Calculator.h"

Calculator::Calculator()
{
  stored_var = 0;
}

int Calculator::add(int a, int b)
{
  return a + b;
}

int Calculator::subtract(int a, int b)
{
  return a - b;
}

double Calculator::multiply(int a, int b)
{
  return (double)a * b;
}

double Calculator::square(int x)
{
  return (double)x * x;
}

void Calculator::add_to_memory(int x)
{
  stored_var = x;
}
int Calculator::recall_memory()
{
  return stored_var;
}