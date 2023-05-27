///usr/bin/env jbang "$0" "$@" ; exit $?

import static java.lang.System.*;

//JAVA 19
//NATIVE_OPTIONS --no-fallback -H:+ReportExceptionStackTraces --enable-preview --enable-monitoring
//COMPILE_OPTIONS --enable-preview --release 19
//RUNTIME_OPTIONS --enable-preview -XX:+UseZGC -XX:NativeMemoryTracking=summary -XX:+HeapDumpOnOutOfMemoryError -XX:StartFlightRecording=filename=jfr/,path-to-gc-roots=true,jdk.ObjectCount#enabled=true

public class main {

    public static void main(String... args) {
        out.println("Hello World");
    }
}
