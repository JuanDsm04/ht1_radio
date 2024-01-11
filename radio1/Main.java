import java.util.Scanner;

/**
 * @author Juan Solis
 * @creationDate 10/01/2024
 * @description Clase que contiene el método main que ejecutará el programa 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Radio radio = new Radio();
        boolean repeat = true;

        while (repeat) {
            System.out.println("\n-------- RADIO --------");
            System.out.println("1. Encender/Apagar");
            System.out.println("2. Cambiar AM/FM");
            System.out.print("Elige una de las opciones: ");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    radio.switchOnOff();
                    if(radio.isOn()){
                        System.out.println("Radio encendida");
                        if(radio.isAM()) System.out.println("Frencuencia actual: AM");
                        else System.out.println("Frecuencia actual: FM");
                    } else {
                        System.out.println("Radio apagada");
                    }
                    break;
                
                case "2":
                    if (radio.isOn()){
                        radio.switchAMFM();
                        if(radio.isAM()) System.out.println("Frencuencia AM");
                        else System.out.println("Frecuencia FM");
                    } else {
                        System.out.println("Primero debes encender la radio");
                    }
                    break;
                    
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }
            
        }
    }
}