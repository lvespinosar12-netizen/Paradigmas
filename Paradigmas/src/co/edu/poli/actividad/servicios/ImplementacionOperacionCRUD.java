package co.edu.poli.actividad.servicios;

import co.edu.poli.actividad.modelo.Actividad_turistica;
import java.util.Arrays;

/**
 * Clase que implementa las operaciones CRUD sobre
 * un arreglo dinámico de actividades turísticas.
 * 
 * Permite agregar, consultar, actualizar y eliminar actividades
 * utilizando el identificador único de cada objeto.
 * 
 * @author Laura
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD {

    /** Arreglo dinámico de actividades turísticas */
    private Actividad_turistica[] actividades;
    /** Contador de elementos válidos */
    private int contador;

    /**
     * Constructor por defecto.
     * Inicializa el arreglo con 5 posiciones.
     */
    public ImplementacionOperacionCRUD() {
        this.actividades = new Actividad_turistica[5];
        this.contador = 0;
    }

    @Override
    public void crear(Actividad_turistica actividad) {
        if (actividad == null) return;

        // Buscar primer null disponible
        for (int i = 0; i < actividades.length; i++) {
            if (actividades[i] == null) {
                actividades[i] = actividad;
                contador++;
                return;
            }
        }

        // Si no hay null, se expande el arreglo
        actividades = Arrays.copyOf(actividades, actividades.length * 2);
        actividades[contador] = actividad;
        contador++;
    }

    @Override
    public Actividad_turistica leer(String idActividad) {
        for (Actividad_turistica act : actividades) {
            if (act != null && act.getIdActividad().equals(idActividad)) {
                return act;
            }
        }
        System.out.println("⚠ Actividad con ID " + idActividad + " no encontrada.");
        return null;
    }

    @Override
    public void actualizar(String idActividad, Actividad_turistica nueva) {
        for (int i = 0; i < actividades.length; i++) {
            if (actividades[i] != null && actividades[i].getIdActividad().equals(idActividad)) {
                actividades[i] = nueva;
                System.out.println("✔ Actividad con ID " + idActividad + " actualizada.");
                return;
            }
        }
        System.out.println("⚠ No se pudo actualizar: actividad con ID " + idActividad + " no encontrada.");
    }

    @Override
    public void eliminar(String idActividad) {
        for (int i = 0; i < actividades.length; i++) {
            if (actividades[i] != null && actividades[i].getIdActividad().equals(idActividad)) {
                actividades[i] = null;
                contador--;
                System.out.println("✔ Actividad con ID " + idActividad + " eliminada.");
                return;
            }
        }
        System.out.println("No se pudo eliminar: actividad con ID " + idActividad + " no encontrada.");
    }

    @Override
    public void listar() {
        System.out.println("\n📌 Lista de actividades:");
        for (Actividad_turistica act : actividades) {
            if (act != null) {
                System.out.println(act);
            }
        }
    }
}
