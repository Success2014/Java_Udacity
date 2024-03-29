
/**
 * Tests the Balloon class
 * 
 * @author KOBrien
 */
public class BalloonTester
{
   public static void main(String[] args)
   {
       Balloon balloon = new Balloon();
       System.out.println(balloon.getVolume());
       System.out.println("Expected: 0.0");
       
       balloon.addAir(100);
       System.out.println(balloon.getRadius());
       System.out.println("expected: 2.8794119114848606");
       System.out.println(balloon.getVolume());
       System.out.println("expected: 100.0");
       System.out.println(balloon.getSurfaceArea());
       System.out.println("expected: 104.18794157356089");
       
       balloon.addAir(100);
       System.out.println(balloon.getRadius());
       System.out.println("expected: 3.6278316785978095");
       System.out.println(balloon.getSurfaceArea());
       System.out.println("expected: 165.38804805627188");
       
   }
}
