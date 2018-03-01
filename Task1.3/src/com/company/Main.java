package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Main extends Application {
    public static final int width = 1000;
    public static final int height = 700;
    int pointX = 240;
    int pointX2 = 980;
    int pointY = 130;
    int pointY2 = 650;
    int positionY = 150;
    int positionX = 20;

    TextField startX = new TextField("0");
    TextField startY = new TextField("0");
    TextField endX = new TextField("0");
    TextField endY = new TextField("0");

    private Scene scene1;
    private Scene start;
    private Scene scene2;

    private void coordinateSystem(Pane root) {
        Line lineX = new Line();
        Line lineY = new Line();
        Line centerX = new Line();
        Line centerY = new Line();

        Label[] labels = new Label[]{new Label("max 520"), new Label("max 740"),
                new Label("0 x->"), new Label("0\ny\n|"), new Label("370"), new Label("260")};

        labels[0].setTranslateX(pointX - 70);
        labels[0].setTranslateY(pointY2 - 30);

        labels[1].setTranslateX(pointX2 - 90);
        labels[1].setTranslateY(pointY - 20);

        labels[2].setTranslateX(pointX);
        labels[2].setTranslateY(pointY - 20);
        labels[3].setTranslateX(pointX - 12);
        labels[3].setTranslateY(pointY + 5);

        labels[4].setTranslateX((pointX - 15) + (pointX2 - pointX) / 2);
        labels[4].setTranslateY(pointY - 27);
        labels[5].setTranslateX(pointX - 34);
        labels[5].setTranslateY((pointY - 10) + (pointY2 - pointY) / 2);

        lineX.setStartX(pointX);
        lineX.setStartY(pointY);
        lineX.setEndX(pointX2);
        lineX.setEndY(pointY);
        lineX.setStrokeWidth(4);
        lineX.setStroke(Color.MEDIUMAQUAMARINE);

        lineY.setStartX(pointX);
        lineY.setStartY(pointY);
        lineY.setEndX(pointX);
        lineY.setEndY(pointY2);
        lineY.setStrokeWidth(4);
        lineY.setStroke(Color.MEDIUMAQUAMARINE);

        centerX.setStartX(pointX + (pointX2 - pointX) / 2);
        centerX.setStartY(pointY - 5);
        centerX.setEndX(pointX + (pointX2 - pointX) / 2);
        centerX.setEndY(pointY + 5);

        centerY.setStartX(pointX - 5);
        centerY.setStartY(pointY + (pointY2 - pointY) / 2);
        centerY.setEndX(pointX + 5);
        centerY.setEndY(pointY + (pointY2 - pointY) / 2);
        for (Label label : labels) {
            label.setFont(Font.font("Courier New", FontWeight.BOLD, 15));
            root.getChildren().addAll(label);
        }
        root.getChildren().addAll(lineX, lineY, centerX, centerY);
    }

    private void buttonBack(Stage primaryStage, Pane root) {
        Button buttonBack = new Button("Back");
        buttonBack.setTranslateX(840);
        buttonBack.setTranslateY(30);
        buttonBack.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        buttonBack.setStyle("-fx-background-color: #3CB371");
        buttonBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(start);
            }
        });
        root.getChildren().addAll(buttonBack);
    }

    private void buttonClear(Stage primaryStage, Pane root) {
        Button buttonBack = new Button("Clear");
        buttonBack.setTranslateX(730);
        buttonBack.setTranslateY(50);
        buttonBack.setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        buttonBack.setStyle("-fx-background-color: #3CB371");
        buttonBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getChildren().clear();
                drawFiguresView(primaryStage, root);
            }
        });
        root.getChildren().addAll(buttonBack);

    }

    private void buttonClearText(Pane root) {
        Button buttonClear = new Button("Clear");
        buttonClear.setTranslateX(positionX);
        buttonClear.setTranslateY(350);
        buttonClear.setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        buttonClear.setStyle("-fx-background-color: #3CB371");
        buttonClear.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                startX.setText("0");
                startY.setText("0");
                endX.setText("0");
                endY.setText("0");
            }
        });
        root.getChildren().addAll(buttonClear);

    }

    private void drawFiguresView(Stage primaryStage, Pane root) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("WARNING");
        alert.setHeaderText("Look, a Warning Dialog");
        alert.setContentText("You made a mistake!");

        Alert info = new Alert(Alert.AlertType.INFORMATION);
        info.setTitle("INFO");
        info.setHeaderText(null);
        info.setContentText("Please, fill in all the fields!");

