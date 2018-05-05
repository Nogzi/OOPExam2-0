package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DreadnoughtTest
{
    @Test
    void DreadnoughtTest(){
        Player player = new Player("Felix", "Human", "Red");
        Dreadnought dreadnought = new Dreadnought(player);

        assertEquals("Dreadnought", dreadnought.getTypeOfShip());
        assertEquals(5, dreadnought.getResourceCost());
        assertEquals(5, dreadnought.getCombatValue());
        assertEquals(1, dreadnought.getMovementSpeed());
        assertEquals(0, dreadnought.getCapacity());
        assertEquals(player, dreadnought.getOwner());
    }
}
