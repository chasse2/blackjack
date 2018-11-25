package ui.scene;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class PracticeScene {
    private final static int WIDTH = 500;
    private final static int HEIGHT = 400;

    public final Scene scene;

    public PracticeScene() {
        final GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        final Label dealerLabel = new Label("Dealer");
        GridPane.setConstraints(dealerLabel, 0, 0);
        GridPane.setFillWidth(dealerLabel, true);

        final Label dealerCardsPlaceHolder = new Label("Dealer Cards Placeholder");
        GridPane.setConstraints(dealerCardsPlaceHolder, 0, 1, 2, 2);

        final Label playerCardPlaceholder1 = new Label("Player Card PlaceHolder 1");
        GridPane.setConstraints(playerCardPlaceholder1, 0, 3, 1, 2);

        final Label playerCardPlaceholder2 = new Label("Player Card PlaceHolder 2");
        GridPane.setConstraints(playerCardPlaceholder2, 1, 3, 1, 2);

        final Button doubleDownButton = new Button("Double Down");
        GridPane.setConstraints(doubleDownButton, 2, 1, 1, 1);
        doubleDownButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setFillWidth(doubleDownButton, true);

        final Button hitButton = new Button("Hit");
        GridPane.setConstraints(hitButton, 2, 2, 1, 1);
        hitButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setFillWidth(hitButton, true);
//        GridPane.setHgrow(hitButton, Priority.ALWAYS);

        final Button splitButton = new Button("Split");
        GridPane.setConstraints(splitButton, 2, 3, 1, 1);
        splitButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setFillWidth(splitButton, true);

        final Button standButton = new Button("Stand");
        GridPane.setConstraints(standButton, 2, 4, 1, 1);
        standButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setFillWidth(standButton, true);


//        layout.setAlignment(Pos.CENTER);
        scene = new Scene(layout, WIDTH, HEIGHT);

//        final Label label = new Label("Practice");

        layout.getChildren().addAll(dealerLabel, dealerCardsPlaceHolder, playerCardPlaceholder1, playerCardPlaceholder2,
                doubleDownButton, hitButton, splitButton, standButton);
    }
}
