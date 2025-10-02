package co.edu.poli.actividad.servicios;

import co.edu.poli.actividad.modelo.Actividad_turistica;
import java.util.ArrayList;

/**
 * Implementación de operaciones CRUD para actividades turísticas.
 * Permite crear, leer, actualizar y eliminar objetos de tipo Actividad_turistica.
 * 
 * @author Laura
 */
public class ImplementacionOperacionCRUD {

    /** Lista de actividades turísticas */
    private ArrayList<Actividad_turistica> listaActividades = new ArrayList<>();

    /**
     * Crea una nueva actividad turística.
     * 
     * @param actividad Actividad a agregar
     */
    public void crear(Actividad_turistica actividad) {
        listaActividades.add(actividad);
        System.out.println("Actividad creada.");
    }

    /**
     * Lista todas las actividades registradas.
     */
    public void listar() {
        for (Actividad_turistica a : listaActividades) {
            System.out.println(a);
        }
    }

    /**
     * Muestra una actividad por su ID.
     * 
     * @param id Identificador de la actividad
     */
    public void leer(String id) {
        for (Actividad_turistica a : listaActividades) {
            if (a.getIdActividad().equals(id)) {
                System.out.println(a);
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }

    /**
     * Actualiza una actividad existente.
     * 
     * @param id ID de la actividad a modificar
     * @param nuevaActividad Nueva información
     */
    public void actualizar(String id, Actividad_turistica nuevaActividad) {
        for (int i = 0; i < listaActividades.size(); i++) {
            if (listaActividades.get(i).getIdActividad().equals(id)) {
                listaActividades.set(i, nuevaActividad);
                System.out.println("Actividad actualizada.");
                return;
            }
        }
        System.out.println("Actividad no encontrada.");
    }

    /**
     * Elimina una actividad por su ID.
     * 
     * @param id ID de la actividad a eliminar
     */
    public void eliminar(String id) {
        boolean eliminado = listaActividades.removeIf(a -> a.getIdActividad().equals(id));
        System.out.println(eliminado ? "Actividad eliminada." : "Actividad no encontrada.");
    }
}
