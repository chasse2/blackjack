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
        cards.add(new Card(suit, Rank.ACE));
        cards.add(new Card(suit, Rank.DEUCE));
        cards.add(new Card(suit, Rank.THREE));
        cards.add(new Card(suit, Rank.FOUR));
        cards.add(new Card(suit, Rank.FIVE));
        cards.add(new Card(suit, Rank.SIX));
        cards.add(new Card(suit, Rank.SEVEN));
        cards.add(new Card(suit, Rank.EIGHT));
        cards.add(new Card(suit, Rank.NINE));
        cards.add(new Card(suit, Rank.TEN));
        cards.add(new Card(suit, Rank.JACK));
        cards.add(new Card(suit, Rank.QUEEN));
        cards.add(new Card(suit, Rank.KING));
        return cards;
    }
}
