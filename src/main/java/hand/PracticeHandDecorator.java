package hand;

import card.Card;
import card.CardDecorator;
import spec.PracticeHandSpec;

import java.util.Random;

/**
 * Creates a {@link PracticeHand} by decorating a {@link PracticeHandSpec}.
 * This essentially add {@link card.Rank}'s and {@link card.Suit}'s to {@link card.CardValue}'s.
 */
public class PracticeHandDecorator {
    private final CardDecorator decorator = new CardDecorator();
    private final Random randomSwapPlayerHands = new Random();

    /**
     * Creates a {@link PracticeHand} by decorating a {@link PracticeHandSpec}.
     * @param handSpec - a specification for a {@link PracticeHand}.
     * @return
     * a {@link PracticeHand}.
     */
    public final PracticeHand decorate(final PracticeHandSpec handSpec) {
        final Card playerCard1 = decorator.decorate(handSpec.playerCardValue1);
        final Card playerCard2 = decorator.decorate(handSpec.playerCardValue2);
        final Card dealerCard = decorator.decorate(handSpec.dealerCardValue);

        final PracticeHand practiceHand;

        if (randomSwapPlayerHands.nextBoolean()) {
            practiceHand = new PracticeHand(playerCard2, playerCard1, dealerCard);
        } else {
            practiceHand = new PracticeHand(playerCard1, playerCard2, dealerCard);
        }

        return practiceHand;
    }
}
