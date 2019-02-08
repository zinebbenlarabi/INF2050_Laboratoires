package org.exemple.lab2;
import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        int a = 3;
        int b = 300;
        int f = add(a,b);
        String hello = "Hello World! ";
        if (StringUtils.isEmpty(hello))
        {
          System.out.println("Dites bonjour s'il vous plait");
        }
        else
        {
          System.out.println( hello + f );
        }
    }

    public static int add (int a, int b)
    {
        return a - b;
    }
}
