package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import java.util.ArrayList;
import java.util.List;

public class Galaxy {
    List<GameSystem> gameSystemList = new ArrayList<>();
    private int amountOfSystems = 0;
    private int amountOfShips = 0;
    private int amountOfPlanets = 0;
    
    public void findSystemsInGalaxy() {
        amountOfSystems += gameSystemList.size();
        System.out.println("There is " + amountOfSystems + " systems in the galaxy");
    }
    public void findShipsInGalaxy(){
        for (GameSystem gameSystem: gameSystemList) {
            amountOfShips += gameSystem.findShips();
        }
        System.out.println("There is " + amountOfShips + " in the galaxy");
    }
    public void findPlanetsInGalaxy(){

    }
}
