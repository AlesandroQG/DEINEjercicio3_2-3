package com.alesandro.ejercicio3_23.model;

import java.util.Objects;

/**
 * Clase Sección
 */
public class Seccion {
    private int codigo;
    private String nombre;

    /**
     * Constructor con parámetros de la sección
     *
     * @param codigo de la sección
     * @param nombre de la sección
     */
    public Seccion(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Constructor vacío de sección
     */
    public Seccion() {}

    /**
     * Getter para el código de la sección
     *
     * @return código de la sección
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter para el código de la sección
     *
     * @param codigo nuevo código de la sección
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter para el nombre de la sección
     *
     * @return nombre de la sección
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para el nombre de la sección
     *
     * @param nombre nuevo nombre de la sección
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seccion seccion = (Seccion) o;
        return codigo == seccion.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
