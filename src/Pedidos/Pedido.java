
package Pedidos;

import java.io.Serializable;

public class Pedido implements Serializable{
    private String[][] descripcion;
    private String cliente;
    private String mesa;
    private String hora;
    private int total;
        
    
    public Pedido(String[][] descripcion, String cliente, String mesa, String hora, int total) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.mesa = mesa;
        this.hora = hora;
        this.total = total;
    }
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Mesa: ").append(mesa).append("\n");
        sb.append("Hora: ").append(hora).append("\n");
        sb.append("Total: ").append(total).append("\n");
        sb.append("Descripción: ").append("\n");
        for (String[] item : descripcion) {
            sb.append(" - ").append(item[0]).append(" (Cantidad :").append(item[1]).append(")\n");
        }
        return sb.toString();
    }
    public String[][] getDescripcion() {
        return descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public String getMesa() {
        return mesa;
    }

    public String getHora() {
        return hora;
    }

    public int getTotal() {
        return total;
    }
    
}
