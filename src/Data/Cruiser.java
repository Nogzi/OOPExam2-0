package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

public class Cruiser implements Units {
    private String typeOfShip = "Cruiser";
    private int resourceCost = 2;
    private int combatValue = 7;
    private int movementSpeed = 2;
    private int capacity = 0;
    private Player owner;

    public Cruiser(Player owner)
    {
        this.owner = owner;
    }

    @Override
    public String getTypeOfShip() {
        return typeOfShip;
    }

    @Override
    public int getResourceCost()
    {
        return resourceCost;
    }

    @Override
    public int getCombatValue()
    {
        return combatValue;
    }

    @Override
    public int getMovementSpeed()
    {
        return movementSpeed;
    }

    @Override
    public int getCapacity()
    {
        return capacity;
    }

    @Override
    public Player getOwner()
    {
        return owner;
    }
}

