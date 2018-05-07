package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.ShipTypes.Dreadnought;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DreadnoughtTest
{
    @Test
    void DreadnoughtTest(){
        Player player = new Player("Felix", "Human", "Red");
        Dreadnought dreadnought = new Dreadnought(player, Coordinates.NORTH);

        //assertEquals("Dreadnought", dreadnought.typeOfShip);
        assertEquals(5, dreadnought.resourceCost);
        assertEquals(5, dreadnought.combatValue);
        assertEquals(1, dreadnought.movementSpeed);
        assertEquals(0, dreadnought.capacity);
        assertEquals(player, dreadnought.owner);
        assertEquals(Coordinates.NORTH, dreadnought.location);
    }
}
