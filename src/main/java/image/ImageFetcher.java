package image;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Fetches an {@link ImageView} from a file URL.
 */
public class ImageFetcher {
    /**
     * Fetch an {@link ImageView} from a file URL.
     * @param url - the file URL.
     * @return the {@link ImageView}.
     */
    ImageView fetch(final String url) {
        final Image image = new Image(url);
        return new ImageView(image);
    }

    /**
     * Fetch an {@link ImageView} from a file URL and apply size-related attributes.
     * @param url - the file URL.
     * @param size - the size attributes to apply.
     * @return the {@link ImageView} with the applied size attributes.
     */
    ImageView fetch(final String url, final ImageSize size) {
        final Image image = new Image(url);
        final ImageView imageView = new ImageView(image);
        imageView.setFitWidth(size.fitWidth);
        imageView.setFitHeight(size.fitHeight);
        imageView.setPreserveRatio(true);
        return imageView;
    }
}
