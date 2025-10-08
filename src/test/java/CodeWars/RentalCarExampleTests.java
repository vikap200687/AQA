package CodeWars;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RentalCarExampleTests {
    @Test
    public void under3Tests() {
        assertEquals(40, RentalCar.rentalCarCost(1));
        assertEquals(80, RentalCar.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, RentalCar.rentalCarCost(3));
        assertEquals(140, RentalCar.rentalCarCost(4));
        assertEquals(180, RentalCar.rentalCarCost(5));
        assertEquals(220, RentalCar.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, RentalCar.rentalCarCost(7));
        assertEquals(270, RentalCar.rentalCarCost(8));
        assertEquals(310, RentalCar.rentalCarCost(9));
        assertEquals(350, RentalCar.rentalCarCost(10));
    }
}