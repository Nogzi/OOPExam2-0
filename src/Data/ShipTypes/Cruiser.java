package Data.ShipTypes;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.Coordinates;
import Data.Player;
import Data.Ships;
import Data.Units;

public class Cruiser extends Ships {
    public Cruiser(Player player, Coordinates location){
        super("Cruiser",player,location,2,7,2,0);
    }
}

