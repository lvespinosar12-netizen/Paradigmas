package co.edu.poli.actividad.modelo;

/**
 * Representa el itinerario de una actividad turística.
 * Contiene información como el identificador, tipo de actividad, duración, si incluye transporte y el precio.
 * También permite calcular un costo adicional sobre el precio base.
 * 
 * @author Laura
 */
public class Itinerario {

    /** Identificador único del itinerario */
    private String idItinerario;

    /** Tipo de actividad incluida en el itinerario */
    private String actividad;

    /** Duración del itinerario en horas */
    private int duracion;

    /** Indica si el itinerario incluye transporte */
    private boolean transporte;

    /** Precio base del itinerario */
    private int precio;

    /**
     * Constructor para inicializar todos los atributos del itinerario.
     * 
     * @param idItinerario Identificador único
     * @param actividad Tipo de actividad
     * @param duracion Duración en horas
     * @param transporte Indica si incluye transporte
     * @param precio Precio base
     */
    public Itinerario(String idItinerario, String actividad, int duracion, boolean transporte, int precio) {
        this.idItinerario = idItinerario;
        this.actividad = actividad;
        this.duracion = duracion;
        this.transporte = transporte;
        this.precio = precio;
    }

    /**
     * Obtiene el identificador del itinerario.
     * 
     * @return ID del itinerario
     */
    public String getIdItinerario() {
        return idItinerario;
    }

    /**
     * Establece el identificador del itinerario.
     * 
     * @param idItinerario Nuevo ID
     */
    public void setIdItinerario(String idItinerario) {
        this.idItinerario = idItinerario;
    }

    /**
     * Obtiene el tipo de actividad del itinerario.
     * 
     * @return Actividad como cadena
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * Establece el tipo de actividad del itinerario.
     * 
     * @param actividad Nueva actividad
     */
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    /**
     * Obtiene la duración del itinerario.
     * 
     * @return Duración en horas
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración del itinerario.
     * 
     * @param duracion Nueva duración
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Indica si el itinerario incluye transporte.
     * 
     * @return true si incluye transporte, false si no
     */
    public boolean isTransporte() {
        return transporte;
    }

    /**
     * Establece si el itinerario incluye transporte.
     * 
     * @param transporte true si incluye transporte
     */
    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

    /**
     * Obtiene el precio base del itinerario.
     * 
     * @return Precio en pesos
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio base del itinerario.
     * 
     * @param precio Nuevo precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Devuelve una representación textual del itinerario.
     * 
     * @return Cadena con los datos del itinerario
     */
    @Override
    public String toString() {
        return "Itinerario [idItinerario=" + idItinerario + ", actividad=" + actividad + ", duracion=" + duracion
                + ", transporte=" + transporte + ", precio=" + precio + "]";
    }

    /**
     * Calcula el costo total del itinerario sumando un valor adicional fijo.
     * 
     * @param precio Precio base
     * @return Precio total con incremento
     */
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}
