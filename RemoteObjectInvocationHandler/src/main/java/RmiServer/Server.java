package RmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws Exception{
        Hello hello = new HelloImpl();
        LocateRegistry.createRegistry(1234);
        String url = "rmi://127.0.0.1:1234/Hello";
        Naming.bind(url, hello);
        System.out.println("rmi server is running ...");
    }
}