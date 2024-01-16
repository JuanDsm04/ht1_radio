import java.util.Scanner;

/**
 * @author Juan Solis
 * @creationDate 10/01/2024
 * @description Clase que contiene el método main que ejecutará el programa 
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Radio2 radio = new Radio2();
        boolean repeat = true;

        while (repeat) {
            int buttonNumber;
            String button;
            System.out.println("\n-------- RADIO --------");
            System.out.println("1. Encender la radio");
            System.out.println("2. Cambiar AM/FM");
            System.out.println("3. Siguiente emisora");
            System.out.println("4. Guardar emisora actual");
            System.out.println("5. Seleccionar una emisora guardada");
            System.out.println("6. Apagar la radio");
            System.out.print("Elige una de las opciones: ");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    if(!radio.isOn()){
                        radio.switchOnOff();
                        System.out.println("Radio encendida");
                        System.out.println("Frencuencia AM" + "\nEmisora actual: 530");
                    } else System.out.println("La radio ya esta encendida");
                    break;
                
                case "2":
                    if (radio.isOn()){
                        radio.switchAMFM();
                        if(radio.isAM()) System.out.println("Frencuencia AM" + "\nEmisora actual: 530");
                        else System.out.println("Frecuencia FM" + "\nEmisora actual: 87.9");
                    } else {
                        System.out.println("Primero debes encender la radio");
                    }
                    break;
                    
                case "3":
                    if(radio.isOn()){
                        if(radio.isAM()) System.out.println("Emisora actual: " + (int)radio.nextStation());
                        else System.out.println("Emisora actual: " + String.format("%.1f",radio.nextStation()));
                    }else{
                        System.out.println("Primero debes encender la radio");
                    }
                    break;

                case "4":
                    if(radio.isOn()){
                        System.out.print("Ingrese el número de botón para guardar la emisora (1-12): ");
                        button = sc.nextLine();
                        try {
                            buttonNumber = Integer.parseInt(button);
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

                case "5":
                    if(radio.isOn()){
                        System.out.print("Número de botón (1-12): ");
                        button = sc.nextLine();
                        try {
                            buttonNumber = Integer.parseInt(button);
                            if (buttonNumber >= 1 && buttonNumber <= 12){
                                if(radio.isAM()) System.out.println("Emisora actual: " + (int)radio.selectStation(buttonNumber));
                                else System.out.println("Emisora actual: " + String.format("%.1f",radio.selectStation(buttonNumber)));
                            }
                            else System.out.println("Debe ingresar un número entre 1 y 12");

                        } catch (Exception e) {
                            System.out.println("Debe ingresar un valor númerico válido");
                        }
                    } else {
                        System.out.println("Primero debes encender la radio");
                    }
                    break;
                case "6":
                    if(radio.isOn()){
                        radio.switchOnOff();
                        System.out.println("Radio apagada");
                        repeat = false;
                    }else{
                        System.out.println("La radio ya esta apagada"); 
                    }
                    break;

                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }
            
        }
    }
}