package generate.practice;

import hand.PracticeHand;

public interface PracticeHandGenerator {
    public PracticeHand next();
    public PracticeHand nextWithPlayerPair();
    public PracticeHand nextWithPlayerAce();
    public PracticeHand nextWithDealerAce();
}
