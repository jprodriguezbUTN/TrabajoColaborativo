/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proveedor;

import java.util.ArrayList;

/**
 *
 * @author jprod
 */
public class ListaProveedores {
    private ArrayList<Proveedor> lista;
    
    public void agregar(Proveedor prov){
        lista.add(prov);
    }
    
    /**
     * Metodo que permite buscar proveedores en el arraylist
     * @param codigo Codigo del proveedor a buscar
     * @return Retorna el proveedor que coincide con el codigo o null sino lo encuentra
     */
    public Proveedor buscar(int codigo){
        for (Proveedor prov:lista){
            if(prov.getCodigo()==codigo){
                return prov;
            }
        }
        return null;
    }

    public ArrayList<Proveedor> getLista() {
        return lista;
    }

}
