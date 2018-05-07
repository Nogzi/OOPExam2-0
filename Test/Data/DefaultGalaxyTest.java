package Data;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultGalaxyTest
{
	@Test
	void DefaultGalaxyTest(){
		Random random = new Random();
		Player player1 = new Player("Felix", "Human", "Blue");
		Player player2 = new Player("Simon", "Treehugger", "Red");
		
		Planet planet1 = new Planet(player1,random.nextInt(6), "Mecatol Rex", Coordinates.CENTER);
		Planet planet2 = new Planet(player2, random.nextInt(6), "Vega Major", Coordinates.NORTH);
		Planet planet3 = new Planet(player2, random.nextInt(6), "Vega Minor", Coordinates.NORTH);
		Planet planet4 = new Planet("Industrex",random.nextInt(6), Coordinates.SOUTHEAST);
		Planet planet5 = new Planet("Rigel 1", random.nextInt(6), Coordinates.SOUTH);
		Planet planet6 = new Planet("Rigel 2", random.nextInt(6), Coordinates.SOUTH);
		Planet planet7 = new Planet("Mirage", random.nextInt(6), Coordinates.NORTHWEST);
		
		Dreadnought dreadnought1 = new Dreadnought(player1);
		Dreadnought dreadnought2 = new Dreadnought(player1);
		Destroyer destroyer1 = new Destroyer(player1);
		Cruiser cruiser1 = new Cruiser(player2);
		Cruiser cruiser2 = new Cruiser(player2);
		Carrier carrier1 = new Carrier(player2);
		
		List<Dreadnought> dreadnoughts = new LinkedList<>();
		List<Destroyer> destroyers = new LinkedList<>();
		List<Cruiser> cruisers = new LinkedList<>();
		List<Carrier> carriers = new LinkedList<>();
		
		dreadnoughts.add(dreadnought1);
		dreadnoughts.add(dreadnought2);
		destroyers.add(destroyer1);
		cruisers.add(cruiser1);
		cruisers.add(cruiser2);
		carriers.add(carrier1);
		
		Set<Planet> planets1 = new HashSet<>();
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
		
		system1.setNewDreadnoughtList(dreadnoughts)
				.setNewDestroyerList(destroyers)
				.setNewLocation(Coordinates.CENTER)
				.setNewPlanetSet(planets1);
		system2.setNewLocation(Coordinates.NORTH)
				.setNewCarrierList(carriers)
				.setNewCruiserList(cruisers)
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
		
		assertEquals();
	}
}
