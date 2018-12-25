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
}
