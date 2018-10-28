package card.test;

import card.Color;
import card.Suit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuitTest {
    @Test
    public final void testEnum() {
        assertEquals(Color.BLACK, Suit.CLUB.color);
        assertEquals(Color.RED, Suit.DIAMOND.color);
        assertEquals(Color.RED, Suit.HEART.color);
        assertEquals(Color.BLACK, Suit.SPADE.color);
    }
}