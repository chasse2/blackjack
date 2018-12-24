package hand;

import card.Card;
import spec.PracticeHandSpec;

/**
 * A practice hand consisting of:
 * <ul>
 *     <li>Two player cards</li>
 *     <li>One dealer card</li>
 * </ul>
 */
public class PracticeHand {
    public final Card playerCard1;
    public final Card playerCard2;
    public final Card dealerCard;

    public static PracticeHandSpec specOf(final PracticeHand practiceHand) {
        return new PracticeHandSpec(
                practiceHand.playerCard1.rank.cardValue,
                practiceHand.playerCard2.rank.cardValue,
                practiceHand.dealerCard.rank.cardValue);
    }

    public PracticeHand(final Card playerCard1,
                        final Card playerCard2,
                        final Card dealerCard) {
        this.playerCard1 = playerCard1;
        this.playerCard2 = playerCard2;
        this.dealerCard = dealerCard;
    }

    @Override
    public String toString() {
        return this.getClass().toString()
                + "(PlayerCard1=" + this.playerCard1
                + ", PlayerCard2=" + this.playerCard2
                + ", DealerCard=" + dealerCard + ")";
    }
}
