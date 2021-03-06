package generate;

import card.Rank;

import java.util.Random;

/**
 * Randomly generate {@link Rank}'s with a {@link card.CardValue} of 10.
 */
public class RandomRank10Generator {
    private final Random random = new Random();

    public final Rank generate() {
        return Rank.values()[generateNumberBetween10And13Inclusive()];
    }

    private int generateNumberBetween10And13Inclusive() {
        return generateNumberBetween0And3Inclusive() + 10;
    }

    private int generateNumberBetween0And3Inclusive() {
        return random.nextInt(4);
    }
}
