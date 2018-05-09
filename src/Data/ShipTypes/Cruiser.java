/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data.ShipTypes;

import Data.Coordinates;
import Data.Player;
import Data.Ships;

public class Cruiser extends Ships
{
	public Cruiser(Player player, Coordinates location)
	{
		super("Cruiser", player, location, 2, 7, 2, 0);
	}
}

