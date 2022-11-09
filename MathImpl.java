import java.math.BigInteger;
// Implementing the remote interface 
public class MathImpl implements RMIMath {  
   
   // Implementing the interface method 
   public BigInteger add(BigInteger a, BigInteger b) {
       //System.out.println("Addition of two numbers is: " + a.add(b));
       return a.add(b);
   }

   public BigInteger subtract(BigInteger a, BigInteger b) {
       //System.out.println("Subtraction of two numbers is: " + a.subtract(b));
       return a.subtract(b);
   }

   public BigInteger multiply(BigInteger a, BigInteger b) {
       //System.out.println("Multiplication of two numbers is: " + a.multiply(b));
       return a.multiply(b);
   }

   public BigInteger divide(BigInteger a, BigInteger b) {
       //System.out.println("Division of two numbers is: " + a.divide(b));
       return a.divide(b);
   }

   public BigInteger LCM(BigInteger a, BigInteger b) {

       //System.out.println("LCM of two numbers is: " + a.multiply(b).divide(a.gcd(b)));
       return a.multiply(b).divide(a.gcd(b));
   }

   public BigInteger GCD(BigInteger a, BigInteger b) {
       //System.out.println("GCD of two numbers is: " + a.gcd(b));

        return a.gcd(b);
}
}
