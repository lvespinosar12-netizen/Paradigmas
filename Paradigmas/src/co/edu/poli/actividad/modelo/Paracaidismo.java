package co.edu.poli.actividad.modelo;

/**
 * 
 */
public class Paracaidismo extends Actividad_turistica {

    private String tipoParacaidas;
    private String nivelDificultad;
	
    public Paracaidismo(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
			String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje, Itinerario itinerario,
			Guia[] guia, int creacion, String tipoParacaidas, String nivelDificultad) {
		super(lugar, duracion, precio, nombre, fecha, tipo, idActividad, pais, tour, reserva, equipaje, itinerario,
				guia, creacion);
		this.tipoParacaidas = tipoParacaidas;
		this.nivelDificultad = nivelDificultad;
	}

	public String getTipoParacaidas() {
		return tipoParacaidas;
	}

	public void setTipoParacaidas(String tipoParacaidas) {
		this.tipoParacaidas = tipoParacaidas;
	}

	public String getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(String nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	@Override
	public String toString() {
		return "Paracaidismo [tipoParacaidas=" + tipoParacaidas + ", nivelDificultad=" + nivelDificultad
				+ ", toString()=" + super.toString() + "]";
	}
    

}