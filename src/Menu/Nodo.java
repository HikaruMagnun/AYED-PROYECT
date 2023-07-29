package Menu;

import java.io.Serializable;

public class Nodo implements Serializable {

    private static final long serialVersionUID = 1L; 
    private String[] contenido;
    private Nodo siguiente;

    public Nodo() {
        this.contenido = new String[2];
        this.siguiente = null;
    }

    public String[] getContenido() {
        return contenido;
    }

    public void setContenido(String[] contenido) {
        this.contenido = contenido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
