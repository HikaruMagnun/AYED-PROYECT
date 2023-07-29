
package Login;

public class Nodo {
    private Usuario usuario;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(Usuario usuario) {
        this.usuario = usuario;
        this.izquierda = null;
        this.derecha = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
