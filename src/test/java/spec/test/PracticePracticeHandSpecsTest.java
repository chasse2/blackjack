package spec.test;

import card.CardValue;
import org.junit.Test;
import spec.PracticeHandSpec;
import spec.PracticeHandSpecs;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PracticePracticeHandSpecsTest {

    @Test
    public final void testAll() {
        final Set<PracticeHandSpec> actualHandSpecs = PracticeHandSpecs.all;

        final int NUM_CARD_VALUES = CardValue.values().length;
        final int EXPECTED_NUMBER_OF_CARD_SPECS = NUM_CARD_VALUES * NUM_CARD_VALUES * (NUM_CARD_VALUES + 1) / 2;
        assertEquals(EXPECTED_NUMBER_OF_CARD_SPECS, actualHandSpecs.size());

        int expectedPlayerCardValueCount = NUM_CARD_VALUES * NUM_CARD_VALUES;
        int expectedDealerCardValueCount = NUM_CARD_VALUES * (NUM_CARD_VALUES + 1) / 2;

        for (CardValue cardValue : CardValue.values()) {
            System.out.println("cardValue: " + cardValue.name());

            final long actualPlayerCardCount = actualHandSpecs.stream().filter(
                    x -> x.playerCardValue1 == cardValue || x.playerCardValue2 == cardValue).count();
            assertEquals(expectedPlayerCardValueCount, actualPlayerCardCount);

            final long actualDealerCardCount = actualHandSpecs.stream().filter(
                    x -> x.dealerCardValue == cardValue).count();
            assertEquals(expectedDealerCardValueCount, actualDealerCardCount);
        }
    }
}