//------------------Label & TextField----------------------------------------------------------------------------------
        Label[] labels = new Label[]{new Label("Enter starting x:"), new Label("Enter end x(max 740):"),
                new Label("Enter starting y:"), new Label("Enter end y(max 520):")};


        labels[0].setTranslateX(positionX);
        labels[0].setTranslateY(400);
        labels[0].setFont(Font.font("Courier New", 15));
        startX.setTranslateX(positionX);
        startX.setTranslateY(420);

        labels[1].setTranslateX(positionX);
        labels[1].setTranslateY(450);
        labels[1].setFont(Font.font("Courier New", 15));
        startY.setTranslateX(positionX);
        startY.setTranslateY(470);

        labels[2].setTranslateX(positionX);
        labels[2].setTranslateY(500);
        labels[2].setFont(Font.font("Courier New", 15));
        endX.setTranslateX(positionX);
        endX.setTranslateY(520);

        labels[3].setTranslateX(positionX);
        labels[3].setTranslateY(550);
        labels[3].setFont(Font.font("Courier New", 15));
        endY.setTranslateX(positionX);
        endY.setTranslateY(570);

        Label labelGreeting = new Label("You can draw here! \nPlease, select shapes:");
        labelGreeting.setTranslateX(positionX);
        labelGreeting.setTranslateY(5);
        labelGreeting.setFont(Font.font("Courier New", 40));
        labelGreeting.setTextFill(Color.MEDIUMSLATEBLUE);
//---------------------------------------------------------------------------------------------------------------------

