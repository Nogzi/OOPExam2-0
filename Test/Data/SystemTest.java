package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemTest {
    @Test
    void SystemTest(){
        Player player1 = new Player("Felix","Human","Red");
        Planet planet1 = new Planet(player1,2,"NicePlanet",Coordinates.CENTER);
        Cruiser cruiser1 = new Cruiser(player1);
        LinkedList<Cruiser>cruisers = new LinkedList<>();
        HashSet<Planet>planets = new HashSet<>();
        cruisers.add(cruiser1);
        planets.add(planet1);
        GameSystem gameSystem = new GameSystem(Coordinates.CENTER, planets,null, cruisers,null,null);


        assertEquals(1, gameSystem.findPlanets());
        assertEquals(1, gameSystem.findShips());
    }
}
