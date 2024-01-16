/**
 * @author Juan Solis
 * @creationDate 15/01/2024
 * @description Clase que contiene los test realizados con JUnit para verificar el correcto funcionamiento de las funciones
 * de la clase Radio
 */
 import org.junit.*;


 
public class RadioTest {

    /**
    * @description Prueba para verificar el cambio de estación en la radio 
    * de la última estación a la primera en frecuencia AM
    * (La prueba está hecha para no fallar)
    */
    @Test
    public void testReturnFirstStationAM() {
        Radio radio = new Radio();
        radio.setCurrentStation(1610);
        double station = radio.nextStation();
        Assert.assertEquals("Al llegar a la última emisora de la frecuencia AM, se regresa a la emisora 530", 
        530.0, station, 0.0);
    }

    /**
    * @description Prueba que verificará el cambio de estación en la radio 
    * de la última estación a la primera en frecuencia FM
    * (La prueba está hecha para no fallar)
    */
    @Test
    public void testReturnToFirstStationFM() {
        Radio radio = new Radio();
        radio.switchAMFM();
        radio.setCurrentStation(107.9);
        double station = radio.nextStation();
        Assert.assertEquals("Al llegar a la última emisora del rango FM, debe regresar a la primera emisora", 
        87.9, station, 0.0);
    }

    /**
    * @description Prueba que verificará el guardado y la selección de la estación
    * que el usuario decida
    * (La prueba está hecha para no fallar)
    */
    @Test
    public void testSaveAndSelectStation() {
        Radio radio = new Radio();
        int button = 1;
        radio.switchAMFM();
        radio.saveStation(button, 94.9);
        radio.setCurrentStation(87.9);
        double savedStation = radio.selectStation(button);
        Assert.assertEquals("Debe obtener la estacion que se guardo en el boton 1", 94.9, savedStation, 0.0);
    }

    /**
    * @description Prueba encargada de preveer si la estacion guardada
    * es unica y no se intercala con la primer estación
    * (La prueba está hecha para fallar)
    */
    @Test
    public void testFailedSaveStation() {
        Radio radio = new Radio();
        radio.switchAMFM();
        radio.saveStation(1, 94.9);
        double station = radio.selectStation(1);
        Assert.assertEquals(87.9, station, 0.0);
    }
}