// ---------------------------BUTTONS----------------------------------------------------------------------------------
        Button[] buttons = new Button[]{
                new Button("Line"), new Button("Ellipse"),
                new Button("Rectangle"), new Button("Polygon")};
        //Line
        buttons[0].setTranslateX(positionX);
        buttons[0].setTranslateY(positionY);
        buttons[0].setTextFill(Color.WHITE);
        buttons[0].setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        buttons[0].setStyle("-fx-background-color: #000000");
        buttons[0].setMinWidth(180);
        buttons[0].setOnAction((event) -> {
            labels[0].setVisible(true);
            labels[1].setVisible(true);
            labels[2].setVisible(true);
            labels[3].setVisible(true);
            labels[0].setText("Enter starting x:");
            labels[1].setText("Enter starting y:");
            labels[2].setText("Enter end x(max 740):");
            labels[3].setText("Enter end y(max 520):");

        });
        buttons[0].setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int startx = Integer.parseInt(startX.getText());
                int starty = Integer.parseInt(startY.getText());
                int endx = Integer.parseInt(endX.getText());
                int endy = Integer.parseInt(endY.getText());

                if ((endx <= 0) && (endy <= 0) && (startx <= 0) && (starty <= 0)) {
                    info.showAndWait();
                } else {
                    if ((endx <= 740) && (endy <= 520) && (startx <= 740) && (starty <= 520)) {
                        Lines lines = new Lines(root, startx + pointX, starty + pointY,
                                endx + pointX, endy + pointY);
                    } else alert.showAndWait();
                }
            }
        });
        //Ellipse
        buttons[1].setTranslateX(positionX);
        buttons[1].setTranslateY(positionY + 50);
        buttons[1].setTextFill(Color.WHITE);
        buttons[1].setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        buttons[1].setStyle("-fx-background-color: #000000");
        buttons[1].setMinWidth(180);
        buttons[1].setOnAction((event) -> {
            labels[0].setVisible(true);
            labels[1].setVisible(true);
            labels[2].setVisible(true);
            labels[3].setVisible(true);
            labels[0].setText("Center X:");
            labels[1].setText("Center Y:");
            labels[2].setText("Radius X:");
            labels[3].setText("Radius Y:");
            startX.setVisible(true);
            startY.setVisible(true);
            endX.setVisible(true);
            endY.setVisible(true);
        });
        buttons[1].setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int centerx = Integer.parseInt(startX.getText());
                int centery = Integer.parseInt(startY.getText());
                int radiusx = Integer.parseInt(endX.getText());
                int radiusy = Integer.parseInt(endY.getText());
                if ((centerx <= 0) && (centery <= 0) && (radiusx <= 0) && (radiusy <= 0)) {
                    info.showAndWait();
                } else {
                    if ((centerx <= 740) && (centery <= 520) && (radiusx <= 740) && (radiusy <= 520)) {
                        if((centery + - radiusy > 0) && (centerx - radiusx > 0)){
                        MyEllipse ellipse = new MyEllipse(root, centerx + pointX, centery + pointY,
                                radiusx, radiusy);
                    } else {
                        alert.showAndWait();
                    }
                }
            }
            }
        });
        //Rectangle
        buttons[2].setTranslateX(positionX);
        buttons[2].setTranslateY(positionY + 50 * 2);
        buttons[2].setTextFill(Color.WHITE);
        buttons[2].setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        buttons[2].setStyle("-fx-background-color: #000000");
        buttons[2].setMinWidth(180);
        buttons[2].setOnAction((event) -> {
            labels[0].setVisible(true);
            labels[1].setVisible(true);
            labels[2].setVisible(true);
            labels[3].setVisible(true);
            labels[0].setText("Enter X:");
            labels[1].setText("Enter Y:");
            labels[2].setText("Enter width:");
            labels[3].setText("Enter height:");
            startX.setVisible(true);
            startY.setVisible(true);
            endX.setVisible(true);
            endY.setVisible(true);
        });
        buttons[2].setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int setx = Integer.parseInt(startX.getText());
                int sety = Integer.parseInt(startY.getText());
                int width = Integer.parseInt(endX.getText());
                int height = Integer.parseInt(endY.getText());
                if ((setx <= 0) && (sety <= 0) && (width <= 0) && (height <= 0)) {
                    info.showAndWait();
                } else {
                    if ((setx <= 740) && (sety <= 520) && (width <= 740) && (height <= 520)) {
                        Rectangles rectangles = new Rectangles(root, setx + pointX, sety + pointY,
                                width, height);
                    } else {
                        alert.showAndWait();
                    }
                }
            }
        });
        //Polygon
        buttons[3].setTranslateX(positionX);
        buttons[3].setTranslateY(positionY + 50 * 3);
        buttons[3].setTextFill(Color.WHITE);
        buttons[3].setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        buttons[3].setStyle("-fx-background-color: #000000");
        buttons[3].setMinWidth(180);
        buttons[3].setOnAction((event) -> {
            labels[0].setVisible(false);
            labels[1].setVisible(true);
            labels[2].setVisible(false);
            labels[3].setVisible(false);
            labels[1].setText("Enter count of numbers:");
            labels[0].setText("Enter numbers \nseparated a space:");
            startX.setVisible(false);
            startY.setVisible(true);
            endX.setVisible(false);
            endY.setVisible(false);
        });
        buttons[3].setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String line = startY.getText();
                String[] array = line.split(" ");
                int[] numbers = new int[array.length];
                for (int i = 0; i < array.length; i++) {
                    try {
                        numbers[i] = Integer.parseInt(array[i]);

                    } catch (Exception e) {
                        alert.setContentText("It's not numbers!");
                        alert.showAndWait();
                    }
                }
                    for (int i = 0; i < numbers.length-1; i += 2) {
                        numbers[i] += pointX;
                        numbers[i + 1] += pointY;
                    }
                if ((numbers.length % 2 == 0)) {
                    MyPolygon polygon = new MyPolygon(root, numbers);
                } else {
                    alert.showAndWait();
                }
            }
        });

        for (Button button : buttons) {
            root.getChildren().addAll(button);
        }
        buttonBack(primaryStage, root);
        buttonClear(primaryStage, root);
        buttonClearText(root);
        //-------------------------------------------------------------------------------------------------------------
        coordinateSystem(root);
        for (Label label : labels) {
            label.setFont(Font.font("Courier New", 15));
            root.getChildren().addAll(label);
        }
        root.getChildren().addAll(startX, startY, endX, endY);
        root.getChildren().addAll(labelGreeting);
    }

    private void movesFiguresView(Stage primaryStage, Pane root) {

        Label label = new Label("To be developed...");
        label.setTranslateX(500);
        label.setTranslateY(500);
        label.setFont(Font.font("Courier New", FontWeight.BOLD, 20));
        label.setTextFill(RandomColor.getRandom());
        root.getChildren().addAll(label);
        buttonBack(primaryStage, root);
    }

    private Scene begin(Stage primaryStage, Scene scene1, Scene scene2) {
        Pane root = new Pane();
        Label[] labels = new Label[]{new Label("Hi, guys!"),
                new Label("There are my tasks to practice, but I upgraded it :)"),
                new Label("Enjoy!"), //2
                new Label("If you wanna draw figures, \nyou will have to press this"),
                new Label("\tBUTTON."),//4
                new Label("\t|"),//5
                new Label("If you wanna watch my moves \nfigures, you will have to press \n\tthis"),
                new Label("\t BUTTON."),//7
                new Label("\t|"),//8
                new Label("So use my program 'Storozhuk' v. 1.010101 & be yourself:)"),//9
                new Label("//High five, bro//"),//10
                new Label("If you want to exit, you will need press this button ->")};
        labels[0].setTranslateX(50);
        labels[0].setTranslateY(70);
        labels[0].setFont(Font.font("Courier New", 40));
        labels[0].setTextFill(Color.ORANGE);

        labels[1].setTranslateX(50);
        labels[1].setTranslateY(130);
        labels[1].setFont(Font.font("Courier New", 30));
        labels[1].setTextFill(Color.ORANGERED);

        labels[2].setTranslateX(450);
        labels[2].setTranslateY(180);
        labels[2].setFont(Font.font("Courier New", FontWeight.BOLD, 40));
        labels[2].setTextFill(Color.DARKRED);

        labels[3].setTranslateX(50);
        labels[3].setTranslateY(260);
        labels[3].setFont(Font.font("Courier New", 25));
        labels[3].setTextFill(Color.MEDIUMPURPLE);

        labels[4].setTranslateX(50);
        labels[4].setTranslateY(330);
        labels[4].setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        labels[4].setTextFill(Color.PURPLE);
        labels[5].setTranslateX(90);
        labels[5].setTranslateY(360);
        labels[5].setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        labels[5].setTextFill(Color.PURPLE);

        labels[6].setTranslateX(500);
        labels[6].setTranslateY(260);
        labels[6].setFont(Font.font("Courier New", 25));
        labels[6].setTextFill(Color.MEDIUMPURPLE);

        labels[7].setTranslateX(530);
        labels[7].setTranslateY(320);
        labels[7].setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        labels[7].setTextFill(Color.PURPLE);
        labels[8].setTranslateX(580);
        labels[8].setTranslateY(360);
        labels[8].setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        labels[8].setTextFill(Color.PURPLE);

        labels[9].setTranslateX(50);
        labels[9].setTranslateY(540);
        labels[9].setFont(Font.font("Courier New", FontWeight.BOLD, 15));
        labels[9].setTextFill(Color.DARKCYAN);

        labels[10].setTranslateX(50);
        labels[10].setTranslateY(560);
        labels[10].setFont(Font.font("Courier New", FontWeight.BOLD, 15));
        labels[10].setTextFill(Color.DARKKHAKI);
        labels[11].setTranslateX(300);
        labels[11].setTranslateY(560);
        labels[11].setFont(Font.font("Courier New", FontWeight.BOLD, 15));
        labels[11].setTextFill(Color.DARKSEAGREEN);
        for (Label label : labels) {
            root.getChildren().addAll(label);
        }

        Button[] buttons = new Button[]{new Button("Button"),
                new Button("Button"), new Button("Exit")};
        buttons[0].setTranslateX(120);
        buttons[0].setTranslateY(400);
        buttons[0].setFont(Font.font("Courier New", FontWeight.BOLD, 50));
        buttons[0].setStyle("-fx-background-color: #DDA0DD");
        buttons[0].setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(scene1);
            }
        });

        buttons[1].setTranslateX(610);
        buttons[1].setTranslateY(400);
        buttons[1].setFont(Font.font("Courier New", FontWeight.BOLD, 50));
        buttons[1].setStyle("-fx-background-color: #DDA0DD");
        buttons[1].setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(scene2);
            }
        });

        buttons[2].setTranslateX(820);
        buttons[2].setTranslateY(540);
        buttons[2].setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        buttons[2].setStyle("-fx-background-color: #8FBC8F");
        buttons[2].setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.close();
            }
        });
        for (Button button : buttons) {
            root.getChildren().addAll(button);
        }
        return new Scene(root);
    }

    private Scene drawFigures(Stage primaryStage) {
        Pane root = new Pane();
        drawFiguresView(primaryStage, root);
        return new Scene(root);
    }

    private Scene movesFigures(Stage primaryStage) {
        Pane root = new Pane();
        movesFiguresView(primaryStage, root);
        return new Scene(root);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
        primaryStage.setTitle("Storozhuk");
        scene1 = drawFigures(primaryStage);
        scene2 = movesFigures(primaryStage);
        start = begin(primaryStage, scene1, scene2);
        start.getRoot();
        primaryStage.setScene(start);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // write your code here
        launch(args);
    }

}