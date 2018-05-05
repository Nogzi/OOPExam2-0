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
    private List<Units> newUnitsSet = new ArrayList<>();

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

    public GameSystemBuilder setNewUnitsSet(List<Units> unitsSet) {
        this.newUnitsSet = unitsSet;
        return this;
    }

    public GameSystem createGameSystem(){
        return new GameSystem(newLocation, newPlanetSet, newUnitsSet);
    }
}
