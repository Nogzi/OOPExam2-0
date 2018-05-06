package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameSystemBuilder {
    private Coordinates newLocation;
    private Set<Planet> newPlanetSet = new HashSet<>();
    private List<Carrier> newCarrierList = new ArrayList<>();
    private List<Cruiser> newCruiserList = new ArrayList<>();
    private List<Destroyer> newDestroyerList = new ArrayList<>();
    private List<Dreadnought> newDreadnoughtList = new ArrayList<>();

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

    public GameSystemBuilder setNewCarrierList(List<Carrier> newCarrierList) {
        this.newCarrierList = newCarrierList;
        return this;
    }

    public GameSystemBuilder setNewCruiserList(List<Cruiser> newCruiserList) {
        this.newCruiserList = newCruiserList;
        return this;
    }

    public GameSystemBuilder setNewDestroyerList(List<Destroyer> newDestroyerList) {
        this.newDestroyerList = newDestroyerList;
        return this;
    }

    public GameSystemBuilder setNewDreadnoughtList(List<Dreadnought> newDreadnoughtList) {
        this.newDreadnoughtList = newDreadnoughtList;
        return this;
    }

    public GameSystem createGameSystem(){
        return new GameSystem(newLocation,newPlanetSet,newCarrierList,newCruiserList,newDestroyerList,newDreadnoughtList);
    }
}
