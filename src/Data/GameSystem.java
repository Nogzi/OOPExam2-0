package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import java.util.*;

public class GameSystem {

    Coordinates location;
    Set<Planet> planetSet = new HashSet<>();
    List<Carrier>carriers = new LinkedList<>();
    List<Cruiser>cruisers = new LinkedList<>();
    List<Destroyer>destroyers = new LinkedList<>();
    List<Dreadnought>dreadnoughts = new LinkedList<>();

    public GameSystem(Coordinates location, Set<Planet> planetSet, List<Carrier> carriers, List<Cruiser> cruisers, List<Destroyer> destroyers, List<Dreadnought> dreadnoughts) {
        this.location = location;
        this.planetSet = planetSet;
        this.carriers = carriers;
        this.cruisers = cruisers;
        this.destroyers = destroyers;
        this.dreadnoughts = dreadnoughts;
    }
<<<<<<< Updated upstream
    
    
    
=======

>>>>>>> Stashed changes
    /*
     * Takes the amount of ships in the system and counts how many ships there are in total
     */
    public int findShips(){
        int amountOfShips = 0;
<<<<<<< Updated upstream
        if () {
            for (Units unit : unitsSet) {
=======
        if (carriers != null) {
            for (Carrier carrier : carriers) {
                amountOfShips++;
            }
        }
        if (cruisers != null) {
            for (Cruiser cruiser : cruisers) {
                amountOfShips++;
            }
        }
        if (destroyers != null) {
            for (Destroyer destroyer : destroyers) {
                amountOfShips++;
            }
        }
        if (dreadnoughts != null) {
            for (Dreadnought dreadnought : dreadnoughts) {
>>>>>>> Stashed changes
                amountOfShips++;
            }
        }
        return amountOfShips;
    }
    public int findPlanets(){
        int amountOfPlanets = 0;
        if (planetSet != null){
            for (Planet planet: planetSet) {
                amountOfPlanets++;
            }
        }else{
            return  amountOfPlanets;
        }

        return amountOfPlanets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameSystem that = (GameSystem) o;
        return location == that.location &&
                Objects.equals(carriers, that.carriers) &&
                Objects.equals(cruisers, that.cruisers) &&
                Objects.equals(destroyers, that.destroyers) &&
                Objects.equals(dreadnoughts, that.dreadnoughts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(location);
    }
}