package spec;

import card.CardValue;

import java.util.LinkedHashSet;
import java.util.Set;

public class HandSpecs {
    public static final Set<HandSpec> all = new LinkedHashSet<>();

    static {
        for (CardValue playerCard1 : CardValue.values()) {
            for (CardValue playerCard2 : CardValue.values()) {
                if (playerCard2.value < playerCard1.value) {
                    // Skip duplicates
                    continue;
                }
                for (CardValue dealerCard : CardValue.values()) {
                    final HandSpec handSpec = new HandSpec(playerCard1, playerCard2, dealerCard);
                    all.add(handSpec);
                    System.out.println(handSpec.hashCode() + " " +  handSpec.toString());
                }
            }
        }
    }
}
