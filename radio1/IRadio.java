/**
 * @author Juan Solis
 * @creationDate 10/01/2024
 * @description Interfaz que contiene los métodos para el funcionamiento del radio 
 */
public interface IRadio {
    public void saveStation(int buttonId, double station);
    public boolean isAM();
    public boolean  isOn();
    public double selectStation(int buttonId);
    public void switchOnOff();
    public void switchAMFM();
    public double nextStation();
}
