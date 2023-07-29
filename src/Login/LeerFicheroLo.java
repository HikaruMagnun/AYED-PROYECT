
package Login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroLo {
        public String leerArchivo() {
        StringBuilder contenido = new StringBuilder();
        try {
            File archivo = new File("src/Login/Users.txt");
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea);
                contenido.append(System.lineSeparator());
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }
}
