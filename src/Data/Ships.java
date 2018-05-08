package Data;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

public abstract class Ships implements Units, Comparable<Ships>{
    protected String typeOfShip;
    protected int resourceCost;
    protected int combatValue;
    protected int movementSpeed;
    protected int capacity;
    protected Coordinates location;
    protected Player owner;

    public Ships(String typeOfShip, Player player, Coordinates location, int resourceCost, int combatValue, int movementSpeed, int capacity) {
        this.typeOfShip = typeOfShip;
        this.owner = player;
        this.location = location;
        this.resourceCost = resourceCost;
        this.combatValue = combatValue;
        this.movementSpeed = movementSpeed;
        this.capacity = capacity;
    }

    @Override
    public String getTypeOfShip() {
        return typeOfShip;
    }

    @Override
    public int getResourceCost() {
        return resourceCost;
    }

    @Override
    public int getCombatValue() {
        return combatValue;
    }

    @Override
    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public Coordinates getLocation() {
        return location;
    }

    @Override
    public Player getOwner() {
        return owner;
    }
    
    @Override
    public int compareTo(Ships o)
    {
        return 0;
    }
}
