package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.Random;

public class lab extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static class RandomColor {
        private static final Random r = new Random();

        public static Color getRandom() {
            return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
        }
    }

    public void svv(Pane root) {

        double x = 0, y = 0;
        Arc arc = new Arc(x + 250, y + 250, 150, 150, 90, 180);
        Arc arc2 = new Arc(x + 250, y + 250, 100, 100, 90, 180);
        arc.setStroke(RandomColor.getRandom());
        arc.setStrokeWidth(5);
        arc.setFill(Color.WHITESMOKE);
        arc2.setStroke(RandomColor.getRandom());
        arc2.setStrokeWidth(5);
        arc2.setFill(Color.WHITESMOKE);
        Line line = new Line(x + 250, y + 100, x + 250, y + 150);
        line.setStroke(RandomColor.getRandom());
        line.setStrokeWidth(5);
        Line line2 = new Line(x + 250, y + 350, x + 250, y + 400);
        line2.setStroke(RandomColor.getRandom());
        line2.setStrokeWidth(5);
        //----------B-------------------------
        Polygon poly = new Polygon(x + 350, y + 100, x + 350, y + 400, x + 300, y + 400, x + 300, y + 100, x + 350, y + 100);
        poly.setStroke(RandomColor.getRandom());
        poly.setStrokeWidth(5);
        poly.setFill(Color.WHITESMOKE);
        Arc arc3 = new Arc(x + 330, y + 170, 70, 50, 270, 180);
        arc3.setStroke(RandomColor.getRandom());
        arc3.setStrokeWidth(5);
        arc3.setFill(Color.WHITESMOKE);
        Arc arc4 = new Arc(x + 330, y + 170, 100, 70, 270, 180);
        arc4.setStroke(RandomColor.getRandom());
        arc4.setStrokeWidth(5);
        arc4.setFill(Color.WHITESMOKE);
        Arc arc5 = new Arc(x + 330, y + 300, 100, 70, 270, 180);
        arc5.setStroke(RandomColor.getRandom());
        arc5.setStrokeWidth(5);
        arc5.setFill(Color.WHITESMOKE);
        Arc arc6 = new Arc(x + 330, y + 300, 130, 100, 270, 180);
        arc6.setStroke(RandomColor.getRandom());
        arc6.setStrokeWidth(5);
        arc6.setFill(Color.WHITESMOKE);
        //----------B-------------------------
        Polygon poly2 = new Polygon(x + 550, y + 100, x + 550, y + 400, x + 500, y + 400, x + 500, y + 100, x + 550, y + 100);
        poly2.setStroke(RandomColor.getRandom());
        poly2.setStrokeWidth(5);
        poly2.setFill(Color.WHITESMOKE);
        Arc arc23 = new Arc(x + 530, y + 170, 70, 50, 270, 180);
        arc23.setStroke(RandomColor.getRandom());
        arc23.setStrokeWidth(5);
        arc23.setFill(Color.WHITESMOKE);
        Arc arc24 = new Arc(x + 530, y + 170, 100, 70, 270, 180);
        arc24.setStroke(RandomColor.getRandom());
        arc24.setStrokeWidth(5);
        arc24.setFill(Color.WHITESMOKE);
        Arc arc25 = new Arc(x + 530, y + 300, 100, 70, 270, 180);
        arc25.setStroke(RandomColor.getRandom());
        arc25.setStrokeWidth(5);
        arc25.setFill(Color.WHITESMOKE);
        Arc arc26 = new Arc(x + 530, y + 300, 130, 100, 270, 180);
        arc26.setStroke(RandomColor.getRandom());
        arc26.setStrokeWidth(5);
        arc26.setFill(Color.WHITESMOKE);

        root.getChildren().addAll(arc, arc2, line, line2,  arc4, arc3, arc6, arc5,  poly, arc26, arc25, arc24, arc23, poly2);

    }

    public void button (Pane root){
        Button button = new Button("Изменить цвета");
        button.setTranslateX(650.0D);
        button.setTranslateY(450.0D);
        button.setMinWidth(60.0D);
        button.setMinHeight(30.0D);
        button.setStyle("-fx-font: 20  CenturyGothic; -fx-base: #000000;");
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                svv(root);
            }
        });
        root.getChildren().addAll(new Node[]{button});
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 900, 500);
        svv(root);
        button(root);
        root.setStyle("-fx-backround-color: #000000");
        primaryStage.setTitle("Storozhuk");
        scene.getRoot();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
