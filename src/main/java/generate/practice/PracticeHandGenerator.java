package generate.practice;

import hand.PracticeHand;

/**
 * Generates {@link PracticeHand}'s.
 */
public interface PracticeHandGenerator {
    /**
     * Generates the next {@link PracticeHand}.
     * @return
     * a {@link PracticeHand}.
     */
    PracticeHand next();

    /**
     * Generates the next {@link PracticeHand} that is a pair.
     * @return
     * a {@link PracticeHand}.
     */
    PracticeHand nextWithPlayerPair();

    /**
     * Generates the next {@link PracticeHand} containing a player {@code ACE}.
     * @return
     * a {@link PracticeHand}.
     */
    PracticeHand nextWithPlayerAce();

    /**
     * Generates the next {@link PracticeHand} containing a dealer {@code ACE}..
     * @return
     * a {@link PracticeHand}.
     */
    PracticeHand nextWithDealerAce();
}
