package co.edu.poli.actividad.modelo;

/**
 * Representa un guía turístico que acompaña una actividad.
 * Contiene información como el identificador, nombre y los idiomas que domina.
 * También incluye un método para calcular el costo adicional por guía.
 * 
 * @author Laura
 */
public class Guia {

    /** Identificador único del guía */
    private String idGuia;

    /** Nombre del guía */
    private String nombre;

    /** Idioma(s) que habla el guía */
    private String idioma;

    /**
     * Constructor para inicializar todos los atributos del guía.
     * 
     * @param idGuia Identificador único
     * @param nombre Nombre del guía
     * @param idioma Idioma(s) que domina
     */
    public Guia(String idGuia, String nombre, String idioma) {
        this.idGuia = idGuia;
        this.nombre = nombre;
        this.idioma = idioma;
    }

    /**
     * Obtiene el identificador del guía.
     * 
     * @return ID del guía
     */
    public String getIdGuia() {
        return idGuia;
    }

    /**
     * Establece el identificador del guía.
     * 
     * @param idGuia Nuevo ID
     */
    public void setIdGuia(String idGuia) {
        this.idGuia = idGuia;
    }

    /**
     * Obtiene el nombre del guía.
     * 
     * @return Nombre del guía
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del guía.
     * 
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el idioma que habla el guía.
     * 
     * @return Idioma(s) del guía
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Establece el idioma que habla el guía.
     * 
     * @param idioma Nuevo idioma
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Devuelve una representación textual del guía.
     * 
     * @return Cadena con los datos del guía
     */
    @Override
    public String toString() {
        return "Guia [idGuia=" + idGuia + ", nombre=" + nombre + ", idioma=" + idioma + "]";
    }

    /**
     * Calcula el costo total sumando un valor adicional fijo por guía.
     * 
     * @param precio Precio base
     * @return Precio total con incremento
     */
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}
