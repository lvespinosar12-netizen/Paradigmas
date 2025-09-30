package co.edu.poli.actividad.servicios;

import co.edu.poli.actividad.modelo.Actividad_turistica;

/**
 * Interfaz que define las operaciones CRUD 
 * para manejar actividades turísticas.
 * 
 * @author Laura
 */
public interface OperacionCRUD {

    /**
     * Inserta una nueva actividad en el arreglo.
     * @param actividad Objeto de tipo Actividad_turistica a insertar.
     */
    void crear(Actividad_turistica actividad);

    /**
     * Busca una actividad por su identificador.
     * @param idActividad Identificador de la actividad.
     * @return Actividad_turistica encontrada o null si no existe.
     */
    Actividad_turistica leer(String idActividad);

    /**
     * Actualiza los datos de una actividad.
     * @param idActividad Identificador de la actividad a actualizar.
     * @param actividad Objeto con los datos nuevos.
     */
    void actualizar(String idActividad, Actividad_turistica actividad);

    /**
     * Elimina una actividad por su identificador.
     * @param idActividad Identificador de la actividad a eliminar.
     */
    void eliminar(String idActividad);

    /**
     * Lista todas las actividades registradas.
     */
    void listar();
}
