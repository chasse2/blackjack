package card;

import static card.Color.BLACK;
import static card.Color.RED;

/**
 * Playing card suits.
 */
public enum Suit {
    CLUB(BLACK),
    DIAMOND(RED),
    HEART(RED),
    SPADE(BLACK);

    public Color color;

    Suit(final Color color) {
        this.color = color;
    }
}
