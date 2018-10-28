package card.test;

import card.CardValue;
import card.Rank;
import org.junit.Test;

import static org.junit.Assert.*;

public class RankTest {
    @Test
    public final void testEnum()  {
        assertEquals(CardValue.ACE, Rank.ACE.cardValue);
        assertEquals(CardValue.TWO, Rank.TWO.cardValue);
        assertEquals(CardValue.THREE, Rank.THREE.cardValue);
        assertEquals(CardValue.FOUR, Rank.FOUR.cardValue);
        assertEquals(CardValue.FIVE, Rank.FIVE.cardValue);
        assertEquals(CardValue.SIX, Rank.SIX.cardValue);
        assertEquals(CardValue.SEVEN, Rank.SEVEN.cardValue);
        assertEquals(CardValue.EIGHT, Rank.EIGHT.cardValue);
        assertEquals(CardValue.NINE, Rank.NINE.cardValue);
        assertEquals(CardValue.TEN, Rank.TEN.cardValue);
        assertEquals(CardValue.TEN, Rank.JACK.cardValue);
        assertEquals(CardValue.TEN, Rank.QUEEN.cardValue);
        assertEquals(CardValue.TEN, Rank.KING.cardValue);
    }
}