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
        primaryStage.setTitle("Checker Board");

        //creates a group of displayable objects
        Group group = new Group();

        //creates a drawing area that is 800 wide and 600 tall
        Canvas canvas = new Canvas(800, 600);

        //add the canvas to the group
        group.getChildren().add(canvas);

        //makes tge scene that we want to show in the window
        Scene scene = new Scene(group);

        //sets the scene of the window
        primaryStage.setScene(scene);

        //draws to the canvas
        drawCheckerBoard(canvas.getGraphicsContext2D());

        //shows the window
        primaryStage.show();
    }

    public void drawCheckerBoard(GraphicsContext gc)
    {
        gc.fillRect(0, 0, 800, 600);

        int y = 0;
        for (int i = 0; i < 8; i++)   //y
        {
            int x = 100;
            for (int j = 0; j < 8; j++)   //x
            {
                gc.strokeRect(x, y, 75, 75);
                if ((i % 2 == 1 && j % 2 == 0)  || (i % 2 == 0 && j % 2 == 1))
                {
                    gc.fillRect(x, y, 75, 75);
                    gc.setFill(Color.RED);
                }
                if (i == 0 && j == 1)
                {
                    gc.fillRect(x, y, 75, 75);
                    gc.setFill(Color.RED);
                }
                x += 75;
            }
            y += 75;
        }

        int y2 = 0;
        for (int a = 0; a < 8; a++)
        {
            int x2 = 100;
            for (int b = 0; b < 8; b++)
            {
                if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1))
                {
                    if (a < 3)
                    {
                        gc.setStroke(Color.WHITE);
                        gc.strokeOval(x2 + 3, y2 + 3, 70, 70);
                    }
                    if (a > 4)
                    {
                        gc.fillOval(x2 + 3, y2 + 3, 70, 70);
                        gc.setFill(Color.RED);
                    }
                }
                x2 += 75;
            }
            y2 += 75;
        }
    }
    public static void main (String[] args)
    {
        launch(args);
    }
}