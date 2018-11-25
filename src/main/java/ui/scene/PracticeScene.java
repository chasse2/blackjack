package ui.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import mode.Mode;

public class PracticeScene {
    private final static int HEIGHT = 200;
    private final static int WIDTH = 200;

    public final Scene scene;

    public PracticeScene() {
        final VBox layout = new VBox();
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        scene = new Scene(layout, HEIGHT, WIDTH);

        final Label label = new Label("Practice");

        layout.getChildren().addAll(label);
    }
}
