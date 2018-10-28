package card;

import generate.RandomRank10Generator;
import generate.RandomSuitGenerator;

public class CardDecorator {
    private final RandomSuitGenerator randomSuitGenerator = new RandomSuitGenerator();
    private final RandomRank10Generator randomRank10Generator = new RandomRank10Generator();

    public Card decorate(final CardValue cardValue) {
        final Suit suit = randomSuitGenerator.generate();
        final Rank rank = generateRank(cardValue);
        return new Card(rank, suit);
    }

    private Rank generateRank(final CardValue cardValue) {
        final Rank rank;

        if (cardValue.value < 10) {
            rank = Rank.values()[cardValue.value - 1];
        } else {
            rank = randomRank10Generator.generate();
        }

        return rank;
    }
}
