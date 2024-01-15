/**
 * @author Juan Solis
 * @creationDate 15/01/2024
 * @description Clase que contiene los test realizados con JUnit para verificar el correcto funcionamiento de las funciones
 * de la clase Radio
 */

 import org.junit.*;

 /**
 * @description Clase de prueba para verificar el cambio de estación en la radio 
 * de la última estación a la primera en frecuencia AM
 * (La prueba está hecha para no fallar)
 */
public class RadioTest {
    @Test
    public void testReturnFirstStationAM() {
        Radio radio = new Radio();
        radio.setCurrentStation(1610);
        double station = radio.nextStation();
        Assert.assertEquals("Al llegar a la última emisora de la frecuencia AM, se regresa a la emisora 530", 
        530.0, station, 0.0);
    }
}
