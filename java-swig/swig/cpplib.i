%module cpplib
%{
#include "Calculator.h"
%}

%include "Calculator.h"

%pragma(java) jniclasscode=%{
    static {
        System.loadLibrary("cpplib_swig");
    }
%}
