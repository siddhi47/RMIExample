import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface RMIMath extends Remote {  
   void add(int a, int b) throws RemoteException;  
   void subtract(int a, int b) throws RemoteException;
   void multiply(int a, int b) throws RemoteException;
   void divide(int a, int b) throws RemoteException;
   void LCM(int a, int b) throws RemoteException;
   void GCD(int a, int b) throws RemoteException;
} 
