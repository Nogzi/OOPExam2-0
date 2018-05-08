import Data.Galaxy;
import Data.Ships;
import Data.ShipsComparetor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Ships> list = new ArrayList<>();
        
        list.sort(new ShipsComparetor());
    }
}
