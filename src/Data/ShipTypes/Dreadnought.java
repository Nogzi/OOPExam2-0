/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data.ShipTypes;

import Data.Coordinates;
import Data.Player;
import Data.Ships;

public class Dreadnought extends Ships
{
	public Dreadnought(Player player, Coordinates location)
	{
		super("Dreadnought", player, location, 5, 5, 1, 0);
	}
}
