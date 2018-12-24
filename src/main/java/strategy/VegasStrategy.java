package strategy;

import action.PlayerAction;
import card.CardValue;
import spec.PracticeHandSpec;

import java.util.HashMap;
import java.util.Map;

/**
 * A {@link Strategy} based on Vegas rules.
 */
public class VegasStrategy implements Strategy {
    private static final Map<PracticeHandSpec, StrategyResult> strategyMap = new HashMap<>();

    static {
        strategyMap.put(new PracticeHandSpec(CardValue.ACE, CardValue.ACE, CardValue.ACE),
                new StrategyResult(PlayerAction.SPLIT, "Always split Aces"));
        //todo - fill this in ...
        strategyMap.put(new PracticeHandSpec(CardValue.ACE, CardValue.ACE, CardValue.SIX),
                new StrategyResult(PlayerAction.SPLIT, "Always split Aces"));
        // ...
        strategyMap.put(new PracticeHandSpec(CardValue.TWO, CardValue.TWO, CardValue.SIX),
                new StrategyResult(PlayerAction.SPLIT, "todoDescription for 2, 2, 6"));
    }

    /**
     * Determine the expected play for a {@link PracticeHandSpec}.
     * @param spec - A specification for a practice hand.
     * @return
     * a {@link StrategyResult} representing the expected play.
     */
    @Override
    public final StrategyResult determineExpected(final PracticeHandSpec spec) {
        return this.strategyMap.get(spec);
    }
}
