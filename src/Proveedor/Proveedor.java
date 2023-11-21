/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proveedor;

/**
 *
 * @author jprod
 */
public class Proveedor {
    private int codigo;
    private String nombre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo constructor de la clase proveedor
     * @param codigo Codigo del proveedor
     * @param nombre Nombre del proveedor
     */
    public Proveedor(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
}
