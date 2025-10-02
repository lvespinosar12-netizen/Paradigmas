package co.edu.poli.actividad.modelo;

/**
 * Representa un objeto de equipaje asociado a una actividad turística.
 * Contiene información como el identificador, peso, tipo, material y tamaño del equipaje.
 * También incluye un método para calcular el costo adicional relacionado con el equipaje.
 * 
 * @author Laura
 */
public class Equipaje {

    /** Identificador único del equipaje */
    private String idEquipaje;

    /** Peso del equipaje en kilogramos */
    private double peso;

    /** Tipo de equipaje (ej. maleta, mochila, bolso) */
    private String tipo;

    /** Material del equipaje (ej. cuero, tela, plástico) */
    private String material;

    /** Tamaño del equipaje (ej. pequeña, mediana, grande) */
    private String tamanio;

    /**
     * Constructor para inicializar todos los atributos del equipaje.
     * 
     * @param idEquipaje Identificador único
     * @param peso Peso en kilogramos
     * @param tipo Tipo de equipaje
     * @param material Material del equipaje
     * @param tamanio Tamaño del equipaje
     */
    public Equipaje(String idEquipaje, double peso, String tipo, String material, String tamanio) {
        this.idEquipaje = idEquipaje;
        this.peso = peso;
        this.tipo = tipo;
        this.material = material;
        this.tamanio = tamanio;
    }

    /**
     * Obtiene el identificador del equipaje.
     * 
     * @return ID del equipaje
     */
    public String getIdEquipaje() {
        return idEquipaje;
    }

    /**
     * Establece el identificador del equipaje.
     * 
     * @param idEquipaje Nuevo ID
     */
    public void setIdEquipaje(String idEquipaje) {
        this.idEquipaje = idEquipaje;
    }

    /**
     * Obtiene el peso del equipaje.
     * 
     * @return Peso en kilogramos
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Establece el peso del equipaje.
     * 
     * @param peso Nuevo peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Obtiene el tipo de equipaje.
     * 
     * @return Tipo como cadena
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de equipaje.
     * 
     * @param tipo Nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el material del equipaje.
     * 
     * @return Material como cadena
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Establece el material del equipaje.
     * 
     * @param material Nuevo material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Obtiene el tamaño del equipaje.
     * 
     * @return Tamaño como cadena
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * Establece el tamaño del equipaje.
     * 
     * @param tamanio Nuevo tamaño
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Devuelve una representación textual del equipaje.
     * 
     * @return Cadena con los datos del equipaje
     */
    @Override
    public String toString() {
        return "Equipaje [idEquipaje=" + idEquipaje + ", peso=" + peso + ", tipo=" + tipo + ", material=" + material
                + ", tamanio=" + tamanio + "]";
    }

    /**
     * Calcula el costo total del equipaje sumando un valor adicional fijo.
     * 
     * @param precio Precio base
     * @return Precio total con incremento
     */
    public double calcularCosto(double precio) {
        return precio + 50000; // ejemplo: costo adicional por guía
    }
}
