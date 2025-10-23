package co.edu.poli.actividad.vista;

import co.edu.poli.actividad.modelo.*;
import co.edu.poli.actividad.servicios.ImplementacionOperacionCRUD;

import java.io.*;
import java.util.Scanner;

public class Principal {

    private static final int MAX_ACTIVIDADES = 10;
    private static final ActividadBasica[] actividades = new ActividadBasica[MAX_ACTIVIDADES];
    private static int contador = 0;
    private static final String FILE_NAME = "actividades.dat";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            ejecutarEjemploInicial();
            ejecutarMenu();
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Programa finalizado correctamente.");
            scanner.close();
        }
    }

    private static void ejecutarEjemploInicial() {
        ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

        Paracaidismo actividad1 = new Paracaidismo("AC001", "Paracaidismo Montaña", 200000, 5);
        Senderismo actividad2 = new Senderismo("AC002", "Senderismo Bosque", 150000, 3);
        Escalada actividad3 = new Escalada("AC003", "Escalada Playa", 180000, 4);

        crud.crear(actividad1);
        crud.crear(actividad2);
        crud.crear(actividad3);

        crud.listar();
        crud.leer("AC002");

        Senderismo actividadActualizada = new Senderismo("AC002", "Senderismo Actualizado", 220000, 6);
        crud.actualizar("AC002", actividadActualizada);
        crud.eliminar("AC003");
        crud.listar();

        System.out.println("Ejemplo inicial ejecutado correctamente.\n");
    }

    private static void ejecutarMenu() {
        int opcion = -1;

        while (opcion != 8) {
          try {
                System.out.println("\n===== MENÚ CRUD BINARIO =====");
                System.out.println("1. Crear actividad");
                System.out.println("2. Listar todas");
                System.out.println("3. Listar una por ID");
                System.out.println("4. Guardar en archivo");
                System.out.println("5. Cargar desde archivo");
                System.out.println("6. Modificar actividad");
                System.out.println("7. Eliminar actividad");
                System.out.println("8. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = Integer.parseInt(scanner.nextLine().trim());

                switch (opcion) {
                    case 1 -> crearActividad();
                    case 2 -> listarTodas();
                    case 3 -> listarUna();
                    case 4 -> guardarArchivo();
                    case 5 -> cargarArchivo();
                    case 6 -> modificarActividad();
                    case 7 -> eliminarActividad();
                    case 8 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción inválida, intente nuevamente.");
                }

                
            } catch (NumberFormatException e) {
                System.out.println("Error de ingreso: Debe ingresar un número válido.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
    }

    private static void crearActividad() {
        if (contador >= MAX_ACTIVIDADES) {
            System.out.println("Límite de actividades alcanzado.");
            return;
        }

        try {
            System.out.print("ID: ");
            String id = scanner.nextLine().trim();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();
            System.out.print("Duración (horas): ");
            int duracion = Integer.parseInt(scanner.nextLine());
            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());
            System.out.print("¿Disponible? (true/false): ");
            boolean disponible = Boolean.parseBoolean(scanner.nextLine());

            actividades[contador++] = new ActividadBasica(id, nombre, duracion, precio, disponible);
            System.out.println("Actividad creada exitosamente.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar valores numéricos válidos.");
        }
    }

    private static void listarTodas() {
        if (contador == 0) {
            System.out.println("No hay actividades registradas.");
            return;
        }

        System.out.println("=== Lista de Actividades ===");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + actividades[i]);
        }
    }

    private static void listarUna() {
        System.out.print("ID a buscar: ");
        String id = scanner.nextLine().trim();
        for (int i = 0; i < contador; i++) {
            if (actividades[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Actividad encontrada:");
                System.out.println(actividades[i]);
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }

    private static void guardarArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeInt(contador);
            for (int i = 0; i < contador; i++) {
                out.writeObject(actividades[i]);
            }
            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    private static void cargarArchivo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contador = in.readInt();
            for (int i = 0; i < contador; i++) {
                actividades[i] = (ActividadBasica) in.readObject();
            }
            System.out.println("Archivo cargado correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe. Cree una actividad primero.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }

    private static void modificarActividad() {
        System.out.print("ID a modificar: ");
        String id = scanner.nextLine().trim();

        for (int i = 0; i < contador; i++) {
            if (actividades[i].getId().equalsIgnoreCase(id)) {
                try {
                    System.out.print("Nuevo nombre: ");
                    actividades[i].setNombre(scanner.nextLine());
                    System.out.print("Nueva duración: ");
                    actividades[i].setDuracion(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Nuevo precio: ");
                    actividades[i].setPrecio(Double.parseDouble(scanner.nextLine()));
                    System.out.print("¿Disponible? (true/false): ");
                    actividades[i].setDisponible(Boolean.parseBoolean(scanner.nextLine()));
                    System.out.println("Actividad modificada correctamente.");
                    return;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Valor numérico inválido.");
                    return;
                }
            }
        }
        System.out.println("Actividad no encontrada.");
    }

    private static void eliminarActividad() {
        System.out.print("ID a eliminar: ");
        String id = scanner.nextLine().trim();

        for (int i = 0; i < contador; i++) {
            if (actividades[i].getId().equalsIgnoreCase(id)) {
                System.arraycopy(actividades, i + 1, actividades, i, contador - i - 1);
                actividades[--contador] = null;
                System.out.println("Actividad eliminada correctamente.");
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }
}
