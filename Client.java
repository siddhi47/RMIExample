import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
import java.util.Scanner;
import java.math.*;
public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         RMIMath stub = (RMIMath) registry.lookup("RMIMath");
    
         // Calling the remote method using the obtained object 
        
        // get two numbers from the uses
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        // input type of operation
        System.out.println("Enter the type of operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. LCM");
        System.out.println("6. GCD");
        int choice = sc.nextInt();
        sc.close();
        
        BigInteger res = new BigInteger("0");
        // perform the operation
        // switch case to perform the operation
        // call the remote method
        // print the result
        switch(choice) {
            case 1:
                res = stub.add(a, b);
                System.out.println("Addition of two numbers is: " + res);
                break;
            case 2:
                res = stub.subtract(a, b);
                System.out.println("Subtraction of two numbers is: " + res);
                break;
            case 3:
                res = stub.multiply(a, b);
                System.out.println("Multiplication of two numbers is: " + res);
                break;
            case 4:
                res = stub.divide(a, b);
                System.out.println("Division of two numbers is: " + res);
                break;
            case 5:
                res = stub.LCM(a, b);
                System.out.println("LCM of two numbers is: " + res);
                break;
            case 6:
                res = stub.GCD(a, b);
                System.out.println("GCD of two numbers is: " + res);
                break;
            default:
                System.out.println("Invalid choice");
                break;
         
      }
      }
      catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
