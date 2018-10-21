package strategy;

import action.PlayerAction;
import spec.HandSpec;

public interface Strategy {
    public StrategyResult get(final HandSpec spec);
}
