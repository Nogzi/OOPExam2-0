package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import java.util.*;

public class Galaxy {
    List<GameSystem> gameSystemList = new ArrayList<>();
    private int amountOfSystems = 0;
    private int amountOfShips = 0;
    private int amountOfPlanets = 0;
    
    public Galaxy(List<GameSystem> gameSystemList)
    {
        this.gameSystemList = gameSystemList;
    }
    
    public int findSystemsInGalaxy() {
        amountOfSystems += gameSystemList.size();
        System.out.println("There is " + amountOfSystems + " systems in the galaxy");
        return amountOfSystems;
    }
    public int findShipsInGalaxy(){
        for (GameSystem gameSystem: gameSystemList) {
            amountOfShips += gameSystem.findShips();
        }
        System.out.println("There is " + amountOfShips + " units in the galaxy");
        return amountOfShips;
    }
    public int findPlanetsInGalaxy(){
        for (GameSystem gameSystem:gameSystemList)
        {
            amountOfPlanets+= gameSystem.findPlanets();
        }
        System.out.println("There is " + amountOfPlanets + " planets in the galaxy");
        return amountOfPlanets;
    }
    public void makeDefaultGalaxy(){
        Random random = new Random();
        Player player1 = new Player("Felix", "Human", "Blue");
        Player player2 = new Player("Simon", "Treehugger", "Red");
        
        Planet planet1 = new Planet(player1,random.nextInt(6), "Mecatol Rex", Coordinates.CENTER);
        Planet planet2 = new Planet(player2, random.nextInt(6), "Vega Major", Coordinates.NORTH);
        Planet planet3 = new Planet(player2, random.nextInt(6), "Vega Minor", Coordinates.NORTH);
        Planet planet4 = new Planet("Industrex",random.nextInt(6), Coordinates.SOUTHEAST);
        Planet planet5 = new Planet("Rigel 1", random.nextInt(6), Coordinates.SOUTH);
        Planet planet6 = new Planet("Rigel 2", random.nextInt(6), Coordinates.SOUTH);
        Planet planet7 = new Planet("Mirage", random.nextInt(6), Coordinates.NORTHWEST);
        
        Dreadnought dreadnought1 = new Dreadnought(player1);
        Dreadnought dreadnought2 = new Dreadnought(player1);
        Destroyer destroyer1 = new Destroyer(player1);
        Cruiser cruiser1 = new Cruiser(player2);
        Cruiser cruiser2 = new Cruiser(player2);
        Carrier carrier1 = new Carrier(player2);
        
        List<Dreadnought> dreadnoughts = new LinkedList<>();
        List<Destroyer> destroyers = new LinkedList<>();
        List<Cruiser> cruisers = new LinkedList<>();
        List<Carrier> carriers = new LinkedList<>();
        
        dreadnoughts.add(dreadnought1);
        dreadnoughts.add(dreadnought2);
        destroyers.add(destroyer1);
        cruisers.add(cruiser1);
        cruisers.add(cruiser2);
        carriers.add(carrier1);

        Set<Planet>planets1 = new HashSet<>();
        Set<Planet>planets2 = new HashSet<>();
        Set<Planet>planets3 = new HashSet<>();
        Set<Planet>planets4 = new HashSet<>();
        Set<Planet>planets5 = new HashSet<>();

        planets1.add(planet1);
        planets2.add(planet2);
        planets2.add(planet3);
        planets3.add(planet4);
        planets4.add(planet5);
        planets4.add(planet6);
        planets5.add(planet7);
        
        GameSystemBuilder system1 = new GameSystemBuilder();
        system1.setNewDreadnoughtList(dreadnoughts)
                .setNewDestroyerList(destroyers)
                .setNewLocation(Coordinates.CENTER)
                .setNewPlanetSet(planets1);
        
    }
}
