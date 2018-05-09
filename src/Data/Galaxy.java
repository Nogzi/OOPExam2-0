/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

import Data.CustomInfo.Colors;
import Data.CustomInfo.PlanetNames;
import Data.CustomInfo.Races;
import Data.ShipTypes.Carrier;
import Data.ShipTypes.Cruiser;
import Data.ShipTypes.Destroyer;
import Data.ShipTypes.Dreadnought;
import exception.NoMatchingSystemException;
import exception.PlanetIsInMoreThenOneSystemException;
import exception.TooManyPlanets;
import exception.WrongCenterPlanetException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Galaxy
{
	private List<GameSystem> gameSystemList = new LinkedList<>();
	private List<Player> players = new LinkedList<>();
	private int amountOfSystems = 0;
	private int amountOfShips = 0;
	private int amountOfPlanets = 0;
	
	public int getAmountOfSystems()
	{
		return amountOfSystems;
	}
	
	public List<GameSystem> getGameSystemList()
	{
		return gameSystemList;
	}
	
	public List<Player> getPlayers()
	{
		return players;
	}
	
	public Galaxy(List<GameSystem> gameSystemList)
	{
		this.gameSystemList = gameSystemList;
	}
	
	public Galaxy(List<GameSystem> gameSystemList, List<Player> players)
	{
		this.gameSystemList = gameSystemList;
		this.players = players;
	}
	
	public Galaxy()
	{
	}
	
	/*
	 * finds the amount of systems in the galaxy
	 */
	public int findSystemsInGalaxy()
	{
		amountOfSystems += gameSystemList.size();
		System.out.println("There is " + amountOfSystems + " systems in the galaxy");
		return amountOfSystems;
	}
	
	/*
	 * finds the amount of ships in the galaxy
	 */
	public int findShipsInGalaxy()
	{
		for (GameSystem gameSystem : gameSystemList)
		{
			amountOfShips += gameSystem.findShips();
		}
		System.out.println("There is " + amountOfShips + " units in the galaxy");
		return amountOfShips;
	}
	
	/*
	 * finds the amount of planets in the galaxy
	 */
	public int findPlanetsInGalaxy()
	{
		for (GameSystem gameSystem : gameSystemList)
		{
			amountOfPlanets += gameSystem.findPlanets();
		}
		System.out.println("There is " + amountOfPlanets + " planets in the galaxy");
		return amountOfPlanets;
	}
	
	/*
	 * A method that makes the default galaxy after the presets in the assignment
	 */
	public Galaxy makeDefaultGalaxy()
	{
		Random random = new Random();
		Player player1 = new Player("Crassus", Races.races.get(3), Colors.Colors.get(0));
		Player player2 = new Player("Pompey", Races.races.get(4), Colors.Colors.get(1));

		players.add(player1);
		players.add(player2);

		Planet planet1 = new Planet(player1, random.nextInt(6), "Mecatol Rex", Coordinates.CENTER);
		Planet planet2 = new Planet(player2, random.nextInt(6), "Vega Major", Coordinates.NORTH);
		Planet planet3 = new Planet(player2, random.nextInt(6), "Vega Minor", Coordinates.NORTH);
		Planet planet4 = new Planet("Industrex", random.nextInt(6), Coordinates.SOUTHEAST);
		Planet planet5 = new Planet("Rigel 1", random.nextInt(6), Coordinates.SOUTH);
		Planet planet6 = new Planet("Rigel 2", random.nextInt(6), Coordinates.SOUTH);
		Planet planet7 = new Planet("Mirage", random.nextInt(6), Coordinates.NORTHWEST);

		Dreadnought dreadnought1 = new Dreadnought(player1, Coordinates.CENTER);
		Dreadnought dreadnought2 = new Dreadnought(player1, Coordinates.CENTER);
		Destroyer destroyer1 = new Destroyer(player1, Coordinates.CENTER);
		Cruiser cruiser1 = new Cruiser(player2, Coordinates.NORTH);
		Cruiser cruiser2 = new Cruiser(player2, Coordinates.NORTH);
		Carrier carrier1 = new Carrier(player2, Coordinates.NORTH);

		List<Ships> shipsList1 = new LinkedList<>();
		List<Ships> shipsList2 = new LinkedList<>();

		shipsList1.add(dreadnought1);
		shipsList1.add(dreadnought2);
		shipsList1.add(destroyer1);
		shipsList2.add(cruiser1);
		shipsList2.add(cruiser2);
		shipsList2.add(carrier1);

		Set<Planet> planets1 = new HashSet<>();
		Set<Planet> planets2 = new HashSet<>();
		Set<Planet> planets3 = new HashSet<>();
		Set<Planet> planets4 = new HashSet<>();
		Set<Planet> planets5 = new HashSet<>();

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
				.setNewShipsSet(shipsList1)
				.setNewOwner(player1);
		system2.setNewLocation(Coordinates.NORTH)
				.setNewShipsSet(shipsList2)
				.setNewPlanetSet(planets2)
				.setNewOwner(player2);
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

		List<GameSystem> gameSystems = new LinkedList<>();

		gameSystems.add(gameSystem1);
		gameSystems.add(gameSystem2);
		gameSystems.add(gameSystem3);
		gameSystems.add(gameSystem4);
		gameSystems.add(gameSystem5);
		gameSystems.add(gameSystem6);
		gameSystems.add(gameSystem7);

		Galaxy galaxy = new Galaxy(gameSystems);
		return galaxy;
	}
	
	/*
	 * a method that gets used in Check legality method to find a system at a specific placement
	 */
	public GameSystem getSystemAt(Coordinates coordinates) throws NoMatchingSystemException
	{
		for (GameSystem gameSystem : gameSystemList)
		{
			if (gameSystem.getLocation().equals(coordinates))
				return gameSystem;
		}

		throw new NoMatchingSystemException();
	}
	
	/*
	 * checks if the galaxy fulfills the conditions of the assignment
	 */
	public boolean checkLegality() throws WrongCenterPlanetException, PlanetIsInMoreThenOneSystemException, NoMatchingSystemException, TooManyPlanets
	{
		GameSystem centerSystem;

		centerSystem = getSystemAt(Coordinates.CENTER);
		if (centerSystem.getPlanetSet().size() == 1)
		{
			if (centerSystem.getPlanetSet().contains(new Planet("Mecatol Rex", Coordinates.CENTER)))

				System.out.println("Center system is fine");
			else
				throw new WrongCenterPlanetException();
		} else
			return false;

		for (GameSystem gameSystems1 : gameSystemList)
		{
			for (Planet planets : gameSystems1.getPlanetSet())
			{
				for (GameSystem gameSystems2 : gameSystemList)
				{
					if (!gameSystems1.equals(gameSystems2))
						if (gameSystems1.getPlanetSet().contains(planets) && gameSystems2.getPlanetSet().contains(planets))
							throw new PlanetIsInMoreThenOneSystemException();

				}
			}
		}

		for (GameSystem gameSystem : gameSystemList)
		{
			if (gameSystem.getPlanetSet().size() > 3)
				throw new TooManyPlanets();
		}

		return true;
	}
	
	/*
	 * finds all ships belonging to a player
	 */
	public int findAllPlayersShips(Player player)
	{
		List<Ships> sortedShips = new LinkedList<>();
		int numberOfShips = 0;
		for (GameSystem gameSystem : gameSystemList)
		{
			for (Ships ship : gameSystem.getShipsList())
			{
				if (ship.getOwner().equals(player))
				{
					sortedShips.add(ship);
					numberOfShips++;
				}
			}
		}
		sortedShips.sort(new ShipsComparetor());
		for (Ships ship : sortedShips)
			System.out.println(ship.getTypeOfShip());
		return numberOfShips;
	}

	/*
	 * Prints out the players and their faction
	 * sadly it does not print out the ships
     */
	public void PrintGalaxy(Galaxy galaxy)
	{
		try
		{

			StringBuilder writer = new StringBuilder();
			for (Player player : players)
			{
				writer.append(player.getColor() + " " + player.getName() + " (" + player.getRace() + ")\n");
				for (GameSystem gameSystem : gameSystemList)
				{
					for (Planet planet : gameSystem.getPlanetSet())
					{
						if (planet.getOwner().equals(player))
							writer.append("\t" + planet.getName() + "\n");
					}
				}
			}
			Files.write(Paths.get("out/Output/OPG11.txt"), writer.toString().getBytes());
		} catch (Exception e)

		{

			System.out.println("There is something wrong with the printing!");

			e.printStackTrace();
		}

	}
	
	/*
	 * makes a random galaxy with 2 players in it and a random amount of planets in each system
	 * each system will also contain a ship of a random type assigned to a random player
	 */
	public Galaxy makeRandomGalaxy()
	{
		List<String> races = new LinkedList<>(Races.races);
		List<String> colors = new LinkedList<>(Colors.Colors);
		List<String> planets = new LinkedList<>(PlanetNames.planetNames);
		Random random = new Random();
		int j, k, l, m;

		Planet centerPlanet = new Planet("Mecatol Rex", Coordinates.CENTER);

		Set<Planet> centerPlanets = new HashSet<>();
		centerPlanets.add(centerPlanet);

		List<Player> players = new LinkedList<>();
		
		for (int a = 0; a < 2; a++)
		{
			k = random.nextInt(races.size());
			j = random.nextInt(colors.size());
			Player player = new Player("Player " + a, races.get(k), colors.get(j));
			players.add(player);
			races.remove(k);
			colors.remove(j);
		}

		GameSystem gameSystem1 = new GameSystem(Coordinates.CENTER, centerPlanets);
		GameSystem gameSystem2 = new GameSystem(Coordinates.NORTH);
		GameSystem gameSystem3 = new GameSystem(Coordinates.NORTHWEST);
		GameSystem gameSystem4 = new GameSystem(Coordinates.NORTHEAST);
		GameSystem gameSystem5 = new GameSystem(Coordinates.SOUTHWEST);
		GameSystem gameSystem6 = new GameSystem(Coordinates.SOUTHEAST);
		GameSystem gameSystem7 = new GameSystem(Coordinates.SOUTH);

		List<GameSystem> gameSystems = new LinkedList<>();

		gameSystems.add(gameSystem1);
		gameSystems.add(gameSystem2);
		gameSystems.add(gameSystem3);
		gameSystems.add(gameSystem4);
		gameSystems.add(gameSystem5);
		gameSystems.add(gameSystem6);
		gameSystems.add(gameSystem7);

		Galaxy galaxy = new Galaxy(gameSystems, players);
		
		for (GameSystem gameSystem : gameSystems)
		{
			if (!gameSystem.getPlanetSet().contains(centerPlanet))
			{
				for (int i = 0; i < random.nextInt(3); i++)
				{
					j = random.nextInt(planets.size());
					Planet planet = new Planet(planets.get(j), random.nextInt(6), gameSystem.getLocation());
					gameSystem.getPlanetSet().add(planet);
					planets.remove(j);
				}
			}
			l = random.nextInt(4);
			m = random.nextInt(players.size());
			if (l == 0)
			{
				gameSystem.getShipsList().add(new Dreadnought(players.get(m), gameSystem.getLocation()));
			}
			if (l == 1)
			{
				gameSystem.getShipsList().add(new Dreadnought(players.get(m), gameSystem.getLocation()));
			}
			if (l == 2)
			{
				gameSystem.getShipsList().add(new Dreadnought(players.get(m), gameSystem.getLocation()));
			}
			if (l == 3)
			{
				gameSystem.getShipsList().add(new Dreadnought(players.get(m), gameSystem.getLocation()));
			}
		}
	return galaxy;
	}
}

