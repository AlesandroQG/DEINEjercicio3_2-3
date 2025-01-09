package com.alesandro.ejercicio3_23.controller;

import com.alesandro.ejercicio3_23.SupermercadoApplication;
import com.alesandro.ejercicio3_23.db.DBConnect;
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

    /**
     * Función que es ejecuta cuando se pulsa el botón “Abrir Informe” de la pestaña Productos. Abre el informe de productos
     *
     * @param event evento del usuario
     */
    @FXML
    void informeProductos(ActionEvent event) {
        DBConnect connection;
        try {
            connection = new DBConnect(); // Instanciar la conexión con la base de datos
            JasperReport report = (JasperReport) JRLoader.loadObject(SupermercadoApplication.class.getResource("reports/InformeProductos.jasper")); // Obtener el fichero del informe
            JasperPrint jprint = JasperFillManager.fillReport(report, null, connection.getConnection()); // Cargar el informe con los productos
            JasperViewer viewer = new JasperViewer(jprint, false); // Instanciar la vista del informe para mostrar el informe
            viewer.setVisible(true); // Mostrar el informe al usuario
        } catch (JRException | SQLException e) {
            System.err.println(e.getMessage());
            mostrarAlerta("Ha ocurrido un error cargando el informe");
        }
    }

    /**
     * Función que es ejecuta cuando se pulsa el botón “Abrir Informe” de la pestaña Secciones. Abre el informe de secciones
     *
     * @param event evento del usuario
     */
    @FXML
    void informeSecciones(ActionEvent event) {
        DBConnect connection;
        try {
            connection = new DBConnect(); // Instanciar la conexión con la base de datos
            JasperReport report = (JasperReport) JRLoader.loadObject(SupermercadoApplication.class.getResource("reports/InformeProductos.jasper")); // Obtener el fichero del informe
            JasperPrint jprint = JasperFillManager.fillReport(report, null, connection.getConnection()); // Cargar el informe con los secciones
            JasperViewer viewer = new JasperViewer(jprint, false); // Instanciar la vista del informe para mostrar el informe
            viewer.setVisible(true); // Mostrar el informe al usuario
        } catch (JRException | SQLException e) {
            System.err.println(e.getMessage());
            mostrarAlerta("Ha ocurrido un error cargando el informe");
        }
    }

    /**
     * Función que es ejecuta cuando se pulsa el botón “Abrir Informe” de la pestaña Tabla productos. Abre el informe de tabla productos
     *
     * @param event evento del usuario
     */
    @FXML
    void informeTablaProductos(ActionEvent event) {
        DBConnect connection;
        try {
            connection = new DBConnect(); // Instanciar la conexión con la base de datos
            JasperReport report = (JasperReport) JRLoader.loadObject(SupermercadoApplication.class.getResource("reports/InformeProductos.jasper")); // Obtener el fichero del informe
            JasperPrint jprint = JasperFillManager.fillReport(report, null, connection.getConnection()); // Cargar el informe con los productos
            JasperViewer viewer = new JasperViewer(jprint, false); // Instanciar la vista del informe para mostrar el informe
            viewer.setVisible(true); // Mostrar el informe al usuario
        } catch (JRException | SQLException e) {
            System.err.println(e.getMessage());
            mostrarAlerta("Ha ocurrido un error cargando el informe");
        }
    }

    /**
     * Función que es ejecuta cuando se abre la pestaña Gráficos. Abre el informe de gráficos
     *
     * @param event evento del usuario
     */
    @FXML
    void informeGraficos(ActionEvent event) {
        DBConnect connection;
        try {
            connection = new DBConnect(); // Instanciar la conexión con la base de datos
            JasperReport report = (JasperReport) JRLoader.loadObject(SupermercadoApplication.class.getResource("reports/InformeProductos.jasper")); // Obtener el fichero del informe
            JasperPrint jprint = JasperFillManager.fillReport(report, null, connection.getConnection()); // Cargar el informe con los gráficos
            JasperViewer viewer = new JasperViewer(jprint, false); // Instanciar la vista del informe para mostrar el informe
            viewer.setVisible(true); // Mostrar el informe al usuario
        } catch (JRException | SQLException e) {
            System.err.println(e.getMessage());
            mostrarAlerta("Ha ocurrido un error cargando el informe");
        }
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