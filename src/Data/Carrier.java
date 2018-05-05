package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

public class Carrier implements Units {
    private String typeOfShip = "Carrier";
    private int resourceCost = 3;
    private int combatValue = 9;
    private int movementSpeed = 1;
    private int capacity = 6;
    private Player owner;

    public Carrier(Player owner)
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
