package app;

import controllers.LoginController;
import controllers.MainScreenController;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            LoginController loginController = new LoginController();
            MainScreenController screenController = new MainScreenController();
            primaryStage.setScene(loginController.setScene());
            primaryStage.setTitle("Student Records Manager");
            primaryStage.getIcons().add(new Image(String.valueOf(new File("src/main/resources/images/Logo_PTIT.png").toURI().toURL())));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
