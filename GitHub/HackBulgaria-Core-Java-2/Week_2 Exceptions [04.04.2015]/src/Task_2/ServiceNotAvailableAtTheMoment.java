package Task_2;

public class ServiceNotAvailableAtTheMoment extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String msg = "Service Not Available At The Moment! Try again later!";

	public ServiceNotAvailableAtTheMoment()
	{
		this(msg);
	}

	public ServiceNotAvailableAtTheMoment(String msg)
	{
		ServiceNotAvailableAtTheMoment.msg = msg;
	}

	@Override
	public String getMessage()
	{
		return ServiceNotAvailableAtTheMoment.msg;
	}
}
