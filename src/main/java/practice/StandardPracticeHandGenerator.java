package practice;

import spec.HandSpec;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StandardPracticeHandGenerator implements PracticeHandGenerator {
    private final PracticeHandDecorator decorator = new PracticeHandDecorator();

    private final Set<HandSpec> specs = new LinkedHashSet<>();
    private final Set<HandSpec> specsWithDealerAce = new LinkedHashSet<>();
    private final Set<HandSpec> specsWithPlayerPair = new LinkedHashSet<>();
    private final Set<HandSpec> specsWithPlayerAce = new LinkedHashSet<>();

    volatile private Iterator<HandSpec> specIterator;
    volatile private Iterator<HandSpec> specsWithDealAceIterator;
    volatile private Iterator<HandSpec> specsWithPlayerAceIterator;
    volatile private Iterator<HandSpec> specsWithPlayerPairIterator;

    public StandardPracticeHandGenerator(final Set<HandSpec> specs) {
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
