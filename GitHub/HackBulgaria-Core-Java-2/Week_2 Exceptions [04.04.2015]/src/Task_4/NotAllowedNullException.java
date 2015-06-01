package Task_4;

public class NotAllowedNullException extends IllegalArgumentException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String EXCEPTION = "Is not allowed to insert NULL as a key!";
	private static String msg;

	public NotAllowedNullException()
	{
		this(EXCEPTION);
	}

	public NotAllowedNullException(String msg)
	{
		NotAllowedNullException.msg = msg;
	}

	@Override
	public String getMessage()
	{
		return NotAllowedNullException.msg;
	}
}
