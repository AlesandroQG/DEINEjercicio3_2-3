package com.alesandro.ejercicio3_23.dao;

import com.alesandro.ejercicio3_23.db.DBConnect;
import com.alesandro.ejercicio3_23.model.Seccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Dao del objeto Sección
 */
public class DaoSeccion {
    /**
     * Función que carga los datos de la tabla Sección y los devuelve para usarlos en un mapa
     *
     * @return mapa de secciones para cargar en un informe
     */
    public static HashMap<String, Object> findAll() {
        HashMap<String, Object> secciones = new HashMap<>();
        try {
            DBConnect connection = new DBConnect();
            String sql = "SELECT codigo,nombre FROM seccion";
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                Seccion seccion = new Seccion(codigo, nombre);
                secciones.put(codigo + "", seccion);
            }
            rs.close();
            connection.closeConnection();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return secciones;
    }

    /**
     * Función que carga los datos de la tabla Sección y los devuelve para usarlos en un mapa
     *
     * @return mapa de secciones para cargar en un informe
     */
    public static Seccion findById(int codigo) {
        Seccion seccion = null;
        try {
            DBConnect connection = new DBConnect();
            String sql = "SELECT codigo,nombre FROM seccion WHERE codigo = ?";
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo_db = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                seccion = new Seccion(codigo_db, nombre);
            }
            rs.close();
            connection.closeConnection();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return seccion;
    }
}
