package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.ShipTypes.Carrier;
import Data.ShipTypes.Cruiser;
import Data.ShipTypes.Destroyer;
import Data.ShipTypes.Dreadnought;

import java.util.*;

public class GameSystem {

    private Coordinates location;
    private Set<Planet> planetSet = new HashSet<>();
    private List<Ships> shipsList = new LinkedList<>();
    private Player systemOwner = new Player("NoPlayer","NoPlayer", "NoPlayer");

    public GameSystem(Coordinates location, Set<Planet> planetSet, List<Ships> ships) {
        this.location = location;
        this.planetSet = planetSet;
        this.shipsList = ships;
    }
    
    public GameSystem(Coordinates location, Set<Planet> planetSet, List<Ships> shipsList, Player systemOwner)
    {
        this.location = location;
        this.planetSet = planetSet;
        this.shipsList = shipsList;
        this.systemOwner = systemOwner;
    }
    
    public GameSystem(Coordinates location)
    {
        this.location = location;
    }
    
    public GameSystem(Coordinates location, Set<Planet> planetSet)
    {
        this.location = location;
        this.planetSet = planetSet;
    }
    
    public Coordinates getLocation()
    {
        return location;
    }
    
    public Set<Planet> getPlanetSet()
    {
        return planetSet;
    }
    
    public List<Ships> getShipsList()
    {
        return shipsList;
    }
    
    public Player getSystemOwner()
    {
        return systemOwner;
    }
    
    
    /*
     * Takes the amount of ships in the system and counts how many ships there are in total
     */
    public int findShips(){
        int amountOfShips = 0;

        for (Ships ship: shipsList)
        {
            amountOfShips++;
        }

        return amountOfShips;
    }
    public int findPlanets(){
        int amountOfPlanets = 0;
        if (planetSet != null){
            for (Planet planet: planetSet) {
                amountOfPlanets++;
            }
        
        }

        return amountOfPlanets;
    }
    
    public void enterSystem(Ships ship){
        shipsList.add(ship);
        
    }
    
    public void exitSystem(Ships ship){
        shipsList.remove(ship);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameSystem that = (GameSystem) o;
        return location == that.location &&
                Objects.equals(planetSet, that.planetSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(location, planetSet);
    }
}