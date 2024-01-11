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
        this.am = false;
        this.stationSelected = 0;
        this.AMbuttons = new double[12];
        this.FMbuttons = new double[12];
    }

    @Override
    public void saveStation(int buttonId, double station) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveStation'");
    }

    @Override
    public boolean isAM() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAM'");
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

    @Override
    public void switchOnOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'switchOnOff'");
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
