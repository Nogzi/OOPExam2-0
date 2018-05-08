package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.ShipTypes.Carrier;
import Data.ShipTypes.Cruiser;
import Data.ShipTypes.Destroyer;
import Data.ShipTypes.Dreadnought;

import java.util.*;

public class GameSystemBuilder {
    private Coordinates newLocation;
    private Set<Planet> newPlanetSet = new HashSet<>();
    private List<Ships> newShipsSet = new LinkedList<>();
    private Player newOwner;

    public GameSystemBuilder() {
    }

    public GameSystemBuilder setNewLocation(Coordinates location) {
        this.newLocation = location;
        return this;
    }

    public GameSystemBuilder setNewPlanetSet(Set<Planet> planetSet) {
        this.newPlanetSet = planetSet;
        return this;
    }

    public GameSystemBuilder setNewShipsSet(List<Ships> shipsSet) {
        this.newShipsSet = shipsSet;
        return this;
    }
    
    public GameSystemBuilder setNewOwner(Player player){
        this.newOwner = player;
        return this;
    }

    public GameSystem createGameSystem(){
        return new GameSystem(newLocation,newPlanetSet,newShipsSet,newOwner);
    }
}
