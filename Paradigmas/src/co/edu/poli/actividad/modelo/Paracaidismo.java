package co.edu.poli.actividad.modelo;

/**
 * Representa una actividad turística de tipo Paracaidismo.
 * Hereda de {@link Actividad_turistica} e incluye atributos específicos como tipo de paracaídas y nivel de dificultad.
 * Esta clase permite calcular el costo de la actividad según el nivel de dificultad.
 * 
 * @author Laura
 */
public class Paracaidismo extends Actividad_turistica {

    /** Tipo de paracaídas utilizado en la actividad */
    private String tipoParacaidas;

    /** Nivel de dificultad de la actividad (bajo, medio, alto) */
    private String nivelDificultad;

    /**
     * Constructor completo para inicializar una actividad de paracaidismo con todos los atributos heredados y propios.
     * 
     * @param lugar Lugar donde se realiza la actividad
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
     * @param tipoParacaidas Tipo de paracaídas
     * @param nivelDificultad Nivel de dificultad
     */
    public Paracaidismo(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
                        String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje,
                        Itinerario itinerario, Guia[] guia, int creacion, String tipoParacaidas, String nivelDificultad) {
        super(lugar, duracion, precio, nombre, fecha, tipo, idActividad, pais, tour, reserva, equipaje, itinerario, guia, creacion);
        this.tipoParacaidas = tipoParacaidas;
        this.nivelDificultad = nivelDificultad;
    }

    /**
     * Constructor básico para inicializar una actividad de paracaidismo con valores por defecto.
     * 
     * @param idActividad Identificador único
     * @param nombre Nombre de la actividad
     * @param precio Precio base
     * @param duracion Duración en horas
     */
    public Paracaidismo(String idActividad, String nombre, int precio, int duracion) {
        super(null, duracion, precio, nombre, null, null, idActividad, null, null, null, null, null, null, 0);
        this.tipoParacaidas = "estándar";
        this.nivelDificultad = "medio";
    }

    /**
     * Obtiene el tipo de paracaídas utilizado.
     * 
     * @return Tipo de paracaídas
     */
    public String getTipoParacaidas() {
        return tipoParacaidas;
    }

    /**
     * Establece el tipo de paracaídas.
     * 
     * @param tipoParacaidas Tipo de paracaídas
     * @throws IllegalArgumentException si el valor es nulo o vacío
     */
    public void setTipoParacaidas(String tipoParacaidas) {
        if (tipoParacaidas == null || tipoParacaidas.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de paracaídas no puede estar vacío.");
        }
        this.tipoParacaidas = tipoParacaidas;
    }

    /**
     * Obtiene el nivel de dificultad de la actividad.
     * 
     * @return Nivel de dificultad
     */
    public String getNivelDificultad() {
        return nivelDificultad;
    }

    /**
     * Establece el nivel de dificultad.
     * 
     * @param nivelDificultad Nivel de dificultad
     * @throws IllegalArgumentException si el valor es nulo o vacío
     */
    public void setNivelDificultad(String nivelDificultad) {
        if (nivelDificultad == null || nivelDificultad.trim().isEmpty()) {
            throw new IllegalArgumentException("El nivel de dificultad no puede estar vacío.");
        }
        this.nivelDificultad = nivelDificultad;
    }

    /**
     * Devuelve una representación en texto de la actividad de paracaidismo.
     * 
     * @return Cadena con los datos de la actividad
     */
    @Override
    public String toString() {
        return "Paracaidismo [tipoParacaidas=" + tipoParacaidas + ", nivelDificultad=" + nivelDificultad
                + ", toString()=" + super.toString() + "]";
    }

    /**
     * Calcula el costo total de la actividad según el nivel de dificultad.
     * 
     * @return Costo calculado en pesos
     */
    @Override
    public double calcularCosto() {
        double factor = switch (nivelDificultad.toLowerCase()) {
            case "bajo" -> 1.1;
            case "medio" -> 1.2;
            case "alto" -> 1.4;
            default -> 1.2;
        };
        return getPrecio() * factor;
    }
}
