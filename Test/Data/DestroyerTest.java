package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DestroyerTest
{
    @Test
    void DestroyerTest(){
        Player player = new Player("Felix", "Human", "Red");
        Destroyer destroyer1 = new Destroyer(player, Coordinates.CENTER);
        Destroyer destroyer2 = new Destroyer(player, Coordinates.CENTER);

        assertEquals("Destroyer",destroyer1.getTypeOfShip());
        assertEquals(1, destroyer1.getResourceCost());
        assertEquals(9, destroyer1.getCombatValue());
        assertEquals(2, destroyer1.getMovementSpeed());
        assertEquals(0, destroyer1.getCapacity());
        assertEquals(player, destroyer1.getOwner());
    
        assertTrue(destroyer1.equals(destroyer1));
        assertTrue(destroyer1.equals(destroyer2));
        assertFalse(destroyer1.equals(null));
    }
}
