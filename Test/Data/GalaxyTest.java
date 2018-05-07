package Data;

import Data.ShipTypes.Cruiser;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GalaxyTest
{
	@Test
	void GalaxyTest(){
		Player player1 = new Player("Felix","Human","Red");
		Planet planet1 = new Planet(player1,2,"NicePlanet",Coordinates.CENTER);
		Cruiser cruiser1 = new Cruiser(player1, Coordinates.CENTER);
		List<Ships>shipsList = new LinkedList<>();
		HashSet<Planet> planets = new HashSet<>();
		shipsList.add(cruiser1);
		planets.add(planet1);
		GameSystem gameSystem = new GameSystem(Coordinates.CENTER, planets,shipsList);
		LinkedList<GameSystem>gameSystems = new LinkedList<>();
		gameSystems.add(gameSystem);
		Galaxy galaxy = new Galaxy(gameSystems);
		
		assertEquals(1, galaxy.findPlanetsInGalaxy());
		assertEquals(1, galaxy.findShipsInGalaxy());
		assertEquals(1, galaxy.findSystemsInGalaxy());
	}
}
