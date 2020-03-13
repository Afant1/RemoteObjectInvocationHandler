package RmiServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    //    public String sayhello(String name) throws RemoteException;
//    public int add(int x, int y) throws RemoteException;
//    void poke(Object attende) throws RemoteException;
    public String afanti(String msg) throws RemoteException;

    public void afanti2(Object msg) throws RemoteException;
}