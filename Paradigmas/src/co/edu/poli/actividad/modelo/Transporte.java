package co.edu.poli.actividad.modelo;

/**
 * Representa un medio de transporte utilizado en una actividad turística.
 * Contiene información como el número de serie, capacidad, precio y tipo de transporte.
 * También incluye un método para calcular el costo total considerando un valor adicional.
 * 
 * @author Laura
 */
public class Transporte {

    /** Número de serie del transporte */
    private String serial;

    /** Capacidad máxima de pasajeros */
    private int capacidad;

    /** Precio base del transporte */
    private int precio;

    /** Tipo de transporte (ej. bus, lancha, avión) */
    private String tipo;

    /**
     * Constructor para inicializar todos los atributos del transporte.
     * 
     * @param serial Número de serie
     * @param capacidad Capacidad máxima
     * @param precio Precio base
     * @param tipo Tipo de transporte
     */
    public Transporte(String serial, int capacidad, int precio, String tipo) {
        this.serial = serial;
        this.capacidad = capacidad;
        this.precio = precio;
        this.tipo = tipo;
    }

    /**
     * Obtiene el número de serie del transporte.
     * 
     * @return Número de serie
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Establece el número de serie del transporte.
     * 
     * @param serial Nuevo número de serie
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * Obtiene la capacidad máxima del transporte.
     * 
     * @return Capacidad en número de pasajeros
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad máxima del transporte.
     * 
     * @param capacidad Nueva capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtiene el precio base del transporte.
     * 
     * @return Precio en pesos
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio base del transporte.
     * 
     * @param precio Nuevo precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el tipo de transporte.
     * 
     * @return Tipo como cadena (ej. bus, lancha)
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de transporte.
     * 
     * @param tipo Nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve una representación textual del transporte.
     * 
     * @return Cadena con los datos del transporte
     */
    @Override
    public String toString() {
        return "Transporte [serial=" + serial + ", capacidad=" + capacidad + ", precio=" + precio + ", tipo=" + tipo + "]";
    }

    /**
     * Calcula el costo total del transporte sumando un valor adicional fijo.
     * 
     * @param precio Precio base
     * @return Precio total con incremento
     */
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}
