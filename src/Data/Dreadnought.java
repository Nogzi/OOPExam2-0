package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

public class Dreadnought implements Units {
    private String typeOfShip = "Dreadnought";
    private int resourceCost = 5;
    private int combatValue = 5;
    private int movementSpeed = 1;
    private int capacity = 0;
    private Player owner;

    public Dreadnought(Player owner)
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
