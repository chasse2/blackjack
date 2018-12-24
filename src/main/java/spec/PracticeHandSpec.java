package spec;

import card.CardValue;

/**
 * Specification of a practice hand consisting of:
 * <ul>
 *     <li>Two player card values</li>
 *     <li>One deal card value</li>
 * </ul>
 */
public class PracticeHandSpec {
    public CardValue playerCardValue1;
    public CardValue playerCardValue2;
    public CardValue dealerCardValue;

    /**
     * Creates a {@link PracticeHandSpec}
     * @param playerCardValue1 - the value of player card 1.
     * @param playerCardValue2 - the value of player card 2.
     * @param dealerCardValue - the value of the dealer card.
     */
    public PracticeHandSpec(final CardValue playerCardValue1,
                            final CardValue playerCardValue2,
                            final CardValue dealerCardValue) {
        this.playerCardValue1 = playerCardValue1;
        this.playerCardValue2 = playerCardValue2;
        this.dealerCardValue = dealerCardValue;
    }

    /**
     * Returns {@code true} if the dealer has an {@code ACE}.
     * @return
     * {@code boolean} representing whether the dealer has an {@code ACE}.
     */
    public final boolean hasDealerAce() {
        return this.dealerCardValue == CardValue.ACE;
    }

    /**
     * Returns {@code true} if the player has an {@code ACE}.
     * @return
     * {@code boolean} representing whether the player has an {@code ACE}.
     */
    public final boolean hasPlayerAce() {
        return this.playerCardValue1 == CardValue.ACE || this.playerCardValue2 == CardValue.ACE;
    }

    /**
     * Returns {@code true} if the player has a pair.
     * @return
     * {@code boolean} representing whether the player has a pair.
     */
    public final boolean hasPlayerPair() {
        return this.playerCardValue1 == this.playerCardValue2;
    }

    /**
     * Returns the hash code of this object.
     * @return
     * An {@code integer} representing the has code.
     */
    @Override
    public final int hashCode() {
        //todo - does this make sense?
        return 1 * playerCardValue1.ordinal()
                + 10 * playerCardValue2.ordinal()
                + 100 * dealerCardValue.ordinal();
    }

    /**
     * Returns {@code true} if the {@link Object} equals {@code this}.
     * @param obj - the {@link Object} to compare.
     * @return a {@code boolean} representing if the {@link Object} equals {@code this}.
     */
    @Override
    public final boolean equals(Object obj) {
        final PracticeHandSpec other = PracticeHandSpec.class.cast(obj);
        return this.playerCardValue1 == other.playerCardValue1
                && this.playerCardValue2 == other.playerCardValue2
                && this.dealerCardValue == other.dealerCardValue;
    }

    /**
     * Returns a {@link String} representation of this object.
     * @return
     * the {@link String} representation.
     */
    @Override
    public String toString() {
        return this.getClass().toString()
                + "(playerCardValue1=" + this.playerCardValue1
                + ", playerCardValue2=" + this.playerCardValue2
                + ", dealerCardValue=" + this.dealerCardValue + ")";
    }
}
