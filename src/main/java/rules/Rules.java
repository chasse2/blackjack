package rules;

public interface Rules {
    public int numberOfDecks();

    public boolean dealerHitsOnSoftSeventeen(); // False for Atlantic City and Vegas
}
