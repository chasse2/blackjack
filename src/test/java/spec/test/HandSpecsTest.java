package spec.test;

import org.junit.Test;
import spec.HandSpec;
import spec.HandSpecs;

import java.util.Set;

public class HandSpecsTest {
    @Test
    public final void testAll() {
        final Set<HandSpec> actual = HandSpecs.all;
        final int i = 0;
        actual.forEach(x -> System.out.println(
                x.playerCardValue1.name() + " " +
                x.playerCardValue2.name() + " " +
                x.dealerCardValue.name()
        ));
    }
}