package Data.ShipTypes;/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */

import Data.Coordinates;
import Data.Player;
import Data.Ships;
import Data.Units;

public class Dreadnought extends Ships {
    public Dreadnought(Player player, Coordinates location){
        super("Dreadnought",player,location,5,5,1,0);
    }
}
