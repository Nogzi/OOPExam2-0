/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data.ShipTypes;

import Data.Coordinates;
import Data.Player;
import Data.Ships;

public class Destroyer extends Ships
{
	public Destroyer(Player player, Coordinates location)
	{
		super("Destroyer", player, location, 1, 9, 2, 0);
	}
}
