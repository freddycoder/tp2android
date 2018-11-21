package ca.csf.pobj.tp2test;

import org.junit.Test;

import ca.csf.pobj.tp2.RomanNumber;

import static org.junit.Assert.*;

public class RomanNumberTest {

    @Test
    public void numberIII() {
        RomanNumber r = new RomanNumber(3);
        assertEquals("III", r.toString());
    }

    @Test
    public void numberIV() {
        RomanNumber r = new RomanNumber(4);
        assertEquals("IV", r.toString());
    }

    @Test
    public void numberIX() {
        RomanNumber r = new RomanNumber(9);
        assertEquals("IX", r.toString());
    }

    @Test
    public void numberXIX() {
        RomanNumber r = new RomanNumber(19);
        assertEquals("XIX", r.toString());
    }

    @Test
    public void numberLX() {
        RomanNumber r = new RomanNumber(60);
        assertEquals("LX", r.toString());
    }

    @Test
    public void numberCLX() {
        RomanNumber r = new RomanNumber(164);
        assertEquals("CLXIV", r.toString());
    }

    @Test
    public void numberD() {
        RomanNumber r = new RomanNumber(500);
        assertEquals("D", r.toString());
    }

    @Test
    public void numberMC() {
        RomanNumber r = new RomanNumber(900);
        assertEquals("CM", r.toString());
    }

    @Test
    public void numberCMLXIV() {
        RomanNumber r = new RomanNumber(960);
        assertEquals("CMLX", r.toString());
    }

    @Test
    public void numberMCMLXIV() {
        RomanNumber r = new RomanNumber(1964);
        assertEquals("MCMLXIV", r.toString());
    }

    @Test
    public void numberMMMMCMXCIX() {
        RomanNumber r = new RomanNumber(4999);
        assertEquals("MMMMCMXCIX", r.toString());
    }
}