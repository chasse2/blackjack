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
        return this.dealerCardValue == CardValue.ONE;
    }

    public final boolean hasPlayerAce() {
        return this.playerCardValue1 == CardValue.ONE || this.playerCardValue2 == CardValue.ONE;
    }

    public final boolean hasPlayerPair() {
        return this.playerCardValue1 == this.playerCardValue2;
    }
}
