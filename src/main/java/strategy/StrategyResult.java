package strategy;

import action.PlayerAction;

/**
 * A {@link StrategyResult} consisting of:
 * <ul>
 *     <li>A {@link PlayerAction}</li>
 *     <li>A description</li>
 * </ul>
 */
public class StrategyResult {
    public final PlayerAction expectedPlayerAction;
    public final String description;

    /**
     * Creates a {@link StrategyResult} consisting of a {@link PlayerAction} and a description.
     * @param expectedPlayerAction - An expected {@link PlayerAction}.
     * @param description - A description.
     */
    public StrategyResult(final PlayerAction expectedPlayerAction,
                          final String description) {
        this.expectedPlayerAction = expectedPlayerAction;
        this.description = description;
    }
}
