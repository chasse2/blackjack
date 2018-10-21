package card;

public enum  CardValue {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11);

    public int value;

    CardValue(final int value) {
        this.value = value;
    }
}
