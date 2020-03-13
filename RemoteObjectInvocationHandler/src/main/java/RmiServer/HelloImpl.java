package RmiServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    public HelloImpl() throws RemoteException {
        super();
    }

    //    public String sayhello(String name){
//        System.out.println("hello" + name);
//        return "hello" + name;
//    }
//
//    public int add(int x, int y) {
//        return x + y;
//    }
//
//    @Override
//    public void poke(Object attende) throws RemoteException {
//        System.out.println("poking " + attende.toString());
//    }
    public String afanti(String msg){
        System.out.println(msg);
        return msg;
    }
    public void afanti2(Object msg){
        System.out.println(msg.toString());
    }
}