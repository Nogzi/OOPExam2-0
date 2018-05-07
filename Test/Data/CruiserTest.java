package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.ShipTypes.Cruiser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CruiserTest
{
    @Test
    void CruiserTest(){
        Player player = new Player("Felix", "Human","Red");
        Cruiser cruiser = new Cruiser(player, Coordinates.NORTH);

        //assertEquals("Cruiser", cruiser.typeOfShip);
        assertEquals(2, cruiser.resourceCost);
        assertEquals(7, cruiser.combatValue);
        assertEquals(2, cruiser.movementSpeed);
        assertEquals(0, cruiser.capacity);
        assertEquals(player, cruiser.owner);
        assertEquals(Coordinates.NORTH, cruiser.location);
    }
}
