package org.exemple.lab2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    private App classUnderTest;

    public void testAdd ()
    {
      int a = 3;
      int b = 4;

      int expectedValue =  a+b;

      assertTrue("La fonction add n'effectue pas une addition",expectedValue == classUnderTest.add(a, b));
    }
}
