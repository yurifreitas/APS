/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class DateTest {

    public DateTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Date.
     */
    @Test
    public void testToString() {
        Date d8 = new Date(5, 5, 2005);
        System.out.println(d8.toString().equals("05/05/2005"));
        d8 = new Date(1, 10, 2001);
        System.out.println(d8.toString().equals("01/10/2001"));
    }

    /**
     * Test of bicesto method, of class Date.
     */
    @Test
    public void testBicesto() {
        Date d8 = new Date(27, 2, 2004);
    }

    /**
     * Test of equals method, of class Date.
     */
    @Test
    public void testEquals() {
        Date d5 = new Date(1, 7, 2014);
        Date d6 = new Date(1, 7, 2014);
        System.out.println(d5.equals(d6) == true);
        System.out.println(d5.equals(new Date()) == false);
    }

    /**
     * Test of before method, of class Date.
     */
    @Test
    public void testBefore() {
        Date d5 = new Date(1, 7, 2014);
        Date d6 = new Date(1, 7, 2014);
        Date d7 = new Date(23, 4, 2016);
        System.out.println(d5.after(d7) == false);
        System.out.println(d7.after(d5) == true);
        System.out.println(d5.before(d7) == true);
        System.out.println(d7.before(d5) == false);
        System.out.println(d7.before(d7) == false);
        System.out.println(d7.after(d7) == false);
    }

    /**
     * Test of after method, of class Date.
     */
    @Test
    public void testAfter() {
        Date d5 = new Date(1, 7, 2014);
        Date d6 = new Date(1, 7, 2014);
        Date d7 = new Date(23, 4, 2016);
        System.out.println(d5.after(d7) == false);
        System.out.println(d7.after(d5) == true);
        System.out.println(d5.before(d7) == true);
        System.out.println(d7.before(d5) == false);
        System.out.println(d7.before(d7) == false);
        System.out.println(d7.after(d7) == false);
    }

    /**
     * Test of minusDays method, of class Date.
     */
    @Test
    public void testMinusDays() {

    }

    /**
     * Test of plusDays method, of class Date.
     */
    @Test
    public void testPlusDays() {

    }

    /**
     * Test of tomorrow method, of class Date.
     */
    @Test
    public void testTomorrow() {

    }

    /**
     * Test of yesterday method, of class Date.
     */
    @Test
    public void testYesterday() {
        System.out.println("yesterday");
        Date instance = new Date();
        Object expResult = null;
        Object result = instance.yesterday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
