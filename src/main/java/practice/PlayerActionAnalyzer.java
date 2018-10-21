package practice;

import action.PlayerAction;
import strategy.Strategy;
import strategy.StrategyResult;

public class PlayerActionAnalyzer {
    final Strategy strategy;

    public PlayerActionAnalyzer(final Strategy strategy) {
        this.strategy = strategy;
    }

    public final PlayerActionAnalyzerResult analyze(final PracticeHand practiceHand,
                                                    final PlayerAction actualAction) {
        final StrategyResult strategyResult = strategy.get(PracticeHand.specOf(practiceHand));
        return new PlayerActionAnalyzerResult(
                strategyResult.expectedPlayerAction,
                actualAction,
                strategyResult.description);
    }
}
