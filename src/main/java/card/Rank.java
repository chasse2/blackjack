package card;

/**
 * Playing card ranks.
 */
public enum Rank {
        ACE(CardValue.ACE),
        TWO(CardValue.TWO),
        THREE(CardValue.THREE),
        FOUR(CardValue.FOUR),
        FIVE(CardValue.FIVE),
        SIX(CardValue.SIX),
        SEVEN(CardValue.SEVEN),
        EIGHT(CardValue.EIGHT),
        NINE(CardValue.NINE),
        TEN(CardValue.TEN),
        JACK(CardValue.TEN),
        QUEEN(CardValue.TEN),
        KING(CardValue.TEN);

    public final CardValue cardValue;

    /**
     * Creates a {@link Rank} with a {@link CardValue}.
     * @param cardValue - the {@link CardValue}.
     */
    Rank(final CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public boolean isFaceCard() {
        switch (this) {
            case KING:
            case QUEEN:
            case JACK:
                return true;
        }

        return false;
    }

    public boolean isFaceCardOrAce() {
        if (this.isFaceCard()) {
            return true;
        }

        if (this == ACE) {
            return true;
        }

        return false;
    }
}
