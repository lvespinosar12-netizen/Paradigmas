package co.edu.poli.actividad.modelo;

/**
 * Representa una reserva realizada por un cliente para una actividad turística.
 * Contiene información personal del cliente, detalles de la reserva y el precio asociado.
 * También incluye un método para calcular el costo total con un valor adicional fijo.
 * 
 * @author Laura
 */
public class Reserva {

    /** Identificador único del cliente */
    private String idCliente;

    /** Fecha en la que se realiza la reserva */
    private String fecha;

    /** Nombre del cliente */
    private String nombre;

    /** Número de teléfono del cliente */
    private int telefono;

    /** Correo electrónico del cliente */
    private String correo;

    /** Número de personas incluidas en la reserva */
    private int capacidad;

    /** Precio total de la reserva */
    private int precio;

    /**
     * Constructor para inicializar todos los atributos de la reserva.
     * 
     * @param idCliente Identificador del cliente
     * @param fecha Fecha de la reserva
     * @param nombre Nombre del cliente
     * @param telefono Teléfono del cliente
     * @param correo Correo electrónico del cliente
     * @param capacidad Número de personas
     * @param precio Precio total de la reserva
     */
    public Reserva(String idCliente, String fecha, String nombre, int telefono, String correo, int capacidad, int precio) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    /** @return Identificador del cliente */
    public String getIdCliente() {
        return idCliente;
    }

    /** @param idCliente Nuevo identificador */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /** @return Fecha de la reserva */
    public String getFecha() {
        return fecha;
    }

    /** @param fecha Nueva fecha */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /** @return Nombre del cliente */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre Nuevo nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return Teléfono del cliente */
    public int getTelefono() {
        return telefono;
    }

    /** @param telefono Nuevo número de teléfono */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /** @return Correo electrónico del cliente */
    public String getCorreo() {
        return correo;
    }

    /** @param correo Nuevo correo electrónico */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /** @return Número de personas en la reserva */
    public int getCapacidad() {
        return capacidad;
    }

    /** @param capacidad Nueva capacidad */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /** @return Precio total de la reserva */
    public int getPrecio() {
        return precio;
    }

    /** @param precio Nuevo precio */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Devuelve una representación textual de la reserva.
     * 
     * @return Cadena con los datos de la reserva
     */
    @Override
    public String toString() {
        return "Reserva [idCliente=" + idCliente + ", fecha=" + fecha + ", nombre=" + nombre + ", telefono=" + telefono
                + ", correo=" + correo + ", capacidad=" + capacidad + ", precio=" + precio + "]";
    }

    /**
     * Calcula el costo total de la reserva sumando un valor adicional fijo.
     * 
     * @param precio Precio base
     * @return Precio total con incremento
     */
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}
