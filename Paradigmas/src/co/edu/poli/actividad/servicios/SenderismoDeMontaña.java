package co.edu.poli.actividad.servicios;

import co.edu.poli.actividad.modelo.*;

/**
 * Representa una actividad especializada de senderismo en montaña.
 * Hereda de {@link Senderismo} e incluye atributos adicionales como si se requiere equipo especial
 * y el clima esperado durante la actividad.
 * Esta clase permite extender las características del senderismo básico para entornos más exigentes.
 * 
 * @author Laura
 */
public class SenderismoDeMontaña extends Senderismo {

    /** Indica si se requiere equipo especializado para la actividad */
    private boolean seRequiereEquipo;

    /** Clima esperado durante la actividad de montaña */
    private String climaEsperado;

    /**
     * Constructor completo para inicializar todos los atributos de senderismo de montaña.
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
     * @param tipoTerreno Tipo de terreno
     * @param distanciaRecorrida Distancia recorrida en kilómetros
     * @param seRequiereEquipo true si se requiere equipo especializado
     * @param climaEsperado Clima esperado durante la actividad
     */
    public SenderismoDeMontaña(String lugar, int duracion, int precio, String nombre, String fecha, String tipo,
                               String idActividad, Pais pais, Tour tour, Reserva[] reserva, Equipaje[] equipaje,
                               Itinerario itinerario, Guia[] guia, int creacion, String tipoTerreno,
                               double distanciaRecorrida, boolean seRequiereEquipo, String climaEsperado) {
        super(lugar, duracion, precio, nombre, fecha, tipo, idActividad, pais, tour, reserva, equipaje, itinerario,
              guia, creacion, tipoTerreno, distanciaRecorrida);
        this.seRequiereEquipo = seRequiereEquipo;
        this.climaEsperado = climaEsperado;
    }

    /**
     * Indica si se requiere equipo especializado.
     * 
     * @return true si se requiere equipo, false si no
     */
    public boolean isSeRequiereEquipo() {
        return seRequiereEquipo;
    }

    /**
     * Establece si se requiere equipo especializado.
     * 
     * @param seRequiereEquipo true si se requiere equipo
     */
    public void setSeRequiereEquipo(boolean seRequiereEquipo) {
        this.seRequiereEquipo = seRequiereEquipo;
    }

    /**
     * Obtiene el clima esperado durante la actividad.
     * 
     * @return Clima como cadena
     */
    public String getClimaEsperado() {
        return climaEsperado;
    }

    /**
     * Establece el clima esperado durante la actividad.
     * 
     * @param climaEsperado Nuevo valor de clima esperado
     */
    public void setClimaEsperado(String climaEsperado) {
        this.climaEsperado = climaEsperado;
    }

    /**
     * Devuelve una representación textual de la actividad de senderismo de montaña.
     * 
     * @return Cadena con los datos extendidos de la actividad
     */
    @Override
    public String toString() {
        return "SenderismoDeMontaña [seRequiereEquipo=" + seRequiereEquipo + ", climaEsperado=" + climaEsperado
                + ", toString()=" + super.toString() + "]";
    }
}
