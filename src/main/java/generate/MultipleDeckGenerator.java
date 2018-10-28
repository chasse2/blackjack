package generate;

import card.Card;
import card.Rank;
import card.Suit;

import java.util.LinkedList;
import java.util.List;

//todo : For eventual actual blackjack game (not practice level)
public class MultipleDeckGenerator {
    public final List<Card> generate(final int numDecks) {
        final List<Card> cards = new LinkedList<>();
        for (int i = 0; i < numDecks; ++i) {
            cards.addAll(generateDeck());
        }
        return cards;
    }


    private List<Card> generateDeck() {
        final List<Card> cards = new LinkedList<>();
        cards.addAll(generateSuit(Suit.CLUB));
        cards.addAll(generateSuit(Suit.DIAMOND));
        cards.addAll(generateSuit(Suit.HEART));
        cards.addAll(generateSuit(Suit.SPADE));
        return cards;
    }

    private List<Card> generateSuit(final Suit suit) {
        final List<Card> cards = new LinkedList<>();
        cards.add(new Card(Rank.ACE, suit));
        cards.add(new Card(Rank.TWO, suit));
        cards.add(new Card(Rank.THREE, suit));
        cards.add(new Card(Rank.FOUR, suit));
        cards.add(new Card(Rank.FIVE, suit));
        cards.add(new Card(Rank.SIX, suit));
        cards.add(new Card(Rank.SEVEN, suit));
        cards.add(new Card(Rank.EIGHT, suit));
        cards.add(new Card(Rank.NINE, suit));
        cards.add(new Card(Rank.TEN, suit));
        cards.add(new Card(Rank.JACK, suit));
        cards.add(new Card(Rank.QUEEN, suit));
        cards.add(new Card(Rank.KING, suit));
        return cards;
    }
}
