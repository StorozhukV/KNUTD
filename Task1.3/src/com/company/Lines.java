package com.company;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;



public class Lines extends Figure {

    public Lines(Pane root, int startX, int startY, int endX, int endY) {
        super(startX,  startY, endX, endY);

        drawLine(root, startX,  startY, endX, endY);

    }
    private void drawLine (Pane root, int startX, int startY, int endX, int endY){
        Line line = new Line();
        line.setStartX(startX);
        line.setStartY(startY);
        line.setEndX(endX);
        line.setEndY(endY);
        line.setStrokeWidth(2);
        line.setStroke(RandomColor.getRandom());
        root.getChildren().addAll(line);
    }

    }
