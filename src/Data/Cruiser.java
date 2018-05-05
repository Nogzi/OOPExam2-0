package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import java.util.Objects;

public class Cruiser implements Units {
    private String typeOfShip = "Cruiser";
    private int resourceCost = 2;
    private int combatValue = 7;
    private int movementSpeed = 2;
    private int capacity = 0;
    private Player owner;
    private Coordinates placement;

    public Cruiser(Player owner, Coordinates placement)
    {
        this.owner = owner;
        this.placement = placement;
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
    
    public Coordinates getPlacement()
    {
        return placement;
    }
    
    public void setPlacement(Coordinates placement)
    {
        this.placement = placement;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cruiser cruiser = (Cruiser) o;
        return resourceCost == cruiser.resourceCost &&
                combatValue == cruiser.combatValue &&
                movementSpeed == cruiser.movementSpeed &&
                capacity == cruiser.capacity &&
                Objects.equals(typeOfShip, cruiser.typeOfShip) &&
                Objects.equals(owner, cruiser.owner);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeOfShip, resourceCost, combatValue, movementSpeed, capacity, owner);
    }
}

