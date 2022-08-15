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
        primaryStage.setTitle("Chess Piece");

        //creates a group of displayable objects
        Group group = new Group();

        //creates a drawing area that is 200 wide and 400 tall
        Canvas canvas = new Canvas(200, 400);

        //add the canvas to the group
        group.getChildren().add(canvas);

        //makes tge scene that we want to show in the window
        Scene scene = new Scene(group);

        //sets the scene of the window
        primaryStage.setScene(scene);

        //draws to the canvas
        drawChessPiece(canvas.getGraphicsContext2D());

        //shows the window
        primaryStage.show();
    }

    public void drawChessPiece(GraphicsContext gc)
    {
        gc.fillRect(0, 0, 200, 400);
        gc.setFill(Color.LIGHTSKYBLUE);
        double[] xPoints1 = {90, 60, 140, 110};
        double[] yPoints1 = {120, 250, 250, 120};
        double [] xPoints2 = {58, 45, 154, 141};
        double[] yPoints2 = {298, 311, 311, 298};
        gc.fillOval(70, 50, 60, 60);
        gc.fillRect(60, 105, 80, 20);
        gc.fillPolygon(xPoints1, yPoints1, 4);
        gc.fillRect(58, 253, 83, 10);
        gc.fillRoundRect(51 ,265 ,98, 30 ,20, 20);
        gc.fillPolygon(xPoints2, yPoints2, 4);
        gc.setFill(Color.BLACK);

    }
    public static void main (String[] args)
    {
        launch(args);
    }
}
