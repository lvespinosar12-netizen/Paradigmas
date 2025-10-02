package co.edu.poli.actividad.modelo;

/**
 * Representa un país asociado a una actividad turística.
 * Contiene información geográfica, cultural y logística relevante para el contexto del tour.
 * 
 * Esta clase también incluye un método para calcular un costo adicional basado en el país.
 * 
 * @author Laura
 */
public class Pais {

    /** Nombre del país */
    private String nombre;

    /** Continente al que pertenece el país */
    private String continente;

    /** Idioma oficial del país */
    private String idioma;

    /** Capital del país */
    private String capital;

    /** Clima predominante del país */
    private String clima;

    /** Época del año en la que se realiza la actividad */
    private String epoca;

    /** Identificador único del país */
    private String idPais;

    /**
     * Constructor para inicializar todos los atributos del país.
     * 
     * @param nombre Nombre del país
     * @param continente Continente
     * @param idioma Idioma oficial
     * @param capital Capital del país
     * @param clima Clima predominante
     * @param epoca Época del año
     * @param idPais Identificador único
     */
    public Pais(String nombre, String continente, String idioma, String capital, String clima, String epoca, String idPais) {
        this.nombre = nombre;
        this.continente = continente;
        this.idioma = idioma;
        this.capital = capital;
        this.clima = clima;
        this.epoca = epoca;
        this.idPais = idPais;
    }

    /** @return Nombre del país */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del país.
     * 
     * @param nombre Nuevo nombre
     * @throws IllegalArgumentException si el nombre es nulo o vacío
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del país no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    /** @return Continente del país */
    public String getContinente() {
        return continente;
    }

    /** @param continente Nuevo continente */
    public void setContinente(String continente) {
        this.continente = continente;
    }

    /** @return Idioma oficial del país */
    public String getIdioma() {
        return idioma;
    }

    /** @param idioma Nuevo idioma */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /** @return Capital del país */
    public String getCapital() {
        return capital;
    }

    /** @param capital Nueva capital */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /** @return Clima del país */
    public String getClima() {
        return clima;
    }

    /** @param clima Nuevo clima */
    public void setClima(String clima) {
        this.clima = clima;
    }

    /** @return Época del año */
    public String getEpoca() {
        return epoca;
    }

    /** @param epoca Nueva época */
    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    /** @return Identificador del país */
    public String getIdPais() {
        return idPais;
    }

    /** @param idPais Nuevo identificador */
    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    /**
     * Devuelve una representación textual del país.
     * 
     * @return Cadena con los datos del país
     */
    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + ", continente=" + continente + ", idioma=" + idioma + ", capital=" + capital
                + ", clima=" + clima + ", epoca=" + epoca + ", idPais=" + idPais + "]";
    }

    /**
     * Calcula un costo adicional basado en el país.
     * 
     * @param precio Precio base
     * @return Precio total con incremento fijo
     */
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}
