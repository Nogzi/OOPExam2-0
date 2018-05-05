package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DreadnoughtTest
{
    @Test
    void DreadnoughtTest(){
        Player player = new Player("Felix", "Human", "Red");
        Dreadnought dreadnought1 = new Dreadnought(player, Coordinates.CENTER);
        Dreadnought dreadnought2 = new Dreadnought(player, Coordinates.CENTER);

        assertEquals("Dreadnought", dreadnought1.getTypeOfShip());
        assertEquals(5, dreadnought1.getResourceCost());
        assertEquals(5, dreadnought1.getCombatValue());
        assertEquals(1, dreadnought1.getMovementSpeed());
        assertEquals(0, dreadnought1.getCapacity());
        assertEquals(player, dreadnought1.getOwner());
    
        assertTrue(dreadnought1.equals(dreadnought1));
        assertTrue(dreadnought1.equals(dreadnought2));
        assertFalse(dreadnought1.equals(null));
    }
}
