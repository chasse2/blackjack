package generate;

import card.Rank;

import java.util.Random;

public class RandomRank10Generator {
    private final Random random = new Random();

    public final Rank generate() {
        return Rank.values()[random.nextInt(4) + Rank.TEN.value()];

    }
}
