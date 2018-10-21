package practice;

import action.PlayerAction;

public class PlayerActionAnalyzerResult {
    public final PlayerAction expectedAction;
    public final PlayerAction actualAction;
    public final String description;

    public PlayerActionAnalyzerResult(final PlayerAction expectedAction,
                                      final PlayerAction actualAction,
                                      final String description) {
        this.expectedAction = expectedAction;
        this.actualAction = actualAction;
        this.description = description;
    }

    @Override
    public String toString() {
        return "(ExpectedAction:" + this.expectedAction
                + ";ActualAction:" + this.actualAction
                + ";Description:" + this.description + ")";
    }
}
