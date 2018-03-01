package com.company;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;


public class MyPolygon{
    private int[] array = new int[]{};

    public MyPolygon(Pane root,  int[] array) {
        this.array = array;
        drawPolygon(root,array);
    }

    public void drawPolygon(Pane root, int[] array) {
        Polygon polygon = new Polygon();
        for (int i = 0; i < array.length; i++) {
            double t = array[i];
            polygon.getPoints().addAll(new Double[]{t});
        }
        polygon.setFill(Color.WHITE);
        polygon.setStrokeWidth(2);
        polygon.setStroke(RandomColor.getRandom());
        root.getChildren().addAll(polygon);
    }

    }


