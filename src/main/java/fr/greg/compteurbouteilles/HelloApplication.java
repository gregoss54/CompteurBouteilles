package fr.greg.compteurbouteilles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //StackPane qui hérite de parent est une pile sur laquelle
        // //on empile les différents elements graphiques (Boutons, Labels...)
        //root est le composant du graphique parent comme un layout

        StackPane root = new StackPane();
     root.getChildren().add(new Rectangle(200,200, Color.BLUEVIOLET));// On ajoute des nodes ((ici un rectangle)

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(250.0, 250.0,
                660.0, 560.0,
                520.0, 340.0);
        root.getChildren().add(polygon);
     root.getChildren().add(new Circle(100, Color.RED));
        root.getChildren().add(new Label( "Mon new Label"));
     // On applique la pile sur une Scene et on override les dimensions du stage
     stage.setTitle("Compteur de bouteilles");
     stage.setScene(new Scene(root, 600, 400 )); // On applique à notre stage
     stage.show();

     /* 2ème Methode : Utilisation de VBox / HBox (Vertical et Horizontal)
     */



    }

    public static void main(String[] args) {
        launch();
    }
}