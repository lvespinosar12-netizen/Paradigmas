package co.edu.poli.actividad.modelo;

/**
 * 
 */
public class Pais {

    public Pais(String nombre, String continente, String idioma, String capital, String clima, String epoca,
			String idPais) {
		super();
		this.nombre = nombre;
		this.continente = continente;
		this.idioma = idioma;
		this.capital = capital;
		this.clima = clima;
		this.epoca = epoca;
		this.idPais = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	public String getIdPais() {
		return idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", continente=" + continente + ", idioma=" + idioma + ", capital=" + capital
				+ ", clima=" + clima + ", epoca=" + epoca + ", idPais=" + idPais + "]";
	}

	/**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String continente;

    /**
     * 
     */
    private String idioma;

    /**
     * 
     */
    private String capital;

    /**
     * 
     */
    private String clima;

    /**
     * 
     */
    private String epoca;

    /**
     * 
     */
    private String idPais;

    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }


}