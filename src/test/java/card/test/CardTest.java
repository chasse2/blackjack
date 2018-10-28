package card.test;

import card.Card;
import card.Rank;
import card.Suit;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    private final Rank rank = Rank.ACE;
    private final Suit suit = Suit.SPADE;
    private final Card card = new Card(rank, suit);

    @Test
    public final void testConstructor() {
        assertSame(rank, card.rank);
        assertSame(suit, card.suit);
    }

    @Test
    public final void testToString() {
        assertEquals("Ace of Spades", card.toString());
    }
}