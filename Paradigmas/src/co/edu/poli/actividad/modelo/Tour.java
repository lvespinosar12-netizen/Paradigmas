package co.edu.poli.actividad.modelo;

import java.util.Arrays;

/**
 * Representa un tour turístico que agrupa múltiples elementos como transporte, guías e itinerarios.
 * Contiene información relevante como precio, duración, ubicación, fecha y los recursos asociados al tour.
 * También incluye un método para calcular el costo total con un valor adicional fijo.
 * 
 * Esta clase es final, lo que significa que no puede ser heredada.
 * 
 * @author Laura
 */
public final class Tour {

    /** Precio total del tour */
    private int precio;

    /** Duración del tour en días u horas */
    private int duracion;

    /** Ubicación geográfica del tour */
    private String ubicacion;

    /** Identificador único del tour */
    private String idTour;

    /** Fecha programada para el tour */
    private String fecha;

    /** Arreglo de medios de transporte utilizados en el tour */
    private Transporte[] transporte;

    /** Arreglo de guías turísticos asignados al tour */
    private Guia[] guia;

    /** Arreglo de itinerarios que conforman el tour */
    private Itinerario[] itinerario;

    /**
     * Constructor para inicializar todos los atributos del tour.
     * 
     * @param precio Precio total del tour
     * @param duracion Duración del tour
     * @param ubicacion Ubicación geográfica
     * @param idTour Identificador único
     * @param fecha Fecha del tour
     * @param transporte Arreglo de transportes
     * @param guia Arreglo de guías
     * @param itinerario Arreglo de itinerarios
     */
    public Tour(int precio, int duracion, String ubicacion, String idTour, String fecha,
                Transporte[] transporte, Guia[] guia, Itinerario[] itinerario) {
        this.precio = precio;
        this.duracion = duracion;
        this.ubicacion = ubicacion;
        this.idTour = idTour;
        this.fecha = fecha;
        this.transporte = transporte;
        this.guia = guia;
        this.itinerario = itinerario;
    }

    /** @return Precio del tour */
    public int getPrecio() {
        return precio;
    }

    /** @param precio Nuevo precio del tour */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /** @return Duración del tour */
    public int getDuracion() {
        return duracion;
    }

    /** @param duracion Nueva duración del tour */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /** @return Ubicación del tour */
    public String getUbicacion() {
        return ubicacion;
    }

    /** @param ubicacion Nueva ubicación */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /** @return Identificador del tour */
    public String getIdTour() {
        return idTour;
    }

    /** @param idTour Nuevo identificador */
    public void setIdTour(String idTour) {
        this.idTour = idTour;
    }

    /** @return Fecha del tour */
    public String getFecha() {
        return fecha;
    }

    /** @param fecha Nueva fecha */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /** @return Arreglo de transportes del tour */
    public Transporte[] getTransporte() {
        return transporte;
    }

    /** @param transporte Nuevo arreglo de transportes */
    public void setTransporte(Transporte[] transporte) {
        this.transporte = transporte;
    }

    /** @return Arreglo de guías del tour */
    public Guia[] getGuia() {
        return guia;
    }

    /** @param guia Nuevo arreglo de guías */
    public void setGuia(Guia[] guia) {
        this.guia = guia;
    }

    /** @return Arreglo de itinerarios del tour */
    public Itinerario[] getItinerario() {
        return itinerario;
    }

    /** @param itinerario Nuevo arreglo de itinerarios */
    public void setItinerario(Itinerario[] itinerario) {
        this.itinerario = itinerario;
    }

    /**
     * Devuelve una representación textual del tour.
     * 
     * @return Cadena con los datos del tour
     */
    @Override
    public String toString() {
        return "Tour [precio=" + precio + ", duracion=" + duracion + ", ubicacion=" + ubicacion + ", idTour=" + idTour
                + ", fecha=" + fecha + ", transporte=" + Arrays.toString(transporte) + ", guia=" + Arrays.toString(guia)
                + ", itinerario=" + Arrays.toString(itinerario) + "]";
    }

    /**
     * Calcula el costo total del tour sumando un valor adicional fijo.
     * 
     * @param precio Precio base
     * @return Precio total con incremento
     */
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}
