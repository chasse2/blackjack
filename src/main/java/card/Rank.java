package card;

public enum Rank {
    ACE(CardValue.ONE),
    DEUCE(CardValue.TWO),
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
    public final int value() {
        return this.cardValue.value;
    }

    Rank(final CardValue cardValue) {
        this.cardValue = cardValue;
    }
}
