package co.edu.poli.actividad.servicios;

import co.edu.poli.actividad.modelo.Actividad_turistica;

/**
 * Interfaz que define las operaciones básicas CRUD (Crear, Leer, Actualizar, Eliminar) 
 * para objetos de tipo {@link Actividad_turistica}.
 * Esta interfaz permite estandarizar el manejo de actividades turísticas en el sistema.
 * 
 * Las clases que implementen esta interfaz deben proporcionar la lógica correspondiente
 * para cada operación.
 * 
 * @author Laura
 */
public interface OperacionCRUD {

    /**
     * Crea una nueva actividad turística.
     * 
     * @param act Actividad a registrar
     */
    void crear(Actividad_turistica act);

    /**
     * Lee una actividad turística por su identificador.
     * 
     * @param id Identificador de la actividad
     * @return Actividad encontrada o null si no existe
     */
    Actividad_turistica leer(String id);

    /**
     * Actualiza una actividad existente con nuevos datos.
     * 
     * @param id Identificador de la actividad a modificar
     * @param nuevaActividad Objeto con la nueva información
     */
    void actualizar(String id, Actividad_turistica nuevaActividad);

    /**
     * Elimina una actividad turística por su identificador.
     * 
     * @param id Identificador de la actividad a eliminar
     */
    void eliminar(String id);

    /**
     * Lista todas las actividades turísticas registradas.
     */
    void listar();
}
