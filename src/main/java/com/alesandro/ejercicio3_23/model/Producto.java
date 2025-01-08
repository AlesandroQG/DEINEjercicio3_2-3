package com.alesandro.ejercicio3_23.model;

import java.util.Objects;

/**
 * Clase Producto
 */
public class Producto {
    private int codigo;
    private String nombre;
    private float precio;
    private int stock;
    private Seccion seccion;

    /**
     * Constructor con parámetros de producto
     *
     * @param codigo del producto
     * @param nombre del producto
     * @param precio del producto
     * @param stock del producto
     * @param seccion del producto
     */
    public Producto(int codigo, String nombre, float precio, int stock, Seccion seccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.seccion = seccion;
    }

    /**
     * Constructor vacío de producto
     */
    public Producto() {}

    /**
     * Getter para el código del producto
     *
     * @return código del producto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter para el código del producto
     *
     * @param codigo nuevo código del producto
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter para el nombre del producto
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para el nombre del producto
     *
     * @param nombre nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para el precio del producto
     *
     * @return precio del producto
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Setter para el precio del producto
     *
     * @param precio nuevo precio del producto
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Getter para el stock del producto
     *
     * @return stock del producto
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter para el stock del producto
     *
     * @param stock nuevo stock del producto
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Getter para la sección del producto
     *
     * @return sección del producto
     */
    public Seccion getSeccion() {
        return seccion;
    }

    /**
     * Setter para la sección del producto
     *
     * @param seccion nueva sección del producto
     */
    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
