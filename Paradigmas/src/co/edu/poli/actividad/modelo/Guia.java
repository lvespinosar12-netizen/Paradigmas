package co.edu.poli.actividad.modelo;

/**
 * 
 */
public class Guia {


    public Guia(String idGuia, String nombre, String idioma) {
		super();
		this.idGuia = idGuia;
		this.nombre = nombre;
		this.idioma = idioma;
	}

	public String getIdGuia() {
		return idGuia;
	}

	public void setIdGuia(String idGuia) {
		this.idGuia = idGuia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	@Override
	public String toString() {
		return "Guia [idGuia=" + idGuia + ", nombre=" + nombre + ", idioma=" + idioma + "]";
	}


	/**
     * 
     */
    private String idGuia;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String idioma;
   
    
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }



}