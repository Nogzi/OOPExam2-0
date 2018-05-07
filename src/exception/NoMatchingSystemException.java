package exception;

public class NoMatchingSystemException extends Exception
{
	public NoMatchingSystemException()
	{
		super("No matching system at those coordinates");
	}
}
