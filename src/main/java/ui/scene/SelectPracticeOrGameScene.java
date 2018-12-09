package ui.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import mode.GameMode;
import ui.action.ApplyGameMode;

public class SelectPracticeOrGameScene {
    private final static int HEIGHT = 200;
    private final static int WIDTH = 200;

    public final Scene scene;
    private final ApplyGameMode applyGameMode;

    public SelectPracticeOrGameScene(final ApplyGameMode applyGameMode) {
        this.applyGameMode = applyGameMode;

        final VBox layout = new VBox();
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        scene = new Scene(layout, HEIGHT, WIDTH);

        final Label label = new Label("I want to ...");

        final Button practiceButton = new Button("Practice");
        practiceButton.setOnAction(e -> this.applyGameMode.apply(GameMode.PRACTICE));

        final Button playGameButton = new Button("Play Game");
        playGameButton.setOnAction(e -> this.applyGameMode.apply(GameMode.PLAY_GAME));

        layout.getChildren().addAll(label, practiceButton, playGameButton);
    }
}
