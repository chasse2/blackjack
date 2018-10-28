package card.test;

import card.CardValue;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardValueTest {
    @Test
    public void testEnum() {
        assertEquals(1, CardValue.ACE.value);
        assertEquals(1, CardValue.ACE.lowValue);
        assertEquals(11, CardValue.ACE.highValue);
        assertFalse(CardValue.ACE.isSingleValue);

        assertEquals(2, CardValue.TWO.value);
        assertEquals(2, CardValue.TWO.lowValue);
        assertEquals(2, CardValue.TWO.highValue);
        assertTrue(CardValue.TWO.isSingleValue);

        assertEquals(3, CardValue.THREE.value);
        assertEquals(3, CardValue.THREE.lowValue);
        assertEquals(3, CardValue.THREE.highValue);
        assertTrue(CardValue.THREE.isSingleValue);

        assertEquals(4, CardValue.FOUR.value);
        assertEquals(4, CardValue.FOUR.lowValue);
        assertEquals(4, CardValue.FOUR.highValue);
        assertTrue(CardValue.FOUR.isSingleValue);

        assertEquals(5, CardValue.FIVE.value);
        assertEquals(5, CardValue.FIVE.lowValue);
        assertEquals(5, CardValue.FIVE.highValue);
        assertTrue(CardValue.FIVE.isSingleValue);

        assertEquals(6, CardValue.SIX.value);
        assertEquals(6, CardValue.SIX.lowValue);
        assertEquals(6, CardValue.SIX.highValue);
        assertTrue(CardValue.SIX.isSingleValue);

        assertEquals(7, CardValue.SEVEN.value);
        assertEquals(7, CardValue.SEVEN.lowValue);
        assertEquals(7, CardValue.SEVEN.highValue);
        assertTrue(CardValue.SEVEN.isSingleValue);

        assertEquals(8, CardValue.EIGHT.value);
        assertEquals(8, CardValue.EIGHT.lowValue);
        assertEquals(8, CardValue.EIGHT.highValue);
        assertTrue(CardValue.EIGHT.isSingleValue);

        assertEquals(9, CardValue.NINE.value);
        assertEquals(9, CardValue.NINE.lowValue);
        assertEquals(9, CardValue.NINE.highValue);
        assertTrue(CardValue.NINE.isSingleValue);

        assertEquals(10, CardValue.TEN.value);
        assertEquals(10, CardValue.TEN.lowValue);
        assertEquals(10, CardValue.TEN.highValue);
        assertTrue(CardValue.TEN.isSingleValue);
    }
}