package Clientes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

public class EscribirFicheroCli {
    public void escribirArchivo(String contenido) {
        try {
            File archivo = new File("src/Clientes/Datos.txt");
            FileWriter writer = new FileWriter(archivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(contenido);
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Archivo escrito exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
