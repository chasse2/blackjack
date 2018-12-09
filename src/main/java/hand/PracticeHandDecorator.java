package hand;

import card.Card;
import card.CardDecorator;
import hand.PracticeHand;
import spec.PracticeHandSpec;

import java.util.Random;

public class PracticeHandDecorator {
    private final CardDecorator decorator = new CardDecorator();
    private final Random randomSwapPlayerHands = new Random();

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
