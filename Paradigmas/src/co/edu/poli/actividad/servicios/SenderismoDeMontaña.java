package co.edu.poli.actividad.servicios;

import co.edu.poli.actividad.modelo.Equipaje;
import co.edu.poli.actividad.modelo.Guia;
import co.edu.poli.actividad.modelo.Itinerario;
import co.edu.poli.actividad.modelo.Pais;
import co.edu.poli.actividad.modelo.Reserva;
import co.edu.poli.actividad.modelo.Senderismo;
import co.edu.poli.actividad.modelo.Tour;

/**
 * 
 */
public class SenderismoDeMontaña extends Senderismo {

    private boolean seRequiereEquipo;
    private String climaEsperado;
	public SenderismoDeMontaña(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
			String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje, Itinerario itinerario,
			Guia[] guia, int creacion, String tipoTerreno, double distanciaRecorrida, boolean seRequiereEquipo,
			String climaEsperado) {
		super(lugar, duracion, precio, nombre, fecha, tipo, idActividad, pais, tour, reserva, equipaje, itinerario,
				guia, creacion, tipoTerreno, distanciaRecorrida);
		this.seRequiereEquipo = seRequiereEquipo;
		this.climaEsperado = climaEsperado;
	}
	public boolean isSeRequiereEquipo() {
		return seRequiereEquipo;
	}
	public void setSeRequiereEquipo(boolean seRequiereEquipo) {
		this.seRequiereEquipo = seRequiereEquipo;
	}
	public String getClimaEsperado() {
		return climaEsperado;
	}
	public void setClimaEsperado(String climaEsperado) {
		this.climaEsperado = climaEsperado;
	}
	@Override
	public String toString() {
		return "SenderismoDeMontaña [seRequiereEquipo=" + seRequiereEquipo + ", climaEsperado=" + climaEsperado
				+ ", toString()=" + super.toString() + "]";
	}

}