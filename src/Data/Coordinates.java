/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

public enum Coordinates
{
	/*
	 * the different cooridinates and a future proofing for when the coordinates are not hardcoded
	 */
	NORTH(0, 1, -1),
	NORTHEAST(1, 0, -1),
	NORTHWEST(-1, 1, 0),
	SOUTH(0, -1, 1),
	SOUTHEAST(1, -1, 0),
	SOUTHWEST(-1, 0, 1),
	CENTER(0, 0, 0);
	
	private int x;
	private int y;
	private int z;
	
	Coordinates(int x, int y, int z)
	{
		if (x + y + z != 0)
			throw new IllegalArgumentException("you done goofed in coordinates");
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getZ()
	{
		return z;
	}
	
	
}
