package generate;

import card.Suit;

import java.util.Random;

public class RandomSuitGenerator {
    private final Random random = new Random();

    public final Suit generate() {
        return Suit.values()[random.nextInt(Suit.values().length)];

    }
}
