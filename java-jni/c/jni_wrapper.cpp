#include "cpplib/Calculator.h"
#include "Calculator_jni.h"

static jfieldID _get_self_id(JNIEnv *env, jobject thisObj)
{
    static int init = 0;
    static jfieldID fidSelfPtr;
    if (!init)
    {
        jclass thisClass = env->GetObjectClass(thisObj);
        fidSelfPtr = env->GetFieldID(thisClass, "self_ptr", "J");
    }
    return fidSelfPtr;
}

static Calculator *_get_self(JNIEnv *env, jobject thisObj)
{
    jlong selfPtr = env->GetLongField(thisObj, _get_self_id(env, thisObj));
    return *(Calculator **)&selfPtr;
}

static void _set_self(JNIEnv *env, jobject thisObj, Calculator *self)
{
    jlong selfPtr = *(jlong *)&self;
    env->SetLongField(thisObj, _get_self_id(env, thisObj), selfPtr);
}

JNIEXPORT void JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_init(JNIEnv *env, jobject thisObj)
{
    Calculator *self = new Calculator();
    _set_self(env, thisObj, self);
}

JNIEXPORT void JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_add_1to_1memory(JNIEnv *env, jobject thisObj, jint x)
{
    Calculator *self = _get_self(env, thisObj);
    self->add_to_memory(x);
}

JNIEXPORT jint JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_recall_1memory(JNIEnv *env, jobject thisObj)
{
    Calculator *self = _get_self(env, thisObj);
    return self->recall_memory();
}

JNIEXPORT jint JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_add(JNIEnv *env, jobject thisObj, jint a, jint b)
{
    Calculator *self = _get_self(env, thisObj);
    return self->add(a, b);
}

JNIEXPORT jint JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_subtract(JNIEnv *env, jobject thisObj, jint a, jint b)
{
    Calculator *self = _get_self(env, thisObj);
    return self->subtract(a, b);
}

JNIEXPORT jdouble JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_multiply(JNIEnv *env, jobject thisObj, jint a, jint b)
{
    Calculator *self = _get_self(env, thisObj);
    return self->multiply(a, b);
}

JNIEXPORT jdouble JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_square(JNIEnv *env, jobject thisObj, jint a)
{
    Calculator *self = _get_self(env, thisObj);
    return self->square(a);
}

JNIEXPORT void JNICALL Java_edu_nyu_cpptest_cpplib_Calculator_finalize(JNIEnv *env, jobject thisObj)
{
    Calculator *self = _get_self(env, thisObj);
    if (self != NULL)
    {
        delete self;
        _set_self(env, thisObj, NULL);
    }
}
