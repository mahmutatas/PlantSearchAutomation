package atas;

public class DayHr 
{
	private String day;
	private String hour;
	private String duration;

	public DayHr()
	{
		day = " Monday ";
		hour = " 10 am ";
		duration = " 1 hour ";
	}
	public DayHr(String day, String hour, String duration) {
		super();
		this.day = day;
		this.hour = hour;
		this.duration = duration;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
