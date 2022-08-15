//Kelly Zhou. Mrs. Bauguss. P3

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //sets the title
        primaryStage.setTitle("Animal");

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
        drawAnimal(canvas.getGraphicsContext2D());

        //shows the window
        primaryStage.show();
    }

    public void drawAnimal(GraphicsContext gc)
    {
        double[] leftEarX = {282, 225, 270, 310, 295};
        double[] leftEarY = {258, 150, 50, 150, 250};
        double[] darkLeftEarX = {282, 240, 270, 297, 290};
        double[] darkLeftEarY = {235, 150, 75, 150, 235};
        double[] rightEarX = {421, 431, 511, 511, 422};
        double[] rightEarY = {268, 145, 63, 185, 295};
        double[] darkRightEarX = {432, 442, 500, 498, 440};
        double[] darkRightEarY = {240, 155, 88, 185, 245};
        double[] frontLeftLegX = {297, 315, 295, 361, 354};
        double[] frontLeftLegY = {500, 585, 600, 600, 515};
        double[] frontRightLegX = {365, 355, 411, 405, 422};
        double[] frontRightLegY = {515, 600, 600, 585, 500};
        double[] backLeftLegX = {275, 305, 293, 315, 297};
        double[] backLeftLegY = {500, 568, 588, 588, 500};
        double[] backRightLegX = {415, 402, 430, 425, 452};
        double[] backRightLegY = {502, 588, 588, 570, 495};
        double[] tailOvalX = {480, 585, 615, 540, 480, 450};
        double[] tailOvalY = {275, 230, 370, 450, 450, 380};
        double[] tailTriangleX = {585, 605, 510};
        double[] tailTriangleY = {230, 325, 262};

        gc.setFill(Color.rgb(186, 17, 11));
        gc.fillRect(500, 0, 500, 800);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(6);
        gc.strokeRect(100, 100, 800, 600);                                  //arena
        gc.strokeLine(500, 100, 500, 360);
        gc.strokeLine(500, 440, 500, 700);
        gc.strokeOval(350, 250, 300, 300);
        gc.strokeOval(460, 360, 80, 80);
        gc.setFill(Color.rgb(240, 230, 206));                           //collar filler
        gc.fillOval(232, 355, 245, 160);
        gc.setStroke(Color.WHITE);
        gc.setFont(Font.font("Oswald", 100));
        gc.strokeText("Eevee", 600, 650);
        gc.setFill(Color.rgb(156, 122, 75));
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.fillPolygon(tailOvalX, tailOvalY, 6);                                 //tailOval
        gc.strokePolygon(tailOvalX, tailOvalY, 6);
        gc.setFill(Color.rgb(212, 198, 167));
        gc.fillPolygon(tailTriangleX, tailTriangleY, 3);                         //tailTriangle
        gc.strokePolygon(tailTriangleX, tailTriangleY, 3);
        gc.setFill(Color.rgb(201, 160, 97));
        gc.fillPolygon(leftEarX, leftEarY, 5);                                   //ears
        gc.strokePolygon(leftEarX, leftEarY, 5);
        gc.fillPolygon(rightEarX, rightEarY, 5);
        gc.strokePolygon(rightEarX, rightEarY, 5);
        gc.setFill(Color.rgb(156, 122, 75));
        gc.fillPolygon(darkLeftEarX, darkLeftEarY, 5);                           //inner ears
        gc.strokePolygon(darkLeftEarX, darkLeftEarY, 5);
        gc.fillPolygon(darkRightEarX, darkRightEarY, 5);
        gc.strokePolygon(darkRightEarX, darkRightEarY, 5);
        gc.setFill(Color.rgb(201, 160, 99));
        gc.fillRoundRect(265, 235, 176, 198, 125, 125);  //face
        gc.strokeRoundRect(265, 235, 176, 198, 125, 125);
        gc.setFill(Color.rgb(163, 103, 124));
        gc.fillRoundRect(285, 305, 45, 65, 59, 59);      //eyes
        gc.strokeRoundRect(285, 305, 45, 65, 59, 59);
        gc.fillRoundRect(376, 305, 45, 65, 59, 59);
        gc.strokeRoundRect(376, 305, 45, 65, 59, 59);
        gc.setFill(Color.BLACK);
        gc.fillOval(295, 320, 32, 35);                                      //pupil
        gc.fillOval(382, 320, 32, 35);
        gc.fillOval(350, 375, 10, 5);                                       //nose
        gc.setFill(Color.WHITE);
        gc.fillOval(290, 315, 15, 18);                                      //white in eye
        gc.fillOval(382, 315, 15, 18);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeArc(315, 302, 15, 60, 102, -60, ArcType.OPEN);   //crease above eye
        gc.strokeArc(378, 302, 15, 20, 78, 105, ArcType.OPEN);
        gc.strokeArc(326, 380, 30, 18, 180, 170, ArcType.OPEN);  //mouth
        gc.strokeArc(355, 380, 30, 18, 180, 185, ArcType.OPEN);
        gc.setFill(Color.rgb(201, 160, 99));
        gc.fillPolygon(frontLeftLegX, frontLeftLegY, 5);          //front legs
        gc.strokePolygon(frontLeftLegX, frontLeftLegY, 5);
        gc.fillPolygon(frontRightLegX, frontRightLegY, 5);
        gc.strokePolygon(frontRightLegX, frontRightLegY, 5);
        gc.setFill(Color.rgb(156, 122, 75));
        gc.fillPolygon(backLeftLegX, backLeftLegY, 5);            //back legs
        gc.strokePolygon(backLeftLegX, backLeftLegY, 5);
        gc.fillPolygon(backRightLegX, backRightLegY, 5);
        gc.strokePolygon(backRightLegX, backRightLegY, 5);
        gc.setLineWidth(2);
        gc.setFill(Color.rgb(240, 230, 206));
        gc.fillArc(242, 380, 45, 40, 90, 110, ArcType.OPEN);     //collar left side
        gc.fillArc(230, 405, 78, 80, 90, 165, ArcType.OPEN);
        gc.fillArc(250, 440, 100, 65, 130, 158, ArcType.OPEN);
        gc.fillArc(415, 380, 45, 40, 90, -110, ArcType.OPEN);     //collar right side
        gc.fillArc(412, 407, 75, 80, 100, -165, ArcType.OPEN);
        gc.fillArc(368, 440, 100, 65, 50, -145, ArcType.OPEN);
        gc.setStroke(Color.BLACK);
        gc.strokeArc(242, 380, 45, 40, 90, 110, ArcType.OPEN);     //collar left side outline
        gc.strokeArc(230, 405, 78, 80, 90, 165, ArcType.OPEN);
        gc.strokeArc(250, 440, 100, 65, 130, 158, ArcType.OPEN);
        gc.strokeArc(415, 380, 45, 40, 90, -110, ArcType.OPEN);     //collar right side outline
        gc.strokeArc(412, 407, 75, 80, 100, -165, ArcType.OPEN);
        gc.strokeArc(368, 440, 100, 65, 50, -145, ArcType.OPEN);
        gc.strokeLine(305, 492, 365, 532);      //collar v
        gc.strokeLine(365, 532, 425, 492);
        gc.strokeLine(325, 600, 330, 590);      //claws front left
        gc.strokeLine(335, 600, 340, 590);
        gc.strokeLine(373, 600, 378, 590);      //claws front right
        gc.strokeLine(383, 600, 388, 590);
        gc.strokeLine(303, 587, 308, 578);      //claw back left
        gc.strokeLine(410, 588, 412, 579);      //claw back right
    }

    public static void main (String[] args)
    {
        launch(args);
    }

}

