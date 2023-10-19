package DZ2.Test;

import DZ2.Car;
import DZ2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

    @Test
    void testInstanceOfVehicle() {
        Car car = new Car("Москвич", "3", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Car car = new Car("Москвич", "6", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testCarTestDriveSpeed() {
        Car car = new Car("Лада", "Веста", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testCarPark() {
        Car car = new Car("Лада", "X-ray", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}
