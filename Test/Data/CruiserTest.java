package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CruiserTest
{
    @Test
    void CruiserTest(){
        Player player = new Player("Felix", "Human","Red");
        Cruiser cruiser1 = new Cruiser(player, Coordinates.CENTER);
        Cruiser cruiser2 = new Cruiser(player, Coordinates.CENTER);
        

        assertEquals("Cruiser", cruiser1.getTypeOfShip());
        assertEquals(2, cruiser1.getResourceCost());
        assertEquals(7, cruiser1.getCombatValue());
        assertEquals(2, cruiser1.getMovementSpeed());
        assertEquals(0, cruiser1.getCapacity());
        assertEquals(player, cruiser1.getOwner());
    
        assertTrue(cruiser1.equals(cruiser1));
        assertTrue(cruiser1.equals(cruiser2));
        assertFalse(cruiser1.equals(null));
    }
}
