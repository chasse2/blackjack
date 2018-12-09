package strategy;

import action.PlayerAction;
import card.CardValue;
import spec.PracticeHandSpec;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    public final StrategyResult get(final PracticeHandSpec spec) {
        return this.strategyMap.get(spec);
    }
}
