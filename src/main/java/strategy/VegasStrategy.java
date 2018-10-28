package strategy;

import action.PlayerAction;
import card.CardValue;
import spec.HandSpec;

import java.util.HashMap;
import java.util.Map;

public class VegasStrategy implements Strategy {
    private static final Map<HandSpec, StrategyResult> strategyMap = new HashMap<>();

    static {
        strategyMap.put(new HandSpec(CardValue.ACE, CardValue.ACE, CardValue.ACE),
                new StrategyResult(PlayerAction.SPLIT, "Always split Aces"));
        //todo - fill this in ...
        strategyMap.put(new HandSpec(CardValue.ACE, CardValue.ACE, CardValue.SIX),
                new StrategyResult(PlayerAction.SPLIT, "Always split Aces"));
        // ...
        strategyMap.put(new HandSpec(CardValue.TWO, CardValue.TWO, CardValue.SIX),
                new StrategyResult(PlayerAction.SPLIT, "todoDescription for 2, 2, 6"));
    }

    @Override
    public final StrategyResult get(final HandSpec spec) {
        return this.strategyMap.get(spec);
    }
}
