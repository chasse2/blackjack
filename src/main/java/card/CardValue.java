package card;

/**
 * The value of a playing card.
 */
public enum  CardValue {
    ACE(1, 11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    public final int value;
    public final int lowValue;
    public final int highValue;

    public final boolean isSingleValue;

    /**
     * Constructs a {@link CardValue} representing a numeric.
     * @param value
     */
    CardValue(final int value) {
        this.value = value;
        this.lowValue = value;
        this.highValue = value;
        this.isSingleValue = true;
    }

    /**
     * Constructs a {@link CardValue} representing two numerics: a low value and a high value.
     * E.g. an {@code Ace} with a low value of 1 and a high value of 11.
     * @param lowValue
     * @param highValue
     */
    CardValue(final int lowValue, final int highValue) {
        this.value = lowValue;
        this.lowValue = lowValue;
        this.highValue = highValue;
        this.isSingleValue = false;
    }
}
