module fr.greg.compteurbouteilles {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.greg.compteurbouteilles to javafx.fxml;
    exports fr.greg.compteurbouteilles;
}