package strategy;

import spec.PracticeHandSpec;

/**
 * Determines the expected play for a practice hand.
 */
public interface Strategy {
    /**
     * Determine the expected play for a practice hand.
     * @param spec - A specification for a practice hand.
     * @return
     * a {@link StrategyResult} representing the expected play.
     */
    StrategyResult determineExpected(final PracticeHandSpec spec);
}
