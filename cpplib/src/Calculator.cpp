#include "cpplib/Calculator.h"

emumba::Calculator::Calculator()
{
  stored_var = 0;
}

int emumba::Calculator::add(int a, int b)
{
  return a + b;
}

int emumba::Calculator::subtract(int a, int b)
{
  return a - b;
}

double emumba::Calculator::multiply(int a, int b)
{
  return (double)a * b;
}

double emumba::Calculator::square(int x)
{
  return (double)x * x;
}

void emumba::Calculator::add_to_memory(int x)
{
  stored_var = x;
}
int emumba::Calculator::recall_memory()
{
  return stored_var;
}