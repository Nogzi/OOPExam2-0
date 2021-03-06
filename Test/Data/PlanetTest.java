package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanetTest {
    @Test
    void PlanetTest(){
        Player player = new Player("Felix","Human","Red");
        Planet planet = new Planet(player,2, "NicePlanet");

        assertEquals(player, planet.getOwner());
        assertEquals(2, planet.getResourceProduction());
        assertEquals("NicePlanet", planet.getName());
    }
}
