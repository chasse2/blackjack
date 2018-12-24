package rules;

/**
 * The rules of a game.
 */
public interface Rules {
    int numberOfDecks();

    boolean dealerHitsOnSoftSeventeen(); // False for Atlantic City and Vegas
}
