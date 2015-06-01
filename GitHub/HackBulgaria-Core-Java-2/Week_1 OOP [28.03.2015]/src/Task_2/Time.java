package Task_2;

import java.util.Calendar;

public class Time
{
	private int hh;
	private int mm;
	private int ss;
	private int dd;
	private int MM;
	private int YY;

	Calendar calendar;

	public Time()
	{
		this.calendar = Calendar.getInstance();
		this.hh = calendar.get(Calendar.HOUR_OF_DAY);
		this.mm = calendar.get(Calendar.MINUTE);
		this.ss = calendar.get(Calendar.SECOND);
		this.dd = calendar.get(Calendar.DAY_OF_MONTH);
		this.MM = calendar.get(Calendar.MONTH) + 1;
		this.YY = calendar.get(Calendar.YEAR);
	}

	public Time(int hh, int mm, int ss, int dd, int MM, int YY)
	{
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
		this.dd = dd;
		this.MM = MM;
		this.YY = YY;
	}

	public static Time timeNow()
	{
		return new Time();
	}

	@Override
	public String toString()
	{
		return String.format("%02d:%02d:%02d %02d.%02d.%04d", this.hh, this.mm, this.ss, this.dd,
				this.MM, this.YY);
	}
}
