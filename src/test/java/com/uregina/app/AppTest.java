package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testingTwelweAm()
    {
        assertEquals(toTime24(12, 0, am), time.hours = 0);
    }

    @Test
    public void testingTwelwePm()
    {
        assertEquals(toTime24(12, 0, pm), time.hours = 12);
    }

    @Test
    public void testingTwelweThirtyAm()
    {
        assertEquals(toTime24(12, 30, am), time.hours = 0);
    }

    @Test
    public void testingTenAm()
    {
        assertEquals(toTime24(10, 0, am), time.hours = 10);
    }

    @Test
    public void testingThreeFourtyFivePm()
    {
        assertEquals(toTime24(3, 45, pm), time.hours = 15);
    }

    @Test
    public void testingDayBefore()
    {
        Date d1 = new Date(6, 17, 1999);
        Date d2 = new Date(6, 18, 1999);
        assertTrue(lessThan(d1, d2));
    }

    @Test
    public void testingSameDay()
    {
        Date d1 = new Date(6, 18, 1999);
        Date d2 = new Date(6, 18, 1999);
        assertFalse(lessThan(d1, d2));
    }

    @Test
    public void testingInvalidDay()
    {
        Date d1 = new Date(6, 44, 1999);
        Date d2 = new Date(6, 18, 1999);
        assertFalse(lessThan(d1, d2));
    }

    @Test
    public void testingDateTimeSubtractValid1()
    {
        Date d1 = new Date(6, 17, 1999);
        Time24 t1 = new Time24(2, 25);
        Date d2 = new Date(6, 18, 1999);
        Time24 t2 = new Time24(3, 25);

        DateTime dt1 = new DateTime(d1, t1);
        DateTime dt2 = new DateTime(d2, t2);
        
        assertEquals(DateTime.subtract(dt1, dt2), -60);
    }

    @Test
    public void testingDateTimeSubtractValid2()
    {
        Date d1 = new Date(6, 17, 1999);
        Time24 t1 = new Time24(3, 25);
        Date d2 = new Date(6, 18, 1999);
        Time24 t2 = new Time24(2, 25);

        DateTime dt1 = new DateTime(d1, t1);
        DateTime dt2 = new DateTime(d2, t2);
        
        assertEquals(DateTime.subtract(dt1, dt2), 60);
    }


}
