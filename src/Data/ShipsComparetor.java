/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

import java.util.Comparator;

public class ShipsComparetor implements Comparator<Ships>
{
	/*
	 * sorts the ships by combat values so lowest is first
	 * if the ships have same combat values it sorts by resource cost with the most expensive is firsk
	 */
	@Override
	public int compare(Ships o1, Ships o2)
	{
		if (o1.getCombatValue() == o2.getCombatValue())
		{
			return o2.getResourceCost() - o1.getResourceCost();
		}
		return o1.getCombatValue() - o2.getCombatValue();
	}
}
