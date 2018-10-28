package card;

import org.apache.commons.text.WordUtils;

public class Card {
    final public Rank rank;
    final public Suit suit;

    public Card(final Rank rank, final Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return WordUtils.capitalizeFully(this.rank.name())
                + " of "
                + WordUtils.capitalizeFully(this.suit.name()) + "s";
    }
}
