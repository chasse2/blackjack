package strategy;

import action.PlayerAction;
import card.CardValue;
import spec.HandSpec;

import java.util.HashMap;
import java.util.Map;

public class VegasStrategy implements Strategy {
    private static final Map<HandSpec, StrategyResult> strategyMap = new HashMap<>();

    static {
        strategyMap.put(new HandSpec(CardValue.ONE, CardValue.ONE, CardValue.ONE),
                new StrategyResult(PlayerAction.SPLIT, "todoDescription"));
        //todo - fill this in ...
    }

    @Override
    public final StrategyResult get(final HandSpec spec) {
        return this.strategyMap.get(spec);
    }
}
