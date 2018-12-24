package analyze;

import action.PlayerAction;
import hand.PracticeHand;
import spec.PracticeHandSpec;
import strategy.Strategy;
import strategy.StrategyResult;

/**
 * Analyzes practice hands by comparing expected actions to actual actions based on a strategy.
 */
public class PlayerActionAnalyzer {
    private final Strategy strategy;

    /**
     * Constructs a {@link PlayerActionAnalyzer} object that will provide results based on a {@link Strategy}.
     * @param strategy - the {@link Strategy} used to analyze {@link PlayerAction}'s.
     */
    public PlayerActionAnalyzer(final Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Analyses a {@link PracticeHand} by comparing the expected action to an actual {@link PlayerAction}.
     * @param practiceHand - a practice hand.
     * @param actualAction - an actual {@link PlayerAction}.
     * @return the result of comparing an expected action to an actual action
     */
    public final PlayerActionAnalyzerResult analyze(final PracticeHand practiceHand,
                                                    final PlayerAction actualAction) {
        final PracticeHandSpec handSpec = PracticeHand.specOf(practiceHand);
        final StrategyResult strategyResult = strategy.determineExpected(handSpec);
        return new PlayerActionAnalyzerResult(
                strategyResult.expectedPlayerAction,
                actualAction,
                strategyResult.description);
    }
}
