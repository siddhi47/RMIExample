import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface RMIAdd extends Remote {  
   void add(int a, int b) throws RemoteException;  
} 
