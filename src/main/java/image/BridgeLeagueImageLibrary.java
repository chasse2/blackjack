package image;

import card.Card;
import card.Deck;
import javafx.scene.image.ImageView;

import java.util.HashMap;

/**
 * An image library for card fronts and backs as supplied by the American Contract Bridge League.
 */
public class BridgeLeagueImageLibrary implements ImageLibrary {

    private String root = "file:///Users/eenglish/Downloads/Playing-Card-Images/JPEG/";
    private String extension = ".jpg";

    private final HashMap<CardBackImage, ImageView> cardBackImages = new HashMap<>(CardBackImage.values().length);
    private final HashMap<Card, ImageView> cardFrontImages = new HashMap<>(Deck.CARDS_PER_DECK);
    private final ImageFetcher fetcher = new ImageFetcher();
    private final ImageSize size = new ImageSize(100, 153);

    /**
     * Checkout the default card back.
     * @return - an {@link ImageView} of the default card back.
     */
    @Override
    public ImageView checkoutCardBack() {
        return cardBackImages.computeIfAbsent(CardBackImage.DEFAULT, this::fetchCardBackImage);
    }

    /**
     * Checkout a specific card back.
     * @param cardBackImage - {@link CardBackImage} indicating the desired card back.
     * @return - an {@link ImageView} of specified card back,
     */
    @Override
    public ImageView checkoutCardBack(final CardBackImage cardBackImage) {
        return cardBackImages.computeIfAbsent(cardBackImage, this::fetchCardBackImage);
    }

    /**
     * Checkout a card front.
     * @param card - the {@link Card} which the image should represent.
     * @return - the {@link ImageView} presenting the specified card.
     */
    @Override
    public ImageView checkoutCardFront(final Card card) {
       return cardFrontImages.computeIfAbsent(card, this::fetchCardFrontImage);
    }

    private ImageView fetchCardBackImage(final CardBackImage cardBackImage) {
        final ImageView imageView = this.fetcher.fetch(root + "blue_back" + extension);
        imageView.setFitWidth(this.size.fitWidth);
        imageView.setFitHeight(this.size.fitHeight);
        return imageView;
    }

    private ImageView fetchCardFrontImage(final Card card) {
        final ImageView imageView = this.fetcher.fetch(generateUrl(card));
        imageView.setFitWidth(this.size.fitWidth);
        imageView.setFitHeight(this.size.fitHeight);
        return imageView;
    }

    private String generateUrl(final Card card) {
        return root + generateRankString(card) + generateSuitString(card) + extension;
    }

    private String generateRankString(final Card card) {
        final String rankString;

        if (card.rank.isFaceCardOrAce()) {
            rankString = card.rank.name().substring(0, 1);
        } else {
            rankString = Integer.toString(card.rank.cardValue.value);
        }

        return rankString;
    }

    private String generateSuitString(final Card card) {
        return card.suit.name().substring(0, 1);
    }
}
