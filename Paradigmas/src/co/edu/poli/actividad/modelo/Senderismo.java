package co.edu.poli.actividad.modelo;

/**
 * Representa una actividad turística de tipo Senderismo.
 * Hereda de {@link Actividad_turistica} e incluye atributos específicos como tipo de terreno y distancia recorrida.
 * Permite calcular el costo de la actividad con o sin descuento.
 * 
 * @author Laura
 */
public class Senderismo extends Actividad_turistica {

    /** Tipo de terreno donde se realiza el senderismo (ej. boscoso, rocoso, plano) */
    private String tipoTerreno;

    /** Distancia recorrida durante la actividad en kilómetros */
    private double distanciaRecorrida;

    /**
     * Constructor completo para inicializar una actividad de senderismo con todos los atributos.
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
     * @param tipoTerreno Tipo de terreno
     * @param distanciaRecorrida Distancia recorrida en kilómetros
     */
    public Senderismo(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
                      String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje,
                      Itinerario itinerario, Guia[] guia, int creacion, String tipoTerreno, double distanciaRecorrida) {
        super(lugar, duracion, precio, nombre, fecha, tipo, idActividad, pais, tour, reserva, equipaje, itinerario, guia, creacion);
        this.tipoTerreno = tipoTerreno;
        this.distanciaRecorrida = distanciaRecorrida;
    }

    /**
     * Constructor básico con valores por defecto para tipo de terreno y distancia.
     * 
     * @param idActividad Identificador único
     * @param nombre Nombre de la actividad
     * @param precio Precio base
     * @param duracion Duración en horas
     */
    public Senderismo(String idActividad, String nombre, int precio, int duracion) {
        super(null, duracion, precio, nombre, null, null, idActividad, null, null, null, null, null, null, 0);
        this.tipoTerreno = "boscoso";
        this.distanciaRecorrida = 5.0;
    }

    /**
     * Obtiene el tipo de terreno.
     * 
     * @return Tipo de terreno
     */
    public String getTipoTerreno() {
        return tipoTerreno;
    }

    /**
     * Establece el tipo de terreno.
     * 
     * @param tipoTerreno Nuevo tipo de terreno
     * @throws IllegalArgumentException si el valor es nulo o vacío
     */
    public void setTipoTerreno(String tipoTerreno) {
        if (tipoTerreno == null || tipoTerreno.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de terreno no puede estar vacío.");
        }
        this.tipoTerreno = tipoTerreno;
    }

    /**
     * Obtiene la distancia recorrida.
     * 
     * @return Distancia en kilómetros
     */
    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    /**
     * Establece la distancia recorrida.
     * 
     * @param distanciaRecorrida Nueva distancia
     * @throws IllegalArgumentException si el valor es negativo
     */
    public void setDistanciaRecorrida(double distanciaRecorrida) {
        if (distanciaRecorrida < 0) {
            throw new IllegalArgumentException("La distancia recorrida no puede ser negativa.");
        }
        this.distanciaRecorrida = distanciaRecorrida;
    }

    /**
     * Devuelve una representación textual de la actividad de senderismo.
     * 
     * @return Cadena con los datos de la actividad
     */
    @Override
    public String toString() {
        return "Senderismo [tipoTerreno=" + tipoTerreno + ", distanciaRecorrida=" + distanciaRecorrida + ", toString()="
                + super.toString() + "]";
    }

    /**
     * Calcula el costo total aplicando un descuento y sumando el costo por distancia recorrida.
     * 
     * @param descuento Monto del descuento
     * @return Costo final de la actividad
     * @throws IllegalArgumentException si el descuento es negativo o mayor al precio base
     */
    public double calcularCosto(double descuento) {
        if (descuento < 0 || descuento > getPrecio()) {
            throw new IllegalArgumentException("Descuento inválido.");
        }
        return (getPrecio() - descuento) + (distanciaRecorrida * 1000);
    }

    /**
     * Calcula el costo total sin descuento, considerando duración y tarifa fija por hora.
     * 
     * @return Costo calculado en pesos
     */
    @Override
    public double calcularCosto() {
        return getPrecio() + (getDuracion() * 5000);
    }
}
