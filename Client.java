import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
import java.util.Scanner;

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         RMIAdd stub = (RMIAdd) registry.lookup("RMIAdd");
    
         // Calling the remote method using the obtained object 
        
        // get two numbers from the uses
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

         stub.add(a, b); 
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
