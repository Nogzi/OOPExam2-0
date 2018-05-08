package Data;

public class PlanetBuilder
{
	private Player newOwner;
	private Coordinates newLocation;
	private int newResourceProduction;
	private String newName;
	
	public PlanetBuilder()
	{
	}
	
	public PlanetBuilder setNewOwner(Player player){
		this.newOwner = player;
		return this;
	}
	
	public PlanetBuilder setNewLocation(Coordinates location){
		this.newLocation = location;
		return this;
	}
	
	public PlanetBuilder setNewResourceProduction(int resourceProduction){
		this.newResourceProduction = resourceProduction;
		return this;
	}
	
	public PlanetBuilder setNewName(String name){
		this.newName = name;
		return this;
	}
	
	public Planet createPlanet(){
		return new Planet(newOwner,newResourceProduction,newName,newLocation);
	}
}
