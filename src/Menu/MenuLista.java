package Menu;

import java.io.*;

public class MenuLista implements Serializable {

    private static final long serialVersionUID = 1L; 
    private Nodo inicio;
    private int tam; 
    private String nombreArchivo;

    public MenuLista(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        if (existeArchivoSerializado()) {
            cargarDesdeArchivo();
        } else {
            inicio = null;
            tam = 0;
        }
    }

    private boolean existeArchivoSerializado() {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    public void guardarEnArchivo() {
        try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(this);
            System.out.println("MenuLista guardado en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarDesdeArchivo() {
        try (FileInputStream fileIn = new FileInputStream(nombreArchivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            MenuLista menuLista = (MenuLista) objectIn.readObject();
            this.inicio = menuLista.inicio;
            this.tam = menuLista.tam;
            System.out.println("MenuLista cargado desde " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getTam() {
        return tam;
    }

    private boolean isListaVacia() {
        return inicio == null;
    }

    public void insertarInicio(String[] valores) {
        Nodo nuevo = new Nodo();
        nuevo.setContenido(valores);
        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tam++;
    }

    public void insertarFinal(String[] valores) {
        Nodo nuevo = new Nodo();
        nuevo.setContenido(valores);
        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tam++;
    }

    public void removerPorPosicion(int posicion) {
        if (posicion >= 0 && posicion < tam) {
            if (posicion == 0) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo aux = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tam--;
        }
    }

    public void eliminar() {
        inicio = null;
        tam = 0;
    }

    public boolean buscar(String[] referencia) {
        Nodo aux = inicio;
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (aux.getContenido() == referencia) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }

    public void editarNodo(String[] referencia, String[] valores) {
        if (buscar(referencia)) {
            Nodo aux = inicio;
            while (aux.getContenido() != referencia) {
                aux = aux.getSiguiente();
            }
            aux.setContenido(valores);
        }
    }

    public void removerNodo(String[] referencia) {
        if (buscar(referencia)) {
            if (inicio.getContenido() == referencia) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo aux = inicio;
                while (aux.getSiguiente().getContenido() != referencia) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
            tam--;
        }
    }

    public String[][] obtenerContenidos() {
        String[][] contenidoLista = new String[tam][2];
        if (isListaVacia()) {
            System.out.println("La lista está vacía");
        } else {
            Nodo aux = inicio;
            int index = 0;
            while (aux != null) {
                contenidoLista[index] = aux.getContenido();
                aux = aux.getSiguiente();
                index++;
            }
            System.out.println("Contenido de la lista:");
            for (int i = 0; i < contenidoLista.length; i++) {
                System.out.println(contenidoLista[i][0] + " " + contenidoLista[i][1]);
            }
        }
        return contenidoLista;
    }
    
    public String[] obtenerContenidosArray() {
    String[] contenidoLista = new String[tam];
    if (isListaVacia()) {
        System.out.println("La lista está vacía");
    } else {
        Nodo aux = inicio;
        int index = 0;
        while (aux != null) {
            String contenido = aux.getContenido()[0] + "   S/." + aux.getContenido()[1];
            contenidoLista[index] = contenido;
            aux = aux.getSiguiente();
            index++;
        }
        System.out.println("Contenido de la lista:");
        for (int i = 0; i < contenidoLista.length; i++) {
            System.out.println(contenidoLista[i]);
        }
    }
    return contenidoLista;
}

}
