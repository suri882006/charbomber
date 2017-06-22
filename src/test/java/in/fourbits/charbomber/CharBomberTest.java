package in.fourbits.charbomber;

import static org.junit.Assert.assertEquals;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Suraj Acharya
 */
public class CharBomberTest {

    public CharBomberTest() {
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
     * Test of BomberAlgo method, of class CharBomber.
     */
    @Test
    public void testBomberAlgoWithSuccessiveTripleMatch() {
        assertEquals(new CharBomber().BomberAlgo("aabcccdee".toCharArray()), "bd");
    }

    @Test
    public void testBomberAlgoWithIntermediateMatch() {
        assertEquals(new CharBomber().BomberAlgo("abcdeedcbfgh".toCharArray()), "afgh");
    }

    @Test
    public void testBomberAlgoWithSuccessiveMatch() {
        assertEquals(new CharBomber().BomberAlgo("abbabba".toCharArray()), "a");
    }

    @Test
    public void testBomberAlgoWithIntermediateMatchWithSingleAtEnd() {
        assertEquals(new CharBomber().BomberAlgo("abcdeedcbfgf".toCharArray()), "afgf");
    }
}
