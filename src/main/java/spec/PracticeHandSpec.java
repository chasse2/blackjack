package spec;

import card.CardValue;

public class PracticeHandSpec {
    public CardValue playerCardValue1;
    public CardValue playerCardValue2;
    public CardValue dealerCardValue;

    public PracticeHandSpec(final CardValue playerCardValue1,
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
    public final int hashCode() {
        //todo - does this make sense?
        return 1 * playerCardValue1.ordinal()
                + 10 * playerCardValue2.ordinal()
                + 100 * dealerCardValue.ordinal();
    }

    @Override
    public final boolean equals(Object obj) {
        final PracticeHandSpec other = PracticeHandSpec.class.cast(obj);
        return this.playerCardValue1 == other.playerCardValue1
                && this.playerCardValue2 == other.playerCardValue2
                && this.dealerCardValue == other.dealerCardValue;
    }

    @Override
    public String toString() {
        return "PlayerCard1:" + playerCardValue1.toString()
                + ";PlayerCard2:" + playerCardValue2.toString()
                + ";DealerCard:" + dealerCardValue.toString();
    }
}
