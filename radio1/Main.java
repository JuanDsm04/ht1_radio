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
        System.out.println("Bienvenido");
        System.out.println("1. Encender o apagar el radio");
        System.out.print("Elige una de las opciones: ");
        String opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                radio.switchOnOff();
                if(radio.isOn()) System.out.println("Radio encendido");
                else System.out.println("Radio apagado");
                break;
        
            default:
                System.out.println("Ingresa una opción válida");
                break;
        }
    }
}