// Implementing the remote interface 
public class AddImpl implements RMIAdd {  
   
   // Implementing the interface method 
   public void add(int a, int b) {
       System.out.println("Addition of two numbers is: " + (a+b));
   }

   public void subtract(int a, int b) {
       System.out.println("Subtraction of two numbers is: " + (a-b));
   }

   public void multiply(int a, int b) {
       System.out.println("Multiplication of two numbers is: " + (a*b));
   }

   public void divide(int a, int b) {
       System.out.println("Division of two numbers is: " + (a/b));
   }

   public void LCM(int a, int b) {
       int lcm = (a > b) ? a : b;
       while(true) {
           if( lcm % a == 0 && lcm % b == 0 ) {
               System.out.println("LCM of two numbers is: " + lcm);
               break;
           }
           ++lcm;
       }
   }

   public void GCD(int a, int b) {
       int gcd = 1;
       for(int i = 1; i <= a && i <= b; ++i) {
           if(a % i == 0 && b % i == 0)
               gcd = i;
       }
       System.out.println("GCD of two numbers is: " + gcd);
   }

} 
