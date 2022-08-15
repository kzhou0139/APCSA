//Kelly Zhou. Mrs. Bauguss. P3

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //sets the title
        primaryStage.setTitle("Driving Along");

        //creates a group of displayable objects
        Group group = new Group();

        //creates a drawing area that is 1000 wide and 800 tall
        Canvas canvas = new Canvas(1000, 800);

        //add the canvas to the group
        group.getChildren().add(canvas);

        //makes tge scene that we want to show in the window
        Scene scene = new Scene(group);

        //sets the scene of the window
        primaryStage.setScene(scene);

        //draws to the canvas
        drawDrivingAlong(canvas.getGraphicsContext2D());

        //shows the window
        primaryStage.show();
    }

    public void drawDrivingAlong(GraphicsContext gc)
    {
        double[] upperCarX = {235, 480, 570, 200};
        double[] upperCarY = {400, 400, 490, 490};
        double[] lowerCarX = {195, 670, 710, 180};
        double[] lowerCarY = {480, 490, 605, 605};
        double[] rearWindowX = {233, 250, 220, 204};
        double[] rearWindowY = {410, 410, 482, 480};
        double[] midLeftWindowX = {262, 347, 355, 235};
        double[] midLeftWindowY = {410, 410, 485, 482};
        double[] midRightWindowX = {357, 460, 493, 365};
        double[] midRightWindowY = {410, 410, 488, 485};
        double[] frontWindowX = {470, 489, 569, 505};
        double[] frontWindowY = {410, 410, 490, 488};
        double[] mountain1X = {-75, 150, 450};
        double[] mountain1Y = {525, 50, 525};
        double[] mountain2X = {183, 490, 720};
        double[] mountain2Y = {525, 125, 525};
        double[] mountain3X = {600, 800, 1030};
        double[] mountain3Y = {525, 225, 525};
        double[] mountain25X = {500, 850, 1175};
        double[] mountain25Y = {525, 25, 525};
        double[] mountain1TriangleX = {110, 150, 205};
        double[] mountain1TriangleY = {140, 50, 140};
        double[] mountain2TriangleX = {435, 490, 535};
        double[] mountain2TriangleY = {200, 125, 200};
        double[] mountain3TriangleX = {750, 800, 855};
        double[] mountain3TriangleY = {300, 225, 300};
        double[] mountain25TriangleX = {800, 850, 900};
        double[] mountain25TriangleY = {100, 25, 100};
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2.5);
        gc.setFill(Color.rgb(161, 236, 237));
        gc.fillRect(0, 0, 1000, 525);                           //sky
        gc.setFill(Color.rgb(255, 191, 64));
        gc.fillOval(240, 200, 200, 200);                        //sun
        gc.setFill(Color.rgb(180, 173, 173));
        gc.fillPolygon(mountain1X, mountain1Y, 3);                   //mountains
        gc.fillPolygon(mountain2X, mountain2Y, 3);
        gc.fillPolygon(mountain25X, mountain25Y, 3);
        gc.fillPolygon(mountain3X, mountain3Y, 3);
        gc.setFill(Color.WHITE);
        gc.fillPolygon(mountain1TriangleX, mountain1TriangleY, 3);  //mountain triangle
        gc.fillPolygon(mountain2TriangleX, mountain2TriangleY, 3);
        gc.fillPolygon(mountain3TriangleX, mountain3TriangleY, 3);
        gc.fillPolygon(mountain25TriangleX, mountain25TriangleY, 3);
        gc.strokeLine(0, 370, 150, 50);                      //mountain outline
        gc.strokeLine(150, 50, 456, 545);//330, 338
        gc.strokeLine(330, 338, 490, 125);
        gc.strokeLine(490, 125, 665, 430);
        gc.strokeLine(590, 545, 800, 225);//665, 430
        gc.strokeLine(800, 225, 1000, 490);
        gc.strokeLine(620, 350, 850, 25);
        gc.strokeLine(850, 25, 1000, 260);
        gc.strokeLine(110, 140, 205, 140);                   //mountain triangle outline
        gc.strokeLine(435, 200, 530, 200);
        gc.strokeLine(750, 300, 855, 300);
        gc.strokeLine(800, 100, 900, 100);
        gc.fillOval(230, 100, 60, 60);                          //cloud1
        gc.fillOval(270, 90, 80, 80);
        gc.fillOval(330, 100, 60, 60);
        gc.fillOval(600, 100, 100, 60);                         //cloud2
        gc.fillOval(660, 85, 120, 90);
        gc.fillOval(750, 100, 100, 60);
        gc.setFill(Color.GRAY);
        gc.fillRect(0, 550, 1000, 250);                         //road
        gc.setFill(Color.rgb(86, 171, 58));
        gc.fillRect(0, 720, 1000, 80);                          //grass
        gc.fillRect(0, 525, 1000, 50);
        gc.setFill(Color.WHITE);
        int xVal = 50;
        for (int i = 0; i < 5; i++)
        {
            gc.fillRect(xVal, 640, 100, 10);
            xVal += 200;
        }
        gc.setFill(Color.rgb(227, 93, 91));
        gc.fillPolygon(upperCarX, upperCarY, 4);                     //red part of car
        gc.fillPolygon(lowerCarX, lowerCarY, 4);
        gc.setFill(Color.rgb(127, 215, 235));
        gc.fillPolygon(rearWindowX, rearWindowY, 4);                 //windows
        gc.fillPolygon(midLeftWindowX, midLeftWindowY, 4);
        gc.fillPolygon(midRightWindowX, midRightWindowY, 4);
        gc.fillPolygon(frontWindowX, frontWindowY, 4);
        gc.setFill(Color.BLACK);
        gc.fillRect(368, 500, 28, 8);                           //door handle
        gc.fillOval(465, 470, 45, 30);                          //mirror
        gc.fillOval(215, 555, 110, 110);                        //wheels
        gc.fillOval(545, 555, 110, 110);
        gc.setFill(Color.rgb(140, 137, 137));
        gc.fillOval(235, 575, 70, 70);                          //grey wheels
        gc.fillOval(565, 575, 70, 70);
        gc.setFill(Color.WHITE);
        gc.fillOval(255, 595, 30, 30);                          //white wheels
        gc.fillOval(585, 595, 30, 30);
        gc.strokeOval(255, 595, 30, 30);
        gc.strokeOval(585, 595, 30, 30);
        gc.setFill(Color.YELLOW);
        gc.fillOval(198, 510, 12, 30);                          //lights
        gc.fillOval(655, 490, 35, 30);

    }

    public static void main (String[] args)
    {
        launch(args);
    }

}
