package Data.ShipTypes;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.Coordinates;
import Data.Player;
import Data.Ships;
import Data.Units;

public class Carrier extends Ships {
    public Carrier(Player player, Coordinates location) {
        super("Carrier", player, location,3,9,1,6);
    }
}
