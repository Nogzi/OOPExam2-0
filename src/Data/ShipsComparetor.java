package Data;

import java.util.Comparator;

public class ShipsComparetor implements Comparator<Ships>
{
	@Override
	public int compare(Ships o1, Ships o2)
	{
		if (o1.getCombatValue() == o2.getCombatValue()){
			return o2.getResourceCost() - o1.getResourceCost();
		}
		return o1.getCombatValue() - o2.getCombatValue();
	}
}
