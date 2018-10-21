package practice;

import card.Card;
import card.CardValue;
import card.Rank;
import generate.RandomRank10Generator;
import generate.RandomSuitGenerator;
import spec.HandSpec;

import java.util.Random;

public class PracticeHandDecorator {
    private final RandomSuitGenerator randomSuitGenerator = new RandomSuitGenerator();
    private final RandomRank10Generator randomRank10Generator = new RandomRank10Generator();
    private final Random randomSwapPlayerHands = new Random();

    public final PracticeHand decorate(final HandSpec handSpec) {
        final Card playerCard1 = generateCard(handSpec.playerCardValue1);
        final Card playerCard2 = generateCard(handSpec.playerCardValue2);
        final Card dealerCard = generateCard(handSpec.dealerCardValue);

        final PracticeHand practiceHand;

        if (randomSwapPlayerHands.nextBoolean()) {
            practiceHand = new PracticeHand(playerCard2, playerCard1, dealerCard);
        } else {
            practiceHand = new PracticeHand(playerCard1, playerCard2, dealerCard);
        }

        return practiceHand;
    }

    private Card generateCard(final CardValue cardValue) {
        return new Card(randomSuitGenerator.generate(), generateRank(cardValue));
    }

    private Rank generateRank(final CardValue cardValue) {
        final Rank rank;

        if (cardValue.value < 10) {
            rank = Rank.values()[cardValue.value - 1];
        } else {
            rank = randomRank10Generator.generate();
        }

        return rank;
    }
}
