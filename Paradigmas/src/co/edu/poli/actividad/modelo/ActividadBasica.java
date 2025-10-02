package co.edu.poli.actividad.modelo;

import java.io.Serializable;

/**
 * Representa una actividad básica con atributos primitivos.
 * Esta clase es serializable para permitir su almacenamiento en archivos binarios.
 * 
 * @author Laura
 */
public class ActividadBasica implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Identificador único de la actividad */
    private String id;

    /** Nombre de la actividad */
    private String nombre;

    /** Duración en horas */
    private int duracion;

    /** Precio de la actividad */
    private double precio;

    /** Disponibilidad de la actividad */
    private boolean disponible;

    /**
     * Constructor para inicializar una actividad básica.
     * 
     * @param id Identificador
     * @param nombre Nombre de la actividad
     * @param duracion Duración en horas
     * @param precio Precio en pesos
     * @param disponible Estado de disponibilidad
     */
    public ActividadBasica(String id, String nombre, int duracion, double precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.disponible = disponible;
    }

    /** @return ID de la actividad */
    public String getId() { return id; }

    /** @param nombre Nuevo nombre */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @param duracion Nueva duración */
    public void setDuracion(int duracion) { this.duracion = duracion; }

    /** @param precio Nuevo precio */
    public void setPrecio(double precio) { this.precio = precio; }

    /** @param disponible Nueva disponibilidad */
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    /**
     * Devuelve una representación en texto de la actividad.
     * 
     * @return Cadena con los datos de la actividad
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Duración: " + duracion +
               ", Precio: " + precio + ", Disponible: " + disponible;
    }
}
