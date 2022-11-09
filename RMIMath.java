import java.rmi.Remote; 
import java.rmi.RemoteException;  
import java.math.BigInteger;
// Creating Remote interface for our application 
public interface RMIMath extends Remote {  
   void add(BigInteger a, BigInteger b) throws RemoteException;  
   void subtract(BigInteger a, BigInteger b) throws RemoteException;
   void multiply(BigInteger a, BigInteger b) throws RemoteException;
   void divide(BigInteger a, BigInteger b) throws RemoteException;
   void LCM(BigInteger a, BigInteger b) throws RemoteException;
   void GCD(BigInteger a, BigInteger b) throws RemoteException;
} 
