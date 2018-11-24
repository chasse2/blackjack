package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HitActionEventHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hit action event handler");
    }
}
