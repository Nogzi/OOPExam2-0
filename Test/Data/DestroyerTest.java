package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DestroyerTest
{
    @Test
    void DestroyerTest(){
        Player player = new Player("Felix", "Human", "Red");
        Destroyer destroyer = new Destroyer(player);

        assertEquals("Destroyer",destroyer.getTypeOfShip());
        assertEquals(1, destroyer.getResourceCost());
        assertEquals(9, destroyer.getCombatValue());
        assertEquals(2, destroyer.getMovementSpeed());
        assertEquals(0, destroyer.getCapacity());
        assertEquals(player, destroyer.getOwner());
    }
}
