package practice;

public interface PracticeHandGenerator {
    public PracticeHand next();
    public PracticeHand nextWithPlayerPair();
    public PracticeHand nextWithPlayerAce();
    public PracticeHand nextWithDealerAce();
}
