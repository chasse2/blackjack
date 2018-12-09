package analyze;

import action.PlayerAction;
import hand.PracticeHand;
import spec.PracticeHandSpec;
import strategy.Strategy;
import strategy.StrategyResult;

public class PlayerActionAnalyzer {
    private final Strategy strategy;

    public PlayerActionAnalyzer(final Strategy strategy) {
        this.strategy = strategy;
    }

    public final PlayerActionAnalyzerResult analyze(final PracticeHand practiceHand,
                                                    final PlayerAction actualAction) {
        final PracticeHandSpec handSpec = PracticeHand.specOf(practiceHand);
        final StrategyResult strategyResult = strategy.get(handSpec);
        return new PlayerActionAnalyzerResult(
                strategyResult.expectedPlayerAction,
                actualAction,
                strategyResult.description);
    }
}
