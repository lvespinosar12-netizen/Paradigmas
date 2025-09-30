package co.edu.poli.actividad.modelo;

public class Escalada extends Actividad_turistica{
		
		private double alturaMaxima;
		private String dificultad;
		public Escalada(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
				String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje, Itinerario itinerario,
				Guia[] guia, int creacion, double alturaMaxima, String dificultad) {
			super(lugar, duracion, precio, nombre, fecha, tipo, idActividad, pais, tour, reserva, equipaje, itinerario,
					guia, creacion);
			this.alturaMaxima = alturaMaxima;
			this.dificultad = dificultad;
		}
		public double getAlturaMaxima() {
			return alturaMaxima;
		}
		public void setAlturaMaxima(double alturaMaxima) {
			this.alturaMaxima = alturaMaxima;
		}
		public String getDificultad() {
			return dificultad;
		}
		public void setDificultad(String dificultad) {
			this.dificultad = dificultad;
		}
		@Override
		public String toString() {
			return "Escalada [alturaMaxima=" + alturaMaxima + ", dificultad=" + dificultad + ", toString()="
					+ super.toString() + "]";
		}
		

}
