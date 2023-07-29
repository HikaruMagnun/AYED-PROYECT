
package Login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroLo {
        public void escribirArchivo(String contenido) {
        try {
            File archivo = new File("src/Login/Users.txt");
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
