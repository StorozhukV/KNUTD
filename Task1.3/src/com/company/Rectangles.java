package com.company;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rectangles extends Figure {
    public Rectangles(Pane root, int setx, int sety, int width, int height) {
        super(setx, sety, width, height);
        drawRectangle(root, setx, sety, width, height);
    }

    public void drawRectangle(Pane root, int setx, int sety, int width, int height) {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(setx);
        rectangle.setY(sety);
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        rectangle.setFill(Color.WHITE);
        rectangle.setStrokeWidth(2);
        rectangle.setStroke(RandomColor.getRandom());

        root.getChildren().addAll(rectangle);
    }
}
