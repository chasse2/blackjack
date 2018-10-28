package spec;

import card.CardValue;

public class HandSpec {
    public CardValue playerCardValue1;
    public CardValue playerCardValue2;
    public CardValue dealerCardValue;

    public HandSpec(final CardValue playerCardValue1,
                    final CardValue playerCardValue2,
                    final CardValue dealerCardValue) {
        this.playerCardValue1 = playerCardValue1;
        this.playerCardValue2 = playerCardValue2;
        this.dealerCardValue = dealerCardValue;
    }

    public final boolean hasDealerAce() {
        return this.dealerCardValue == CardValue.ACE;
    }

    public final boolean hasPlayerAce() {
        return this.playerCardValue1 == CardValue.ACE || this.playerCardValue2 == CardValue.ACE;
    }

    public final boolean hasPlayerPair() {
        return this.playerCardValue1 == this.playerCardValue2;
    }

    @Override
    public int hashCode() {
        //todo - does this make sense?
        return playerCardValue1.value
                + (10 + playerCardValue2.value)
                + (100 + dealerCardValue.value);
    }

    @Override
    public boolean equals(Object obj) {
        final HandSpec other = HandSpec.class.cast(obj);
        return this.playerCardValue1 == other.playerCardValue1
                && this.playerCardValue2 == other.playerCardValue2
                && this.dealerCardValue == other.dealerCardValue;
    }
}
