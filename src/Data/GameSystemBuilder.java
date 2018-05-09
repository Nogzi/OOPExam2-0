/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class GameSystemBuilder
{
	private Coordinates newLocation;
	private Set<Planet> newPlanetSet = new HashSet<>();
	private List<Ships> newShipsSet = new LinkedList<>();
	private Player newOwner;
	
	
	/*
	 * a gamesystembuilder der bruger builder pattern til at lave gamesystems
	 */
	public GameSystemBuilder()
	{
	}
	
	public GameSystemBuilder setNewLocation(Coordinates location)
	{
		this.newLocation = location;
		return this;
	}
	
	public GameSystemBuilder setNewPlanetSet(Set<Planet> planetSet)
	{
		this.newPlanetSet = planetSet;
		return this;
	}
	
	public GameSystemBuilder setNewShipsSet(List<Ships> shipsSet)
	{
		this.newShipsSet = shipsSet;
		return this;
	}
	
	public GameSystemBuilder setNewOwner(Player player)
	{
		this.newOwner = player;
		return this;
	}
	
	public GameSystem createGameSystem()
	{
		return new GameSystem(newLocation, newPlanetSet, newShipsSet, newOwner);
	}
}
