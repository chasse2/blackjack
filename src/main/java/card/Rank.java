package card;

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

    Rank(final CardValue cardValue) {
        this.cardValue = cardValue;
    }
}
