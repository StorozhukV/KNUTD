package com.company;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class MyEllipse extends Figure {
    public MyEllipse(Pane root, int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
        drawEllipse(root,startX, startY, endX, endY);
    }
    private void drawEllipse (Pane root, int centerX, int centerY, int radiusX, int radiusY){
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(centerX);
        ellipse.setCenterY(centerY);
        ellipse.setRadiusX(radiusX);
        ellipse.setRadiusY(radiusY);
        ellipse.setFill(Color.WHITE);
        ellipse.setStrokeWidth(2);
        ellipse.setStroke(RandomColor.getRandom());
        root.getChildren().addAll(ellipse);
    }
}
