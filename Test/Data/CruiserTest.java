package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CruiserTest
{
    @Test
    void CruiserTest(){
        Player player = new Player("Felix", "Human","Red");
        Cruiser cruiser = new Cruiser(player);

        assertEquals("Cruiser", cruiser.getTypeOfShip());
        assertEquals(2, cruiser.getResourceCost());
        assertEquals(7, cruiser.getCombatValue());
        assertEquals(2, cruiser.getMovementSpeed());
        assertEquals(0, cruiser.getCapacity());
        assertEquals(player, cruiser.getOwner());
    }
}
