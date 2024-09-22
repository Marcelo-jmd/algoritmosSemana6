package Hibrida;
public class Nodo {
    String nombre;
    Nodo siguiente;
    
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
