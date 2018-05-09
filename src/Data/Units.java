/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

public interface Units
{
	String getTypeOfShip();
	
	int getResourceCost();
	
	int getCombatValue();
	
	int getMovementSpeed();
	
	int getCapacity();
	
	Player getOwner();
	
	Coordinates getLocation();
}