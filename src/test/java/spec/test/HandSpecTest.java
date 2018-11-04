package spec.test;

import card.CardValue;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import spec.HandSpec;
import sun.reflect.Reflection;

import static org.junit.Assert.*;

public class HandSpecTest {

    @Test
    public final void testConstructor() {
        final CardValue playerCardValue1 = CardValue.ACE;
        final CardValue playerCardValue2 = CardValue.TWO;
        final CardValue dealerCardValue = CardValue.THREE;
        final HandSpec handSpec = new HandSpec(playerCardValue1, playerCardValue2, dealerCardValue);
        assertSame(playerCardValue1, ReflectionTestUtils.getField(handSpec, "playerCardValue1"));
        assertSame(playerCardValue2, ReflectionTestUtils.getField(handSpec, "playerCardValue2"));
        assertSame(dealerCardValue, ReflectionTestUtils.getField(handSpec, "dealerCardValue"));
    }

    @Test
    public void testHasDealerAce() {
        assertTrue(new HandSpec(CardValue.TWO, CardValue.THREE, CardValue.ACE).hasDealerAce());
        assertTrue(new HandSpec(CardValue.ACE, CardValue.ACE, CardValue.ACE).hasDealerAce());
        assertFalse(new HandSpec(CardValue.ACE, CardValue.ACE, CardValue.TWO).hasDealerAce());
    }

    @Test
    public void testHasPlayerAce() {
        assertTrue(new HandSpec(CardValue.ACE, CardValue.THREE, CardValue.FOUR).hasPlayerAce());
        assertTrue(new HandSpec(CardValue.TWO, CardValue.ACE, CardValue.FOUR).hasPlayerAce());
        assertTrue(new HandSpec(CardValue.ACE, CardValue.ACE, CardValue.TWO).hasPlayerAce());
        assertTrue(new HandSpec(CardValue.ACE, CardValue.ACE, CardValue.ACE).hasPlayerAce());
        assertFalse(new HandSpec(CardValue.TWO, CardValue.THREE, CardValue.ACE).hasPlayerAce());
    }

    @Test
    public void testHasPlayerPair() {
        assertTrue(new HandSpec(CardValue.ACE, CardValue.ACE, CardValue.FOUR).hasPlayerPair());
        assertFalse(new HandSpec(CardValue.ACE, CardValue.THREE, CardValue.ACE).hasPlayerPair());
        assertFalse(new HandSpec(CardValue.TWO, CardValue.ACE, CardValue.ACE).hasPlayerPair());
    }

    @Test
    public void testHashCode() {
        //todo - ensure that it is unique for all 550 (see HandSpecsTest for formula)
        // card combinations ...

/*
    @Override
    public final int hashCode() {
        //todo - does this make sense?
        return 1 * playerCardValue1.ordinal()
                + 10 * playerCardValue2.ordinal()
                + 100 * dealerCardValue.ordinal();
    }
*/
    }

    @Test
    public void testEquals() {
        final HandSpec handSpec1 = new HandSpec(CardValue.ACE, CardValue.TWO, CardValue.THREE);
        final HandSpec handSpec2 = new HandSpec(CardValue.ACE, CardValue.TWO, CardValue.THREE);
        assertTrue(handSpec1.equals(handSpec2));
        final HandSpec handSpec3 = new HandSpec(CardValue.ACE, CardValue.TWO, CardValue.FOUR);
        assertFalse(handSpec1.equals(handSpec3));
    }

    @Test
    public void testToString() {
        final CardValue playerCardValue1 = CardValue.ACE;
        final CardValue playerCardValue2 = CardValue.TWO;
        final CardValue dealerCardValue = CardValue.THREE;

        final String actualString = new HandSpec(playerCardValue1, playerCardValue2, dealerCardValue).toString();
        final String expectedString = "PlayerCard1:" + playerCardValue1.toString()
                + ";PlayerCard2:" + playerCardValue2.toString()
                + ";DealerCard:" + dealerCardValue.toString();

        assertEquals(expectedString, actualString);
    }
}