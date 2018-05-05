package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarrierTest
{
    @Test
    void CarrierTest(){
        Player player = new Player("Felix","Human","Red");
        Carrier carrier1 = new Carrier(player, Coordinates.CENTER);
        Carrier carrier2 = new Carrier(player, Coordinates.CENTER);

        assertEquals("Carrier", carrier1.getTypeOfShip());
        assertEquals(3, carrier1.getResourceCost());
        assertEquals(9, carrier1.getCombatValue());
        assertEquals(1, carrier1.getMovementSpeed());
        assertEquals(6, carrier1.getCapacity());
        assertEquals(player, carrier1.getOwner());

        assertTrue(carrier1.equals(carrier1));
        assertTrue(carrier1.equals(carrier2));
        assertFalse(carrier1.equals(null));
    }
}
