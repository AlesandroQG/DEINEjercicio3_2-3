package com.alesandro.ejercicio3_23;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase donde se ejecuta la aplicación principal
 *
 * @author alesandroquirosgobbato
 */
public class SupermercadoApplication extends Application {
    /**
     * Función donde se carga y se muestra la ventana de la aplicación
     *
     * @param stage escena de la aplicación
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SupermercadoApplication.class.getResource("fxml/Supermercado.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Supermercado");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Función main donde se lanza la aplicación
     *
     * @param args parámetros por consola
     */
    public static void main(String[] args) {
        Application.launch();
    }
}