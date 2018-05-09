/*
 *Felix Cho Petersen
 * fcpe17@student.aau.dk
 */
package Data;

import java.util.Objects;

public class Player
{
	private String Name;
	private String Race;
	private String color;

	public Player(String name, String race, String color)
	{
		Name = name;
		Race = race;
		this.color = color;
	}

	public String getName()
	{
		return Name;
	}

	public String getRace()
	{
		return Race;
	}

	public String getColor()
	{
		return color;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Player player = (Player) o;
		return Objects.equals(Name, player.Name) &&
				Objects.equals(Race, player.Race) &&
				Objects.equals(color, player.color);
	}

	@Override
	public int hashCode()
	{

		return Objects.hash(Name, Race, color);
	}

	@Override
	public String toString()

	{
		return "Player{" +
				"Name='" + Name + '\'' +
				", Race='" + Race + '\'' +
				", color=" + color +
				'}';
	}
}