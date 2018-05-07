package exception;

public class PlanetIsInMoreThenOneSystemException extends Exception
{
	public PlanetIsInMoreThenOneSystemException()
	{
		super("There is a planet that is in more then one system..... weird right?");
	}
	
	
}
