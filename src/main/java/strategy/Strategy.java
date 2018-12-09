package strategy;

import spec.PracticeHandSpec;

public interface Strategy {
    public StrategyResult get(final PracticeHandSpec spec);
}
