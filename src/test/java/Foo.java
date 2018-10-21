import action.PlayerAction;
import card.CardValue;
import org.junit.Test;
import practice.*;
import spec.HandSpec;
import strategy.VegasStrategy;

import java.util.*;

public class Foo {

    final PlayerActionAnalyzer analyzer = new PlayerActionAnalyzer(new VegasStrategy());

    @Test
    public final void test() {
        final HandSpec handSpec1 = new HandSpec(CardValue.ONE, CardValue.ONE, CardValue.ONE);
        final HandSpec handSpec2 = new HandSpec(CardValue.TWO, CardValue.TWO, CardValue.SIX);

        final Set<HandSpec> handSpecs = new LinkedHashSet<>(Arrays.asList(handSpec1, handSpec2));
        final PracticeHandGenerator handGenerator = new StandardPracticeHandGenerator(handSpecs);

        final PracticeHand practiceHand = handGenerator.next();

        final PlayerAction actualAction = PlayerAction.SPLIT;

        final PlayerActionAnalyzerResult result = analyzer.analyze(practiceHand, actualAction);

        // todo: Add toString()'s for each class ...
        System.out.printf("For hand " + practiceHand.toString() + ", result is: " + result.toString());
    }

}
