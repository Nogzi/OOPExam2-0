package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import javax.swing.plaf.basic.BasicTreeUI;

public class Planet {
    private String name;
    private int resourceProduction;
    private Player owner;
    private Coordinates placement;

    public Planet(Player owner, int resourceProduction, String name, Coordinates placement)
    {
        if (resourceProduction < 0 || resourceProduction > 6)
            throw new IllegalArgumentException("you done goofed in the resource production numbers");
        if (name.equals(null))
            throw new NullPointerException("A planet does not have a name");
        this.owner = owner;
        this.resourceProduction = resourceProduction;
        this.name = name;
        this.placement =placement;
    }
    
    public Planet(String name, int resourceProduction, Coordinates placement)
    {
        this.name = name;
        this.resourceProduction = resourceProduction;
        this.placement = placement;
    }
    
    public String getName()
    {
        return name;
    }

    public int getResourceProduction()
    {
        return resourceProduction;
    }

    public Player getOwner()
    {
        return owner;
    }
}
