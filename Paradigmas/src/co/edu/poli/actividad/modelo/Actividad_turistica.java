package co.edu.poli.actividad.modelo;

import java.util.Arrays;

/**
 * Clase abstracta que representa una actividad turística genérica.
 * Contiene atributos comunes como lugar, duración, precio, nombre, fecha, tipo, país, tour, reservas, equipaje, itinerario y guías.
 * Las subclases deben implementar el método {@link #calcularCosto()} para definir su lógica de costos.
 * 
 * @author Laura
 */
public abstract class Actividad_turistica {

    /** Lugar donde se realiza la actividad */
    private String lugar;

    /** Duración de la actividad en horas */
    private int duracion;

    /** Precio base de la actividad */
    private int precio;

    /** Nombre de la actividad */
    private String nombre;

    /** Fecha de realización */
    private String fecha;

    /** Tipo de actividad (ej. senderismo, paracaidismo) */
    private String tipo;

    /** Identificador único de la actividad */
    private final String idActividad;

    /** País donde se realiza la actividad */
    private Pais pais;

    /** Tour asociado a la actividad */
    private Tour tour;

    /** Arreglo de reservas asociadas */
    private Reserva[] reserva;

    /** Arreglo de equipajes asociados */
    private Equipaje[] equipaje;

    /** Itinerario de la actividad */
    private Itinerario itinerario;

    /** Arreglo de guías que acompañan la actividad */
    private Guia[] guia;

    /** Año de creación o registro de la actividad */
    private int creacion;

    /**
     * Constructor para inicializar todos los atributos de la actividad turística.
     * 
     * @param lugar Lugar de la actividad
     * @param duracion Duración en horas
     * @param precio Precio base
     * @param nombre Nombre de la actividad
     * @param fecha Fecha de realización
     * @param tipo Tipo de actividad
     * @param idActividad Identificador único
     * @param pais País asociado
     * @param tour Tour relacionado
     * @param reserva Arreglo de reservas
     * @param equipaje Arreglo de equipajes
     * @param itinerario Itinerario asociado
     * @param guia Arreglo de guías
     * @param creacion Año de creación
     */
    public Actividad_turistica(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
                               String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje,
                               Itinerario itinerario, Guia[] guia, int creacion) {
        this.lugar = lugar;
        this.duracion = duracion;
        this.precio = precio;
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.idActividad = idActividad;
        this.pais = pais;
        this.tour = tour;
        this.reserva = reserva;
        this.equipaje = equipaje;
        this.itinerario = itinerario;
        this.guia = guia;
        this.creacion = creacion;
    }

    /** @return Lugar de la actividad */
    public String getLugar() {
        return lugar;
    }

    /** @param lugar Nuevo lugar */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /** @return Duración en horas */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la actividad.
     * 
     * @param duracion Nueva duración
     * @throws IllegalArgumentException si es negativa
     */
    public void setDuracion(int duracion) {
        if (duracion < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa.");
        }
        this.duracion = duracion;
    }

    /** @return Precio base */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la actividad.
     * 
     * @param precio Nuevo precio
     * @throws IllegalArgumentException si es negativo
     */
    public void setPrecio(int precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    /** @return Nombre de la actividad */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre Nuevo nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return Fecha de realización */
    public String getFecha() {
        return fecha;
    }

    /** @param fecha Nueva fecha */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /** @return Tipo de actividad */
    public String getTipo() {
        return tipo;
    }

    /** @param tipo Nuevo tipo */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /** @return Identificador único */
    public String getIdActividad() {
        return idActividad;
    }

    /** @return País asociado */
    public Pais getPais() {
        return pais;
    }

    /** @param pais Nuevo país */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /** @return Tour asociado */
    public Tour getTour() {
        return tour;
    }

    /** @param tour Nuevo tour */
    public void setTour(Tour tour) {
        this.tour = tour;
    }

    /** @return Arreglo de reservas */
    public Reserva[] getReserva() {
        return reserva;
    }

    /** @param reserva Nuevo arreglo de reservas */
    public void setReserva(Reserva[] reserva) {
        this.reserva = reserva;
    }

    /** @return Arreglo de equipajes */
    public Equipaje[] getEquipaje() {
        return equipaje;
    }

    /** @param equipaje Nuevo arreglo de equipajes */
    public void setEquipaje(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }

    /** @return Itinerario asociado */
    public Itinerario getItinerario() {
        return itinerario;
    }

    /** @param itinerario Nuevo itinerario */
    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    /** @return Arreglo de guías */
    public Guia[] getGuia() {
        return guia;
    }

    /** @param guia Nuevo arreglo de guías */
    public void setGuia(Guia[] guia) {
        this.guia = guia;
    }

    /** @return Año de creación */
    public int getCreacion() {
        return creacion;
    }

    /** @param creacion Nuevo año de creación */
    public void setCreacion(int creacion) {
        this.creacion = creacion;
    }

    /**
     * Devuelve una representación textual de la actividad turística.
     * 
     * @return Cadena con los datos de la actividad
     */
    @Override
    public String toString() {
        return "Actividad_turistica [lugar=" + lugar + ", duracion=" + duracion + ", precio=" + precio + ", nombre="
                + nombre + ", fecha=" + fecha + ", tipo=" + tipo + ", idActividad=" + idActividad + ", pais=" + pais
                + ", tour=" + tour + ", reserva=" + Arrays.toString(reserva) + ", equipaje=" + Arrays.toString(equipaje)
                + ", itinerario=" + itinerario + ", guia=" + Arrays.toString(guia) + ", creacion=" + creacion + "]";
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para calcular el costo de la actividad.
     * 
     * @return Costo total de la actividad
     */
    public abstract double calcularCosto();

    /**
     * Calcula el costo aplicando un descuento.
     * 
     * @param descuento Monto del descuento
     * @return Costo final con descuento
     * @throws IllegalArgumentException si el descuento es inválido
     */
    public double calcularCosto(double descuento) {
        if (descuento < 0 || descuento > precio) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y el precio.");
        }
        return (precio - descuento) + duracion;
    }

    /**
     * Aplica un descuento del 10% al precio dado.
     * 
     * @param precio Precio original
     * @return Precio con descuento aplicado
     */
    public double calcularDescuento(double precio) {
        return precio * 0.9;
    }

    /**
     * Muestra la información básica de la actividad (solo el ID).
     */
    public final void mostrarInformacionBasica() {
        System.out.println("ID Actividad: " + idActividad);
    }

    /**
     * Método de ejemplo para determinar la edad de la actividad.
     * 
     * @return Edad calculada (actualmente no implementado)
     */
    public int determinarEdad() {
        // TODO implement here
        return 0;
    }
}
