
package Login;

public class Arbol {
    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(Usuario usuario) {
        if (raiz == null) {
            raiz = new Nodo(usuario);
        } else {
            insertarNoRecursivo(raiz, usuario);
        }
    }

    private void insertarNoRecursivo(Nodo padre, Usuario usuario) {
        while (true) {
            if (usuario.getUsuario().compareTo(padre.getUsuario().getUsuario()) > 0) {
                if (padre.getDerecha() == null) {
                    padre.setDerecha(new Nodo(usuario));
                    break;
                } else {
                    padre = padre.getDerecha();
                }
            } else {
                if (padre.getIzquierda() == null) {
                    padre.setIzquierda(new Nodo(usuario));
                    break;
                } else {
                    padre = padre.getIzquierda();
                }
            }
        }
    }

    public boolean existe(String usuario, String contraseña) {
        Nodo actual = raiz;
        while (actual != null) {
            if (actual.getUsuario().getUsuario().equals(usuario) && actual.getUsuario().getContraseña().equals(contraseña)) {
                return true;
            } else if (usuario.compareTo(actual.getUsuario().getUsuario()) > 0) {
                actual = actual.getDerecha();
            } else {
                actual = actual.getIzquierda();
            }
        }
        return false;
    }
}
