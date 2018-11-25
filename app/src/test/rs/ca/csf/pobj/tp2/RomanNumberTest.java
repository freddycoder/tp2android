package ca.csf.pobj.tp2;

import junit.framework.TestCase;

import org.junit.Test;

//BEN_REVIEW : Ce fichier n'est pas a bon endroit. Il devrait être dans "test/java", et non pas "test/rs"

public class RomanNumberTest extends TestCase {

    @Test
    public void numberIV() {
        RomanNumber r = new RomanNumber(4);
        assertEquals("IV", r.toString());
    }

    @Test
    public void numberIII() {
        RomanNumber r = new RomanNumber(3);
        assertEquals("III", r.toString());
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