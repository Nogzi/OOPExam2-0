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

    Coordinates location;
    Set<Planet> planetSet = new HashSet<>();
    List<Ships> shipsList = new LinkedList<>();

    public GameSystem(Coordinates location, Set<Planet> planetSet, List<Ships> ships) {
        this.location = location;
        this.planetSet = planetSet;
        this.shipsList = ships;
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