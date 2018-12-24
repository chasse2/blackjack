package analyze;

import action.PlayerAction;

/**
 * Contains:
 * <ul>
 *     <li>A player's expected action</li>
 *     <li>A player's actual action</li>
 *     <li>A description</li>
 * </ul>
 */
public class PlayerActionAnalyzerResult {
    public final PlayerAction expectedAction;
    public final PlayerAction actualAction;
    public final String description;

    /**
     * Constructs a {@link PlayerActionAnalyzerResult} with an expected action, actual action, and description.
     * @param expectedAction - the expected {@link PlayerAction}.
     * @param actualAction - the actual {@link PlayerAction}.
     * @param description - a description.
     */
    public PlayerActionAnalyzerResult(final PlayerAction expectedAction,
                                      final PlayerAction actualAction,
                                      final String description) {
        this.expectedAction = expectedAction;
        this.actualAction = actualAction;
        this.description = description;
    }

    /**
     * Returns a string representation of a {@link PlayerActionAnalyzerResult}.
     * @return
     * the string representation {@link PlayerActionAnalyzerResult}.
     */
    @Override
    public String toString() {
        return this.getClass().toString()
        + "(expectedAction=" + this.expectedAction
        + ", actualAction=" + this.actualAction
        + ", description=" + this.description + ")";
    }
}
