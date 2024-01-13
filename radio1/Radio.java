/**
 * @author Diego Flores
 * @creationDate 10/01/2024
 * @description Clase encargada de llevar el control de las funcionalidades del radio
 */

public class Radio implements IRadio{
    private boolean on;
    private boolean am;
    private double currentStation;
    private double[] AMbuttons;
    private double[] FMbuttons;

    public Radio(){
        this.on = false;
        this.am = true;
        this.currentStation = 530;
        this.AMbuttons = new double[12];
        this.FMbuttons = new double[12];
    }

    /**
     * @description Método que guarda el número de la estación actual en uno de los 12 botones de AM o FM
     * @return void
     */
    @Override
    public void saveStation(int buttonId, double station) {
        if(am) {
            AMbuttons[buttonId - 1] = station;
            System.out.println("Estación " + currentStation + " guardada en el botón " + buttonId + " de la frecuencia AM");
        } else {
            FMbuttons[buttonId - 1] = station;
            System.out.println("Estación " + currentStation + " guardada en el botón " + buttonId + " de la frecuencia FM");
        }
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
     * @return void
     */
    @Override
    public void switchOnOff() {
        if(on) on = false;
        else on = true;
    }

    /**
     * @description Método que se encarga de cambiar la frecuencia del radio, varia entre AM y FM
     * @return void
     */
    @Override
    public void switchAMFM() {
        if(am) {
            am = false;
            currentStation = 87.9;
        } else {
            am = true;
            currentStation = 530;
        }
    }

    /**
     * @description Método que se encarga de cambiar la estación del radio, una vez alcanzado el máximo regresa al principio
     * @return double
     */
    @Override
    public double nextStation() {
        if(isAM()){
            if(currentStation==1610) currentStation = 530;
            else currentStation +=10;
        }else{
            if(currentStation==107.9) currentStation = 87.9;
            else currentStation +=0.2;
        }
        return currentStation;
    }

    /**
     * @description Retorna la estación actual del radio
     * @return La estación actual del radio
     */
    public double getCurrentStation() {
        return currentStation;
    }
}
