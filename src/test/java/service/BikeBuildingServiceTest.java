package service;

import model.Bike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Die Testklasse
 */

// Modultest für die Klasse "BikeBuildingServiceTest" und dessen Methode
// "createCustomBike"
public class BikeBuildingServiceTest {

    // erstellen des Klassenobjekts welches die Method aufruft
    private BikeBuildingService classUndertest = new BikeBuildingServiceImpl();

    // damit sicher gestellt wird, dass die folgende Methode als Test ausgeführt
    // wird
    // muss hier "@Test" stehen

    @Test
    void createCustomBike_colorIsGreen_colorIsCorrect() {
        //Arrange
        // so soll das Bike Objekt aussehen
        Bike validBike = new Bike("green");
        String testDataColor = "green";

        //Act - mit dem erstellten Klassenobjekt wird nun dessen Methode aufgerufen
        // und in dem Objekt "yourCustomBike" gespeichert
        Bike yourCustomBike = classUndertest.createCustomBike(testDataColor);

        //Assert - vergleicht ob das erstellte Objekt die richtige Farbe bekommen
        //hat
        Assertions.assertEquals(yourCustomBike.getColor(),
                validBike.getColor());
    }
}
