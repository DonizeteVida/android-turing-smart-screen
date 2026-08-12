#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_turing_smart_screen_TuringSmartScreen_helloWorld(
        JNIEnv *env,
        jclass clazz) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jobject JNICALL
Java_com_turing_smart_screen_TuringSmartScreen_getSerialDevices(
        JNIEnv *env,
        jclass) {
    auto clazz = env->FindClass("java/util/ArrayList");
    auto method = env->GetMethodID(clazz, "add", "(Ljava/lang/Object;)Z");
    auto constructor = env->GetMethodID(clazz, "<init>", "()V");

    auto list = env->NewObject(clazz, constructor);
    auto stubDevice = env->NewStringUTF("Stub device");

    env->CallBooleanMethod(list, method, stubDevice);

    return list;
}