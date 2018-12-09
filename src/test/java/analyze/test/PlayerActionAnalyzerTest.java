package analyze.test;

import action.PlayerAction;
import analyze.PlayerActionAnalyzer;
import analyze.PlayerActionAnalyzerResult;
import card.Card;
import card.Rank;
import card.Suit;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import hand.PracticeHand;
import strategy.Strategy;
import strategy.VegasStrategy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

public class PlayerActionAnalyzerTest {
    @Test
    public void testConstructor() {
        final Strategy strategy = mock(Strategy.class);
        final PlayerActionAnalyzer analyzer = new PlayerActionAnalyzer(strategy);
        assertSame(strategy, ReflectionTestUtils.getField(analyzer, "strategy"));
    }

    @Test
    public void testAnalyze() {
        final Card playerCard1 = new Card(Rank.ACE, Suit.SPADE);
        final Card playerCard2 = new Card(Rank.ACE, Suit.HEART);
        final Card dealerCard = new Card(Rank.SIX, Suit.CLUB);
        final PracticeHand practiceHand = new PracticeHand(playerCard1, playerCard2, dealerCard);

        final PlayerActionAnalyzer analyzer = new PlayerActionAnalyzer(new VegasStrategy());
        final PlayerAction playerAction = PlayerAction.HIT;
        final PlayerActionAnalyzerResult analyzerResult = analyzer.analyze(practiceHand, playerAction);

        assertEquals(PlayerAction.SPLIT, analyzerResult.expectedAction);
        assertEquals(playerAction, analyzerResult.actualAction);
        assertEquals("Always split Aces", analyzerResult.description);
    }
}