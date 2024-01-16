/**
 * @author Juan Solis
 * @creationDate 10/01/2024
 * @description Interfaz que contiene los métodos para el funcionamiento de la radio 
 */

public interface IRadio2 {
    /**
     * Guarda la estación actual en un número de botón
     *
     * @param buttonId Número del botón de seleccionado
     * @param station  Estación actual que se va a guardar
     */
    public void saveStation(int buttonId, double station);

    /**
     * Verifica si la radio está en la frecuencia AM
     *
     * @return true si está en la frecuencia AM, false si está en FM
     */
    public boolean isAM();

    /**
     * Verifica si la radio está encendida
     *
     * @return true si está encendida, false si está apagada
     */
    public boolean  isOn();

    /**
     * Selecciona la estación almacenada en un botón
     *
     * @param buttonId Número del botón
     * @return Estación almacenada en el botón seleccionado
     */
    public double selectStation(int buttonId);

    /*
     * Enciende o apaga la radio
     */
    public void switchOnOff();

    /*
     * Cambia entre la frecuencia AM y FM
     */
    public void switchAMFM();

    /**
     * Obtiene la siguiente estación en la frecuencia actual AM/FM
     *
     * @return La siguiente estación en la frecuencia
     */
    public double nextStation();
}
