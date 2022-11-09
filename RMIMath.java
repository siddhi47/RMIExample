import java.rmi.Remote; 
import java.rmi.RemoteException;  
import java.math.BigInteger;
// Creating Remote interface for our application 
public interface RMIMath extends Remote {  
   BigInteger add(BigInteger a, BigInteger b) throws RemoteException;  
   BigInteger subtract(BigInteger a, BigInteger b) throws RemoteException;
   BigInteger multiply(BigInteger a, BigInteger b) throws RemoteException;
   BigInteger divide(BigInteger a, BigInteger b) throws RemoteException;
   BigInteger LCM(BigInteger a, BigInteger b) throws RemoteException;
   BigInteger GCD(BigInteger a, BigInteger b) throws RemoteException;
} 
