package generate.practice;

import hand.PracticeHand;
import hand.PracticeHandDecorator;
import spec.PracticeHandSpec;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StandardPracticeHandGenerator implements PracticeHandGenerator {
    private final PracticeHandDecorator decorator = new PracticeHandDecorator();

    private final Set<PracticeHandSpec> specs = new LinkedHashSet<>();
    private final Set<PracticeHandSpec> specsWithDealerAce = new LinkedHashSet<>();
    private final Set<PracticeHandSpec> specsWithPlayerAce = new LinkedHashSet<>();
    private final Set<PracticeHandSpec> specsWithPlayerPair = new LinkedHashSet<>();

    volatile private Iterator<PracticeHandSpec> specIterator;
    volatile private Iterator<PracticeHandSpec> specsWithDealAceIterator;
    volatile private Iterator<PracticeHandSpec> specsWithPlayerAceIterator;
    volatile private Iterator<PracticeHandSpec> specsWithPlayerPairIterator;

    public StandardPracticeHandGenerator(final Set<PracticeHandSpec> specs) {
        this.specs.addAll(specs);
        this.initializePracticeHands();
        this.specIterator = this.specs.iterator();
        this.specsWithDealAceIterator = this.specsWithDealerAce.iterator();
        this.specsWithPlayerAceIterator = this.specsWithPlayerAce.iterator();
        this.specsWithPlayerPairIterator = this.specsWithPlayerPair.iterator();
    }

    public PracticeHand next() {
        if (!specIterator.hasNext()) {
            specIterator = this.specs.iterator();
        }

        return decorator.decorate(specIterator.next());
    }

    @Override
    public PracticeHand nextWithDealerAce() {
        if (!specsWithDealAceIterator.hasNext()) {
            specsWithDealAceIterator = this.specsWithDealerAce.iterator();
        }

        return decorator.decorate(specsWithDealAceIterator.next());
    }

    @Override
    public PracticeHand nextWithPlayerAce() {
        if (!specsWithPlayerAceIterator.hasNext()) {
            specsWithPlayerAceIterator = this.specsWithPlayerAce.iterator();
        }

        return decorator.decorate(specsWithPlayerAceIterator.next());
    }

    @Override
    public PracticeHand nextWithPlayerPair() {
        if (!specsWithPlayerPairIterator.hasNext()) {
            specsWithPlayerPairIterator = this.specsWithPlayerPair.iterator();
        }

        return decorator.decorate(specsWithPlayerPairIterator.next());
    }

    private void initializePracticeHands() {
        this.specs.forEach(spec -> {
            if (spec.hasDealerAce()) {
                specsWithDealerAce.add(spec);
            }

            if (spec.hasPlayerAce()) {
                specsWithPlayerAce.add(spec);
            }

            if (spec.hasPlayerPair()) {
                specsWithPlayerPair.add(spec);
            }
        });
    }
}
