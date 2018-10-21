package strategy;

import action.PlayerAction;

public class StrategyResult {
    public final PlayerAction expectedPlayerAction;
    public final String description;

    public StrategyResult(final PlayerAction expectedPlayerAction,
                          final String description) {
        this.expectedPlayerAction = expectedPlayerAction;
        this.description = description;
    }
}
