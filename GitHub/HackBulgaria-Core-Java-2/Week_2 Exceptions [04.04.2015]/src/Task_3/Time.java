package Task_3;

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
		set_hh(hh);
		set_mm(mm);
		set_ss(ss);
		set_dd(dd);
		set_MM(MM);
		set_YY(YY);
	}

	private void set_hh(int hh)
	{
		if(hh < 0 || hh > 23)
		{
			throw new IllegalArgumentException("Invalid hour!");
		}
		this.hh = hh;
	}

	private void set_mm(int mm)
	{
		if(mm < 0 || mm > 59)
		{
			throw new IllegalArgumentException("Invalid minutes!");
		}
		this.mm = mm;
	}

	private void set_ss(int ss)
	{
		if(ss < 0 || ss > 59)
		{
			throw new IllegalArgumentException("Invalid seconds!");
		}
		this.ss = ss;
	}

	private void set_dd(int dd)
	{
		if(dd < 1 || dd > 31)
		{
			throw new IllegalArgumentException("Invalid day!");
		}
		this.dd = dd;
	}

	private void set_MM(int MM)
	{
		if(MM < 1 || MM > 12)
		{
			throw new IllegalArgumentException("Ivalid mounth!");
		}
		this.MM = MM;
	}

	private void set_YY(int YY)
	{
		if(YY < 1)
		{
			throw new IllegalArgumentException("Ivalid year!");
		}
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
