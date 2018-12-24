package generate;

import card.Suit;

import java.util.Random;

/**
 * Randomly generates {@link Suit}'s.
 */
public class RandomSuitGenerator {
    private final Random random = new Random();

    public final Suit generate() {
        return Suit.values()[generateNumberBetween0AndNumberOfSuitsInclusive()];
    }

    private int generateNumberBetween0AndNumberOfSuitsInclusive() {
        return random.nextInt(Suit.values().length);
    }
}
