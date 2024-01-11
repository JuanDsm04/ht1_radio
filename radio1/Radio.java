/**
 * @author Diego Flores
 * @creationDate 10/01/2024
 * @description Clase encargada de llevar el control de las funcionalidades del radio
 */

public class Radio {
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
}
