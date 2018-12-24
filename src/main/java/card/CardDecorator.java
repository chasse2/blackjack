package card;

import generate.RandomRank10Generator;
import generate.RandomSuitGenerator;

/**
 * Creates a {@link Card} by decorating a {@link CardValue} to have a {@link Rank} and {@link Suit}.
 */
public class CardDecorator {
    //Todo - dependency injection
    private final RandomSuitGenerator randomSuitGenerator = new RandomSuitGenerator();
    private final RandomRank10Generator randomRank10Generator = new RandomRank10Generator();

    /**
     * Decorates a {@link CardValue} with a {@link Rank} and {@link Suit}.
     * @param cardValue - the value of a card.
     * @return a decorated {@link CardValue}.
     */
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
