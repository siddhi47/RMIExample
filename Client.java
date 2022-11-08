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
         RMIMath stub = (RMIMath) registry.lookup("RMIMath");
    
         // Calling the remote method using the obtained object 
        
        // get two numbers from the uses
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

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
        
        // perform the operation
        // switch case to perform the operation
        // call the remote method
        // print the result
        switch(choice) {
            case 1:
                stub.add(a, b);
                break;
            case 2:
                stub.subtract(a, b);
                break;
            case 3:
                stub.multiply(a, b);
                break;
            case 4:
                stub.divide(a, b);
                break;
            case 5:
                stub.LCM(a, b);
                break;
            case 6:
                stub.GCD(a, b);
                break;
            default:
                System.out.println("Invalid choice");
         
      }
      }
      catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}
