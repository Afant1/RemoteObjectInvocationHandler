package afanti.rasp;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;


public class JavaRASPApp {
    public static void premain(String agentArgs, Instrumentation instru) throws ClassNotFoundException, UnmodifiableClassException {
        System.out.println("hooking....");
        instru.addTransformer(new ClassTransFormer());
    }

}

