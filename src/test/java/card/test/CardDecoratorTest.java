package card.test;

import card.CardDecorator;
import generate.RandomRank10Generator;
import generate.RandomSuitGenerator;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class CardDecoratorTest {
    /*
    private final RandomSuitGenerator randomSuitGenerator = new RandomSuitGenerator();
    private final RandomRank10Generator randomRank10Generator = new RandomRank10Generator();

        public Card decorate(final CardValue cardValue) {
        final Suit suit = randomSuitGenerator.generate();
        final Rank rank = generateRank(cardValue);
        return new Card(rank, suit);
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
*/

    //todo - Dependency Injection
    @Ignore
    @Test
    public void testDecorate() {
        final RandomSuitGenerator suitGenerator = mock(RandomSuitGenerator.class);
        final RandomRank10Generator rank10Generator = mock(RandomRank10Generator.class);

        ReflectionTestUtils.setField(CardDecorator.class, "randomSuitGenerator", suitGenerator);
        ReflectionTestUtils.setField(CardDecorator.class, "randomRank10Generator", rank10Generator);

        final CardDecorator decorator = new CardDecorator();

    }
}