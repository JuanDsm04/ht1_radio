/**
 * @author Diego Flores
 * @creationDate 10/01/2024
 * @description Clase encargada de llevar el control de las funcionalidades del radio
 */

public class Radio implements IRadio{
    private boolean on;
    private boolean am;
    private double stationSelected;
    private double[] AMbuttons;
    private double[] FMbuttons;

    public Radio(){
        this.on = false;
        this.am = true;
        this.stationSelected = 0;
        this.AMbuttons = new double[12];
        this.FMbuttons = new double[12];
    }

    @Override
    public void saveStation(int buttonId, double station) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveStation'");
    }

    /**
     * @description Método que informa si el radio está en AM o FM
     * @return boolean
     */
    @Override
    public boolean isAM() {
        return am;
    }

    /**
     * @description Método que informa si el radio esta encendido o apagado
     * @return boolean
     */
    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public double selectStation(int buttonId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectStation'");
    }

    /**
     * @description Método que se encarga de cambiar el estado del radio, si esta apagado lo enciende y viceversa
     * @return boolean
     */
    @Override
    public void switchOnOff() {
        if(on) on = false;
        else on = true;
    }

    @Override
    public void switchAMFM() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'switchAMFM'");
    }

    @Override
    public double nextStation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextStation'");
    }
}
