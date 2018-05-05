package Data;

public interface Units {
    String getTypeOfShip();
    int getResourceCost();
    int getCombatValue();
    int getMovementSpeed();
    int getCapacity();
    Player getOwner();
    Coordinates getPlacement();
}