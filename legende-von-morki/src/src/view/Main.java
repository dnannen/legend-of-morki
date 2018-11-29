package src.view;

import javafx.application.Application;
import javafx.stage.Stage;
import src.view.manager.SceneManager;

public class Main extends Application {
    private Stage stage;
    private SceneManager sceneManager;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Thread thread = new Thread();

        thread.start();

        stage = primaryStage;
        stage.setResizable(false);
        stage.setMaximized(false);
        this.sceneManager = new SceneManager(this.stage);
        stage.show();
    }
}
