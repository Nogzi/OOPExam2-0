/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data.ShipTypes;

import Data.Coordinates;
import Data.Player;
import Data.Ships;

public class Carrier extends Ships
{
	public Carrier(Player player, Coordinates location)
	{
		super("Carrier", player, location, 3, 9, 1, 6);
	}
}
