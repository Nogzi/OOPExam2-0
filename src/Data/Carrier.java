package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrier carrier = (Carrier) o;
        return resourceCost == carrier.resourceCost &&
                combatValue == carrier.combatValue &&
                movementSpeed == carrier.movementSpeed &&
                capacity == carrier.capacity &&
                Objects.equals(typeOfShip, carrier.typeOfShip) &&
                Objects.equals(owner, carrier.owner);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeOfShip, resourceCost, combatValue, movementSpeed, capacity, owner);
    }
}
