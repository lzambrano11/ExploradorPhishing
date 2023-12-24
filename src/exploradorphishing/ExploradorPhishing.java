/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploradorphishing;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Keva
 */
public class ExploradorPhishing {
   private static final Map<String, Integer> PalabraClave = new HashMap<>();
    static {
        PalabraClave.put("banco", 3);
        PalabraClave.put("tarjeta de crédito", 3);
        PalabraClave.put("tarjeta de debito", 3);
        PalabraClave.put("número de cuenta", 3);
        PalabraClave.put("número de seguridad social", 3);
        PalabraClave.put("contraseña", 3);
        PalabraClave.put("cuenta de correo electrónico", 3);
        PalabraClave.put("actualización de software", 2);
        PalabraClave.put("factura pendiente", 2);
        PalabraClave.put("ganador del premio", 2);
         PalabraClave.put("bono", 2);
        PalabraClave.put("urgente", 2);
        PalabraClave.put("importante", 2);
        PalabraClave.put("cerrar su cuenta", 2);
        PalabraClave.put("su cuenta ha sido bloqueada", 2);
        PalabraClave.put("su cuenta ha sido suspendida", 2);
        PalabraClave.put("su cuenta ha sido comprometida", 2);
        PalabraClave.put("su cuenta está en riesgo", 2);
        PalabraClave.put("su cuenta ha sido hackeada", 2);
        PalabraClave.put("su cuenta ha sido pirateada", 2);
        PalabraClave.put("su cuenta ha sido robada", 2);
        PalabraClave.put("su cuenta ha sido vulnerada", 2);
        PalabraClave.put("su cuenta ha sido comprometida", 2);
        PalabraClave.put("su cuenta ha sido comprometida", 2);
        PalabraClave.put("Bank of America", 2);
        PalabraClave.put("Amazon", 2);
        PalabraClave.put("Apple", 2);
        PalabraClave.put("Chase", 2);
        PalabraClave.put("PayPal", 2);
        PalabraClave.put("Microsoft", 2);
    }
    public static void main(String[] args) throws IOException {
       // Ruta del archivo de texto que se va analizar
        String filePath = "src/exploradorphishing/MiArchivo.txt";

        // Iniciando el contador de puntos
        int totalPoints = 0;

        // Lectura del archivo de texto
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder text = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }

            // Iteraciones sobre el texto en busca de palabras clave
            for (String keyword : PalabraClave.keySet()) {
                int occurrences = text.toString().split(keyword).length - 1;
                totalPoints += PalabraClave.get(keyword) * occurrences;
                //Imprimir en pantalla una línea con la palabra o frase, el número de ocurrencias y el total de puntos.
                System.out.println(keyword + " - " + occurrences + " - " + PalabraClave.get(keyword) * occurrences);
                
            }
        }

        // Impresión del total de puntos acumulados
        System.out.println("Total de Puntos: " + totalPoints); 
        
    
    }
    
}
