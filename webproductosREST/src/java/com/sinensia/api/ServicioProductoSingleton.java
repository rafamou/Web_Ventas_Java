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
    public ArrayList<Producto> obtenerTodos() { 
        
     Producto p1= new Producto();
     Producto p2= new Producto();
     p1.setNombre("lapiz");
     p1.setPrecio("3");
     p2.setNombre("boli");
     p2.setPrecio("5");
    //  
     listaProductos.add (p1);
     listaProductos.add (p2);
        
        
        return listaProductos;
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