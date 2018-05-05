package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import java.util.*;

public class GameSystem {

    Coordinates location;
    Set<Planet> planetSet = new HashSet<>();
    List<Units> unitsSet = new ArrayList<>();

    public GameSystem(Coordinates location, Set<Planet> planetSet, List<Units> unitsSet) {
        this.location = location;
        this.planetSet = planetSet;
        this.unitsSet = unitsSet;
    }
    /*
     * Takes the amount of ships in the system and counts how many ships there are in total
     */
    public int findShips(){
        int amountOfShips = 0;

        for (Units unit: unitsSet)
        {
            amountOfShips++;
        }

        return amountOfShips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameSystem that = (GameSystem) o;
        return location == that.location &&
                Objects.equals(planetSet, that.planetSet) &&
                Objects.equals(unitsSet, that.unitsSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(location, planetSet, unitsSet);
    }
}