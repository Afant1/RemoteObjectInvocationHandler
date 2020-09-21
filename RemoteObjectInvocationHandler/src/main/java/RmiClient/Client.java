package RmiClient;

import RmiServer.Hello;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {
    public static void main(String[] args) throws Exception {
        //调用
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1234);
        //-javaagent:C:\Users\Afant1\Desktop\github\RMIInterceptorPoC\RMIInterceptor\target\rasp-1.0-SNAPSHOT.jar
        Hello hello = ( Hello ) registry.lookup("Hello");
        hello.afanti("this is RMI SPEAKING");
    }
}
