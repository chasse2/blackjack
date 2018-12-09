import action.PlayerAction;
import analyze.PlayerActionAnalyzer;
import analyze.PlayerActionAnalyzerResult;
import card.CardDecorator;
import card.CardValue;
import generate.practice.PracticeHandGenerator;
import generate.practice.StandardPracticeHandGenerator;
import hand.PracticeHand;
import org.junit.Test;
import spec.PracticeHandSpec;
import strategy.VegasStrategy;

import java.util.*;

import static org.mockito.Mockito.mock;

public class Foo {

    final PlayerActionAnalyzer analyzer = new PlayerActionAnalyzer(new VegasStrategy());

    @Test
    public final void test() {
        final PracticeHandSpec handSpec1 = new PracticeHandSpec(CardValue.ACE, CardValue.ACE, CardValue.ACE);
        final PracticeHandSpec handSpec2 = new PracticeHandSpec(CardValue.TWO, CardValue.TWO, CardValue.SIX);

        final Set<PracticeHandSpec> handSpecs = new LinkedHashSet<>(Arrays.asList(handSpec1, handSpec2));
        final PracticeHandGenerator handGenerator = new StandardPracticeHandGenerator(handSpecs);

        final PracticeHand practiceHand = handGenerator.next();

        final PlayerAction actualAction = PlayerAction.SPLIT;

        final PlayerActionAnalyzerResult result = analyzer.analyze(practiceHand, actualAction);

        System.out.printf("For hand " + practiceHand.toString() + ", result is: " + result.toString());
    }

    @Test
    public final void testMockito() {
        CardDecorator cardDecorator = mock(CardDecorator.class);
    }
}
