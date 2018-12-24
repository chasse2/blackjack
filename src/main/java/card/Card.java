package card;

import org.apache.commons.text.WordUtils;

/**
 * A player card consisting of a {@link Rank} and {@link Suit}.
 */
public class Card {
    final public Rank rank;
    final public Suit suit;

    /**
     * Creates a {@link Card} object with a {@link Rank} and {@link Suit}.
     * @param rank - the {@link Rank} of a card.
     * @param suit - the {@link Suit} of a card.
     */
    public Card(final Rank rank, final Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns a string representation of a {@link Card}.
     * @return
     * the string representation of a {@link Card}.
     */
    @Override
    public String toString() {
        return WordUtils.capitalizeFully(this.rank.name())
                + " of "
                + WordUtils.capitalizeFully(this.suit.name()) + "s";
    }
}
