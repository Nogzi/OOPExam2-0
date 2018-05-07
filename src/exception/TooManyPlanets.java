package exception;

public class TooManyPlanets extends Exception
{
	public TooManyPlanets()
	{
		super("system no handle this many planets at one time");
	}
}
