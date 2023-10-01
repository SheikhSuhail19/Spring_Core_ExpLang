package com.springcore;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Test.
 */
public class TestTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static junit.framework.Test suite()
    {
        return new TestSuite( TestTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
