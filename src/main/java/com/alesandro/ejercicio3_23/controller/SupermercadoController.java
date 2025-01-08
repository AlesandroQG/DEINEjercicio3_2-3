package com.alesandro.ejercicio3_23.controller;

import com.alesandro.ejercicio3_23.dao.DaoProducto;
import com.alesandro.ejercicio3_23.db.DBConnect;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * Clase controladora de la vista principal de la aplicación
 */
public class SupermercadoController implements Initializable {
    /**
     * Función que se ejecuta cuando se inicia la ventana
     *
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //
    }

    @FXML
    void informeProductos(ActionEvent event) {
        DBConnect connection;
        try {
            connection = new DBConnect(); // Instanciar la conexión con la base de datos
            HashMap<String, Object> parameters = DaoProducto.findAll(); // Cargar todos los países de la base de datos para insertar en el informe
            JasperReport report = (JasperReport) JRLoader.loadObject(AgendaApplication.class.getResource("reports/" + informe + ".jasper")); // Obtener el fichero del informe
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, connection.getConnection()); // Cargar el informe con los países
            JasperViewer viewer = new JasperViewer(jprint, false); // Instanciar la vista del informe para mostrar el informe
            viewer.setVisible(true); // Mostrar el informe al usuario
        } catch (JRException e) {
            System.err.println(e.getMessage());
            mostrarAlerta("Ha ocurrido un error cargando el informe");
            Platform.exit(); // Cerrar la aplicación
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            mostrarAlerta("Ha ocurrido un erros cargando los países de la base de datos");
            Platform.exit(); // Cerrar la aplicación
        }
    }

    @FXML
    void informeSecciones(ActionEvent event) {
        //
    }

    @FXML
    void informeTablaProductos(ActionEvent event) {
        //
    }

    @FXML
    void informeGraficos(ActionEvent event) {
        //
    }

    /**
     * Función que muestra un mensaje de alerta al usuario
     *
     * @param mensaje de error a mostrar
     */
    public void mostrarAlerta(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setTitle("Error");
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}