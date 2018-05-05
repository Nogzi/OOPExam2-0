package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import javax.swing.plaf.basic.BasicTreeUI;

public class Planet {
    private String name;
    private int resourceProduction;
    private Player owner;

    public Planet(Player owner, int resourceProduction, String name)
    {
        if (resourceProduction < 0 || resourceProduction > 6)
            throw new IllegalArgumentException("you done goofed in the resource production numbers");
        if (name.equals(null))
            throw new NullPointerException("A planet does not have a name");
        this.owner = owner;
        this.resourceProduction = resourceProduction;
        this.name = name;
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
