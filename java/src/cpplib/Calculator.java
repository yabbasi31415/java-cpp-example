package cpplib;

public class Calculator {

    static {
        System.loadLibrary("cpplib_jni");
    }

    private long self_ptr;

    public Calculator() {
        init();
    }

    private native void init();

    public native int add(int a, int b);

    public native int subtract(int a, int b);

    public native double multiply(int a, int b);

    public native double square(int x);

    public native void add_to_memory(int x);

    public native int recall_memory();

    protected native void finalize();

}
