import java.math.BigInteger;
// Implementing the remote interface 
public class MathImpl implements RMIMath {  
   
   // Implementing the interface method 
   public void add(BigInteger a, BigInteger b) {
       System.out.println("Addition of two numbers is: " + a.add(b));
   }

   public void subtract(BigInteger a, BigInteger b) {
       System.out.println("Subtraction of two numbers is: " + a.subtract(b));
   }

   public void multiply(BigInteger a, BigInteger b) {
       System.out.println("Multiplication of two numbers is: " + a.multiply(b));
   }

   public void divide(BigInteger a, BigInteger b) {
       System.out.println("Division of two numbers is: " + a.divide(b));
   }

   public void LCM(BigInteger a, BigInteger b) {

       System.out.println("LCM of two numbers is: " + a.multiply(b).divide(a.gcd(b)));
   }

   public void GCD(BigInteger a, BigInteger b) {
        System.out.println("GCD of two numbers is: " + a.gcd(b));
}
}
