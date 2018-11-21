package ca.csf.pobj.tp2test;

import org.junit.Test;

import ca.csf.pobj.tp2.F;

import static org.junit.Assert.*;

public class FTest {

    @Test
    public void test56p1() {
        assertEquals(6, F.getNumberAtPower(56, 1));
    }

    @Test
    public void test56p2() {
        assertEquals(5, F.getNumberAtPower(56, 2));
    }

    @Test
    public void test960p1() {
        assertEquals(0, F.getNumberAtPower(960, 1));
    }

    @Test
    public void test960p2() {
        assertEquals(6, F.getNumberAtPower(960, 2));
    }

    @Test
    public void test960p3() {
        assertEquals(9, F.getNumberAtPower(960, 3));
    }

    @Test
    public void test960p4() {
        assertEquals(0, F.getNumberAtPower(960, 4));
    }

    @Test
    public void testGetPowerArray() {
        int x = 960;

        int[] answer = { 0, 9, 6, 0 };
        int[] functionReturn = F.getArrayOfPower(x, 4);

        assertEquals(4, functionReturn.length);
        for (int i = 0; i < answer.length; i++) {
            assertEquals(answer[i], functionReturn[i]);
        }
    }
}