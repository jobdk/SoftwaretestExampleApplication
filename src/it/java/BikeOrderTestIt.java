import model.Bike;
import model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.BikeOrderService;
import service.BikeOrderServiceImpl;

public class BikeOrderTestIt {

    private BikeOrderService bikeOrderService = new BikeOrderServiceImpl();

    @Test
    void bikeOrderTest_returnsCorrectBike() {
        // Arrange
        Customer shouldLookLikeThis = new Customer("James", new Bike("blue"));

        // Act
        Customer result = bikeOrderService.orderCustomBike("James", "blue");

        // Assert
        Assertions.assertEquals(result.getName(), shouldLookLikeThis.getName());
        Assertions.assertEquals(result.getOrderedBike().getColor(),
                shouldLookLikeThis.getOrderedBike().getColor());
    }
}
