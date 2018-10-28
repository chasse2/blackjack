package card.test;

import card.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorTest {
    @Test
    public final void testEnum()  {
        assertEquals(Color.BLACK, Color.valueOf("BLACK"));
        assertEquals(Color.RED, Color.valueOf("RED"));
    }
}