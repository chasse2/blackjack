package ui.action;

import mode.Mode;

import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
public interface ApplyGameMode {
    void apply(final Mode mode);
}
