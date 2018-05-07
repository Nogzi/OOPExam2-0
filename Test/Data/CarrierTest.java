package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.ShipTypes.Carrier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CarrierTest
{
    @Test
    void CarrierTest(){
        Player player = new Player("Felix","Human","Red");
        Carrier carrier = new Carrier(player, Coordinates.NORTH);

        assertEquals("Carrier", carrier.getTypeOfShip());
        assertEquals(3, carrier.getResourceCost());
        assertEquals(9, carrier.getCombatValue());
        assertEquals(1, carrier.getMovementSpeed());
        assertEquals(6, carrier.getCapacity());
        assertEquals(player, carrier.getOwner());
        assertEquals(Coordinates.NORTH, carrier.getLocation());
    }
}
