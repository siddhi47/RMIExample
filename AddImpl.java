// Implementing the remote interface 
public class AddImpl implements RMIAdd {  
   
   // Implementing the interface method 
   public void add(int a, int b) {
       System.out.println("Addition of two numbers is: " + (a+b));
   }  
} 
