package co.edu.poli.actividad.vista;

import co.edu.poli.actividad.modelo.Equipaje;
import co.edu.poli.actividad.modelo.Guia;
import co.edu.poli.actividad.modelo.Itinerario;
import co.edu.poli.actividad.modelo.Pais;
import co.edu.poli.actividad.modelo.Paracaidismo;
import co.edu.poli.actividad.modelo.Reserva;
import co.edu.poli.actividad.modelo.Transporte;
import co.edu.poli.actividad.modelo.Tour;
import co.edu.poli.actividad.modelo.Actividad_turistica;
import co.edu.poli.actividad.modelo.Senderismo;
import co.edu.poli.actividad.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.actividad.servicios.SenderismoDeMontaña;
import co.edu.poli.actividad.modelo.Escalada;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import co.edu.poli.actividad.modelo.ActividadBasica;


/**
 * @author laura
 */

public class Principal {
	static final int MAX_ACTIVIDADES = 10;
    static ActividadBasica[] actividades = new ActividadBasica[MAX_ACTIVIDADES];
    static int contador = 0;
    static final String FILE_NAME = "actividades.dat";
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
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

        // Objetos completos
        Equipaje[] equipajes = {
            new Equipaje("ET54", 5.6, "Maleta de mano", "Cuero", "Pequeña"),
            new Equipaje("ET55", 50.7, "Maleta", "Cuero", "Grande")
        };

        Guia[] guias = {
            new Guia("10932873822", "Maria", "Inglés y Español"),
            new Guia("1098273822", "Sofia", "Español")
        };

        Itinerario itinerario = new Itinerario("TC22", "Senderismo", 5, true, 60000);
        Pais pais = new Pais("Colombia", "America", "Español", "Leticia", "Silvestre", "Verano", "CO123");

        Reserva[] reservas = {
            new Reserva("8382791219", "24 de diciembre", "Laura", 320425265, "lvespinosar12@gmail.com", 2, 30000),
            new Reserva("29138198219", "24 de diciembre", "Fernando", 314526734, "Fernandoponcio@gmail.com", 4, 60000)
        };

        Transporte[] transportes = {
            new Transporte("BUS4321", 30, 10000, "Bus")
        };

        Tour tour = new Tour(300000, 5, "Extremo sur de Colombia", "TR600", "24 de diciembre", transportes, guias, new Itinerario[]{itinerario});

        Paracaidismo actividadCompleta1 = new Paracaidismo("Amazonas", 5, 500000, "Paracaidismo", "24 de diciembre", "Caminata", "AC508", pais, tour, reservas, equipajes, itinerario, guias, 10, "Grande con alas", "Extremo");
        Senderismo actividadCompleta2 = new Senderismo("Amazonas", 5, 500000, "Senderismo", "24 de diciembre", "Caminata", "AC508", pais, tour, reservas, equipajes, itinerario, guias, 10, "Rocoso", 40);
        SenderismoDeMontaña actividadCompleta3 = new SenderismoDeMontaña("Amazonas", 5, 500000, "Escalada", "24 de diciembre", "Caminata", "AC508", pais, tour, reservas, equipajes, itinerario, guias, 10, "Rocoso", 40, true, "Bueno");

        System.out.println("Actividades turísticas completas:");
        System.out.println(actividadCompleta1);
        System.out.println(actividadCompleta2);
        System.out.println(actividadCompleta3);

        System.out.println("Costo del senderismo: " + actividadCompleta2.calcularCosto(6.0));

        Actividad_turistica[] actividadesTuristicas = { actividadCompleta1, actividadCompleta2, actividadCompleta3 };
        for (Actividad_turistica act : actividadesTuristicas) {
            System.out.println("Actividad: " + act.getNombre());
            System.out.println("Costo calculado: " + act.calcularCosto());
        }

        System.out.println("Duración del tour: " + tour.getDuracion());

        int opcion;
        do {
            System.out.println("MENÚ CRUD BINARIO (sin List)");
            System.out.println("1. Crear actividad");
            System.out.println("2. Listar todas");
            System.out.println("3. Listar una por ID");
            System.out.println("4. Guardar en archivo");
            System.out.println("5. Cargar desde archivo");
            System.out.println("6. Modificar actividad");
            System.out.println("7. Eliminar actividad");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> crearActividad();
                case 2 -> listarTodas();
                case 3 -> listarUna();
                case 4 -> guardarArchivo();
                case 5 -> cargarArchivo();
                case 6 -> modificarActividad();
                case 7 -> eliminarActividad();
                case 8 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 8);
    }

    static void crearActividad() {
        if (contador >= MAX_ACTIVIDADES) {
            System.out.println("Límite alcanzado.");
            return;
        }
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Duración: ");
        int duracion = scanner.nextInt();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        scanner.nextLine();

        actividades[contador++] = new ActividadBasica(id, nombre, duracion, precio, disponible);
        System.out.println("Actividad creada.");
    }

    static void listarTodas() {
        System.out.println("Actividades:");
        for (int i = 0; i < contador; i++) {
            System.out.println(actividades[i]);
        }
    }

    static void listarUna() {
        System.out.print("ID a buscar: ");
        String id = scanner.nextLine();
        boolean encontrada = false;
        for (int i = 0; i < contador; i++) {
            if (actividades[i].getId().equals(id)) {
                System.out.println(actividades[i]);
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Actividad no encontrada.");
        }
    }

    static void guardarArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeInt(contador);
            for (int i = 0; i < contador; i++) {
                out.writeObject(actividades[i]);
            }
            System.out.println("Archivo guardado.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    static void cargarArchivo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contador = in.readInt();
            for (int i = 0; i < contador; i++) {
                actividades[i] = (ActividadBasica) in.readObject();
            }
            System.out.println("Archivo cargado.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }

    static void modificarActividad() {
        System.out.print("ID a modificar: ");
        String id = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (actividades[i].getId().equals(id)) {
                System.out.print("Nuevo nombre: ");
                actividades[i].setNombre(scanner.nextLine());
                System.out.print("Nueva duración: ");
                actividades[i].setDuracion(scanner.nextInt());
                System.out.print("Nuevo precio: ");
                actividades[i].setPrecio(scanner.nextDouble());
                System.out.print("¿Disponible? (Si/No): ");
                actividades[i].setDisponible(scanner.nextBoolean());
                scanner.nextLine();
                System.out.println("Actividad modificada.");
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }

    static void eliminarActividad() {
        System.out.print("ID a eliminar: ");
        String id = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (actividades[i].getId().equals(id)) {
                for (int j = i; j < contador - 1; j++) {
                    actividades[j] = actividades[j + 1];
                }
                actividades[--contador] = null;
                System.out.println("Actividad eliminada.");
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }
}