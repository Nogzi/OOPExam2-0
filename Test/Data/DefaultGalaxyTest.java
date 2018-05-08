package Data;

import Data.ShipTypes.Carrier;
import Data.ShipTypes.Cruiser;
import Data.ShipTypes.Destroyer;
import Data.ShipTypes.Dreadnought;
import exception.NoMatchingSystemException;
import exception.PlanetIsInMoreThenOneSystemException;
import exception.TooManyPlanets;
import exception.WrongCenterPlanetException;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DefaultGalaxyTest
{
	@Test
	void DefaultGalaxyTest() throws NoMatchingSystemException, PlanetIsInMoreThenOneSystemException, WrongCenterPlanetException, TooManyPlanets {
		Random random = new Random();
		Player player1 = new Player("Crassus", "The Emirates of Hacan", "Blue");
		Player player2 = new Player("Pompey", "The Federation of Sol", "Red");
		
		List<Player>players = new LinkedList<>();
		players.add(player1);
		players.add(player2);

		Planet planet1 = new Planet(player1,random.nextInt(6), "Mecatol Rex", Coordinates.CENTER);
		Planet planet2 = new Planet(player2, random.nextInt(6), "Vega Major", Coordinates.NORTH);
		Planet planet3 = new Planet(player2, random.nextInt(6), "Vega Minor", Coordinates.NORTH);
		Planet planet4 = new Planet("Industrex",random.nextInt(6), Coordinates.SOUTHEAST);
		Planet planet5 = new Planet("Rigel 1", random.nextInt(6), Coordinates.SOUTH);
		Planet planet6 = new Planet("Rigel 2", random.nextInt(6), Coordinates.SOUTH);
		Planet planet7 = new Planet("Mirage", random.nextInt(6), Coordinates.NORTHWEST);

		Dreadnought dreadnought1 = new Dreadnought(player1,Coordinates.CENTER);
		Dreadnought dreadnought2 = new Dreadnought(player1,Coordinates.CENTER);
		Destroyer destroyer1 = new Destroyer(player1, Coordinates.CENTER);
		Cruiser cruiser1 = new Cruiser(player2, Coordinates.NORTH);
		Cruiser cruiser2 = new Cruiser(player2, Coordinates.NORTH);
		Carrier carrier1 = new Carrier(player2, Coordinates.NORTH);

		List<Ships>shipsList1 = new LinkedList<>();
		List<Ships>shipsList2 = new LinkedList<>();

		shipsList1.add(dreadnought1);
		shipsList1.add(dreadnought2);
		shipsList1.add(destroyer1);
		shipsList2.add(cruiser1);
		shipsList2.add(cruiser2);
		shipsList2.add(carrier1);

		Set<Planet>planets1 = new HashSet<>();
		Set<Planet>planets2 = new HashSet<>();
		Set<Planet>planets3 = new HashSet<>();
		Set<Planet>planets4 = new HashSet<>();
		Set<Planet>planets5 = new HashSet<>();

		planets1.add(planet1);
		planets2.add(planet2);
		planets2.add(planet3);
		planets3.add(planet4);
		planets4.add(planet5);
		planets4.add(planet6);
		planets5.add(planet7);

		GameSystemBuilder system1 = new GameSystemBuilder();
		GameSystemBuilder system2 = new GameSystemBuilder();
		GameSystemBuilder system3 = new GameSystemBuilder();
		GameSystemBuilder system4 = new GameSystemBuilder();
		GameSystemBuilder system5 = new GameSystemBuilder();
		GameSystemBuilder system6 = new GameSystemBuilder();
		GameSystemBuilder system7 = new GameSystemBuilder();

		system1.setNewLocation(Coordinates.CENTER)
				.setNewPlanetSet(planets1)
				.setNewShipsSet(shipsList1);
		system2.setNewLocation(Coordinates.NORTH)
				.setNewShipsSet(shipsList2)
				.setNewPlanetSet(planets2);
		system3.setNewLocation(Coordinates.NORTHWEST)
				.setNewPlanetSet(planets5);
		system4.setNewLocation(Coordinates.NORTHEAST);
		system5.setNewLocation(Coordinates.SOUTH)
				.setNewPlanetSet(planets4);
		system6.setNewLocation(Coordinates.SOUTHWEST);
		system7.setNewLocation(Coordinates.SOUTHEAST)
				.setNewPlanetSet(planets3);

		GameSystem gameSystem1 = system1.createGameSystem();
		GameSystem gameSystem2 = system2.createGameSystem();
		GameSystem gameSystem3 = system3.createGameSystem();
		GameSystem gameSystem4 = system4.createGameSystem();
		GameSystem gameSystem5 = system5.createGameSystem();
		GameSystem gameSystem6 = system6.createGameSystem();
		GameSystem gameSystem7 = system7.createGameSystem();

		List<GameSystem>gameSystems = new LinkedList<>();

		gameSystems.add(gameSystem1);
		gameSystems.add(gameSystem2);
		gameSystems.add(gameSystem3);
		gameSystems.add(gameSystem4);
		gameSystems.add(gameSystem5);
		gameSystems.add(gameSystem6);
		gameSystems.add(gameSystem7);

		Galaxy galaxy = new Galaxy(gameSystems);

		galaxy.makeDefaultGalaxy();
		
		assertEquals(7, galaxy.findPlanetsInGalaxy());
		assertEquals(7, galaxy.findSystemsInGalaxy());
		assertEquals(6, galaxy.findShipsInGalaxy());

		assertTrue(galaxy.CheckLegality());
		
		for (Player player: players)
		{
			galaxy.findAllPlayersShips(player);
			
		}
		
	}
}
