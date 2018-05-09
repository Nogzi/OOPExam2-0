/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

import Data.ShipTypes.Destroyer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DestroyerTest
{
    @Test
    void DestroyerTest(){
        Player player = new Player("Felix", "Human", "Red");
        Destroyer destroyer = new Destroyer(player, Coordinates.NORTH);

        //assertEquals("Destroyer", destroyer.typeOfShip);
        assertEquals(1, destroyer.resourceCost);
        assertEquals(9, destroyer.combatValue);
        assertEquals(2, destroyer.movementSpeed);
        assertEquals(0, destroyer.capacity);
        assertEquals(player, destroyer.owner);
        assertEquals(Coordinates.NORTH, destroyer.location);
    }
}
