package co.edu.poli.actividad.servicios;

import java.io.*;
import java.util.Scanner;

import co.edu.poli.actividad.modelo.ActividadBasica;

/**
 * Clase que maneja las operaciones de archivo (guardar y leer)
 * para los objetos ActividadBasica.
 * 
 */
public class OperacionArchivo {

    private static final String FILE_NAME = "actividades.dat";
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Guarda un arreglo de actividades en un archivo binario.
     *
     * @param actividades Arreglo de actividades a guardar
     * @param contador Número de actividades válidas
     */
    public static void guardarArchivo(ActividadBasica[] actividades, int contador) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeInt(contador);
            for (int i = 0; i < contador; i++) {
                out.writeObject(actividades[i]);
            }
            System.out.println("Archivo guardado correctamente en '" + FILE_NAME + "'.");
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al guardar las actividades: " + e.getMessage());
        }
    }

    /**
     * Lee (carga) las actividades desde un archivo binario.
     *
     * @param actividades Arreglo donde se cargarán las actividades
     * @return El número de actividades cargadas
     */
    public static int leerArchivo(ActividadBasica[] actividades) {
        int contador = 0;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contador = in.readInt();
            for (int i = 0; i < contador; i++) {
                actividades[i] = (ActividadBasica) in.readObject();
            }
            System.out.println("Archivo leído correctamente desde '" + FILE_NAME + "'.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Aún no hay datos guardados.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase no encontrada: " + e.getMessage());
        }
        return contador;
    }

    /**
     * Método auxiliar opcional para mostrar el contenido del archivo (solo lectura).
     */
    public static void mostrarArchivo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            int cantidad = in.readInt();
            System.out.println("Actividades guardadas en el archivo:");
            for (int i = 0; i < cantidad; i++) {
                ActividadBasica act = (ActividadBasica) in.readObject();
                System.out.println((i + 1) + ". " + act);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No hay archivo para mostrar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al mostrar archivo: " + e.getMessage());
        }
    }
}
