package co.edu.poli.actividad.modelo;

/**
 * Representa una actividad turística de tipo Escalada.
 * Hereda de {@link Actividad_turistica} e incluye atributos específicos como altura máxima y dificultad.
 * 
 * @author Laura
 */
public class Escalada extends Actividad_turistica {

    /** Altura máxima alcanzada durante la escalada (en metros) */
    private double alturaMaxima;

    /** Nivel de dificultad de la escalada (fácil, media, difícil) */
    private String dificultad;

    /**
     * Constructor básico para inicializar una actividad de escalada con valores por defecto.
     * 
     * @param idActividad Identificador único de la actividad
     * @param nombre Nombre de la actividad
     * @param precio Precio base de la actividad
     * @param duracion Duración en horas
     */
    public Escalada(String idActividad, String nombre, int precio, int duracion) {
        super(null, duracion, precio, nombre, null, null, idActividad, null, null, null, null, null, null, 0);
        this.alturaMaxima = 10.0; // valor por defecto
        this.dificultad = "media"; // valor por defecto
    }

    /**
     * Obtiene la altura máxima de la escalada.
     * 
     * @return Altura máxima en metros
     */
    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    /**
     * Establece la altura máxima de la escalada.
     * 
     * @param alturaMaxima Nueva altura máxima
     * @throws IllegalArgumentException si la altura es negativa
     */
    public void setAlturaMaxima(double alturaMaxima) {
        if (alturaMaxima < 0) {
            throw new IllegalArgumentException("La altura máxima no puede ser negativa.");
        }
        this.alturaMaxima = alturaMaxima;
    }

    /**
     * Obtiene el nivel de dificultad de la escalada.
     * 
     * @return Dificultad como cadena
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Establece el nivel de dificultad de la escalada.
     * 
     * @param dificultad Nueva dificultad (no puede estar vacía)
     * @throws IllegalArgumentException si la dificultad es nula o vacía
     */
    public void setDificultad(String dificultad) {
        if (dificultad == null || dificultad.trim().isEmpty()) {
            throw new IllegalArgumentException("La dificultad no puede estar vacía.");
        }
        this.dificultad = dificultad;
    }

    /**
     * Devuelve una representación en texto de la actividad de escalada.
     * 
     * @return Cadena con los datos de la escalada
     */
    @Override
    public String toString() {
        return "Escalada [alturaMaxima=" + alturaMaxima + ", dificultad=" + dificultad + ", toString()="
                + super.toString() + "]";
    }

    /**
     * Calcula el costo total de la actividad de escalada según la duración y dificultad.
     * 
     * @return Costo calculado en pesos
     */
    @Override
    public double calcularCosto() {
        double factorDificultad = switch (dificultad.toLowerCase()) {
            case "facil" -> 1.0;
            case "media" -> 1.2;
            case "dificil" -> 1.5;
            default -> 1.0;
        };
        return (getPrecio() + getDuracion() * 8000) * factorDificultad;
    }
}
