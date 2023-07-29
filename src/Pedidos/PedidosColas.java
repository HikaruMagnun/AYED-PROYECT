package Pedidos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class PedidosColas implements Serializable {

    public Nodo inicio;
    private Nodo fin;

    public PedidosColas() {
        if (existeArchivoSerializado()) {
            cargarDesdeArchivo();
        } else {
            inicio = null;
            fin = null;
        }
    }

    class Nodo implements Serializable {

        Pedido valor;
        Nodo sig;

        public Nodo(Pedido valor) {
            this.valor = valor;
            this.sig = null;
        }
    }

    private boolean existeArchivoSerializado() {
        File archivo = new File("pedidos.ser");
        return archivo.exists();
    }

    private void cargarDesdeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pedidos.ser"))) {
            PedidosColas colaSerializada = (PedidosColas) ois.readObject();
            inicio = colaSerializada.inicio;
            fin = colaSerializada.fin;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar desde el archivo: " + e.getMessage());
        }
    }
    
    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pedidos.ser"))) {
            oos.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }
    public boolean vacia() {
        return inicio == null;
    }

    public void insertar(Pedido valor) {
      
        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.sig = nuevo;
            fin = nuevo;
        }
        guardarEnArchivo();
    }


    public Pedido extraer() {

        if (!vacia()) {
           Pedido informacion = inicio.valor;
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.sig;
            }
             guardarEnArchivo();
            return informacion;
        } else {
            return null;
        }
    }

    public void vaciarCola() {
        inicio = null;
        fin = null;
         guardarEnArchivo();
    }

    public void imprimir() {
        Nodo aux = inicio;
        System.out.println("Lista de elementos de la cola:");
        while (aux != null) {
            System.out.println(aux.valor.toString()); // Imprime el objeto Pedido
            aux = aux.sig;
        }
        System.out.println("null");
    }

    public ArrayList<Pedido> obtenerElementosCola() {
        ArrayList<Pedido> elementos = new ArrayList<>();
        Nodo aux = inicio;

        while (aux != null) {
            elementos.add(aux.valor);
            aux = aux.sig;
        }

        return elementos;
    }
}
