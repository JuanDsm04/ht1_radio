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
            System.out.println("3. Siguiente estación");
            System.out.println("4. Guardar estación actual");
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
                        if(radio.isAM()) System.out.println("Frencuencia AM" + "\nEstación actual: 530");
                        else System.out.println("Frecuencia FM" + "\nEstación actual: 87.9");
                    } else {
                        System.out.println("Primero debes encender la radio");
                    }
                    break;
                    
                case "3":
                    if(radio.isOn()){
                        System.out.println("Estación actual: " + radio.nextStation());
                    }else{
                        System.out.println("Primero debes encender la radio");
                    }
                    break;

                case "4":
                    if(radio.isOn()){
                        System.out.print("Ingrese el número de botón para guardar la estación (1-12): ");
                        String button = sc.nextLine();
                        try {
                            int buttonNumber = Integer.parseInt(button);
                            if (buttonNumber >= 1 && buttonNumber <= 12) {
                                radio.saveStation(buttonNumber, radio.getCurrentStation());
                            } else {
                                System.out.println("Debe ingresar un número entre 1 y 12");
                            }

                        } catch (Exception e) {
                            System.out.println("Debe ingresar un valor númerico válido");
                        }

                    }else{
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