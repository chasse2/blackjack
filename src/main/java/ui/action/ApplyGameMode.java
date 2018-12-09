package ui.action;

import mode.GameMode;

@FunctionalInterface
public interface ApplyGameMode {
    void apply(final GameMode gameMode);
}
