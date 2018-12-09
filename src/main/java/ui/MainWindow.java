package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import mode.GameMode;
import ui.scene.GameScene;
import ui.scene.PracticeScene;
import ui.scene.SelectPracticeOrGameScene;

public class MainWindow extends Application {
    Stage window;

    Button practiceSwitchSceneButton;
    Button hitButton;
    Button standButton;

    Button gameSwitchSceneButton;
    Button fooButton;
    Button barButton;


    public static void main(final String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Blackjack");

        final SelectPracticeOrGameScene selectPracticeOrGameScene = new SelectPracticeOrGameScene(this::applyGameMode);

        window.setScene(selectPracticeOrGameScene.scene);
        window.show(); // There is also a showAndWait()
        window.setOnCloseRequest((final WindowEvent e) -> this.closeWindow());
        /*
        Label practiceSceneLabel = new Label("Welcome to Practice Scene");

        practiceSwitchSceneButton = new Button();
        practiceSwitchSceneButton.setText("Switch Scene");
        practiceSwitchSceneButton.setOnAction((final ActionEvent e) -> {
            window.setScene(gameScene);
        });

        hitButton = new Button();
        hitButton.setText("Hit");
        hitButton.setOnAction(new HitActionEventHandler());

        standButton = new Button();
        standButton.setText("Stand");
        standButton.setOnAction((final ActionEvent e) -> {
            System.out.println("Stand action event handler");
        });

        VBox practiceLayout = new VBox(3);  // # Pixels between each ...
        practiceLayout.getChildren().add(practiceSceneLabel);
        practiceLayout.getChildren().add(practiceSwitchSceneButton);
        practiceLayout.getChildren().add(hitButton);
        practiceLayout.getChildren().add(standButton);

        practiceScene = new Scene(practiceLayout, 300, 250);
        window.setScene(practiceScene);
        window.show(); // There is also a showAndWait()
        window.setOnCloseRequest((final WindowEvent e) -> this.closeWindow());

        gameSwitchSceneButton = new Button("Switch to Practice");
        gameSwitchSceneButton.setOnAction(e -> window.setScene(practiceScene));
        fooButton = new Button("Foo");
        fooButton.setOnAction(e -> System.out.println("Foo action event handler"));
        barButton = new Button("Bar");
        barButton.setOnAction(e -> System.out.println("Bar action event handler"));
        HBox gameLayout = new HBox(3);
        gameLayout.getChildren().addAll(gameSwitchSceneButton, fooButton, barButton);

        gameScene = new Scene(gameLayout, 300, 250);
*/
    }

    private void closeWindow() {
        System.out.println("Cleanup before close ...");
    }

    void applyGameMode(final GameMode gameMode) {
        System.out.println("GameMode: " + gameMode);

        final Scene scene = (gameMode == GameMode.PRACTICE)
                ? new PracticeScene().scene
                : new GameScene().scene;

        window.setScene(scene);
    }
}
