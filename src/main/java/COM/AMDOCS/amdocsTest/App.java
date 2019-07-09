package COM.AMDOCS.amdocsTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Addition addition = new Addition();
      double result = addition.add(10.0,5.6);
       System.out.println("The result of addition is " +result);
    }
}
