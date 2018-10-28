package card;

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

    CardValue(final int value) {
        this.value = value;
        this.lowValue = value;
        this.highValue = value;
        this.isSingleValue = true;
    }

    CardValue(final int lowValue, final int highValue) {
        this.value = lowValue;
        this.lowValue = lowValue;
        this.highValue = highValue;
        this.isSingleValue = false;
    }
}
