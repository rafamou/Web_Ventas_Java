/* Clase patrón Singleton, sólo puede haber una
 * instancia (objeto) en toda la aplicación
 * de este tipo de clase
 */
package com.sinensia.api;

import java.util.ArrayList;

public class ServicioProductoSingleton {    
    
    private ArrayList<Producto> listaProductos;
    
    
    
    public void insertar(Producto p) {
        listaProductos.add(p);
    }
    public Producto modificar(Producto p) {
        p.setNombre(p.getNombre() + " - Modificado");
        p.setPrecio(p.getPrecio()+ " - Modificado");
        return p;
    }
    public Producto[] obtenerTodos() { 
      //private ArrayList<Producto> listaProductos;
    
    //  listaProductos.add(Producto prod= new Producto ("Volvo", "1000"))
      
        return (Producto[]) listaProductos.toArray();
    }
 
    private static ServicioProductoSingleton instancia = null;    

    private ServicioProductoSingleton() {
       this.listaProductos = new ArrayList<>();
    }
    public static ServicioProductoSingleton getInstancia() {
        if (instancia == null )
            instancia = new ServicioProductoSingleton();
        return instancia;
    }
    
}