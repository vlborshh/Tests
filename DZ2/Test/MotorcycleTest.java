package DZ2.Test;

import DZ2.Motorcycle;
import DZ2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MotorcycleTest {

    @Test
    void testInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("ИЖ", "Планета-5", 2004);
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("ИЖ", "Юпитер-5", 2022);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testMotorcycleTestDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("ИЖ", "Юпитер-7", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Мотовездеход", "Самсон", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}