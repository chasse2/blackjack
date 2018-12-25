package image;

import card.Card;
import javafx.scene.image.ImageView;

/**
 * An image library for card fronts and backs.
 */
public interface ImageLibrary {

    /**
     * Checkout the default card back.
     * @return - an {@link ImageView} of the default card back.
     */
    ImageView checkoutCardBack();

    /**
     * Checkout a specific card back.
     * @param cardBackImage - {@link CardBackImage} indicating the desired card back.
     * @return - an {@link ImageView} of specified card back,
     */
    ImageView checkoutCardBack(final CardBackImage cardBackImage);

    /**
     * Checkout a card front.
     * @param card - the {@link Card} which the image should represent.
     * @return - the {@link ImageView} presenting the specified card.
     */
    ImageView checkoutCardFront(final Card card);
}
