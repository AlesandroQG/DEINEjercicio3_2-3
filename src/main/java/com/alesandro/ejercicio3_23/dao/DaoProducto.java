package com.alesandro.ejercicio3_23.dao;

import com.alesandro.ejercicio3_23.db.DBConnect;
import com.alesandro.ejercicio3_23.model.Producto;
import com.alesandro.ejercicio3_23.model.Seccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Dao del objeto Producto
 */
public class DaoProducto {
    /**
     * Función que carga los datos de la tabla Producto y los devuelve para usarlos en un mapa
     *
     * @return mapa de productos para cargar en un informe
     */
    public static HashMap<String, Object> findAll() {
        HashMap<String, Object> productos = new HashMap<>();
        try {
            DBConnect connection = new DBConnect();
            String sql = "SELECT codigo,nombre,precio,stock,seccion FROM producto";
            PreparedStatement ps = connection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                float precio = rs.getFloat("precio");
                int stock = rs.getInt("stock");
                Seccion seccion = DaoSeccion.findById(rs.getInt("seccion"));
                Producto producto = new Producto(codigo, nombre, precio, stock, seccion);
                productos.put(codigo + "", producto);
            }
            rs.close();
            connection.closeConnection();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return productos;
    }
}
