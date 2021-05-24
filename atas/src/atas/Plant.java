package atas;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class Plant
{
	private String color;
	private String day;
	private String hour;
	private String duration;
	
	DayHr dayHr = new DayHr(day,hour,duration);
	
	ArrayList<DayHr> arrList = new ArrayList<DayHr>();

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public void setWatered(String day, String hour, String duration)
	{
		arrList.add(dayHr);
	}

	public ArrayList<DayHr> getWatered()
	{
		Iterator<DayHr> itr=arrList.iterator();  

		while(itr.hasNext())
		{  
                    DayHr dayHr=(DayHr)itr.next();  
		    System.out.println(dayHr.getDay()+" "+dayHr.getHour()+" "+dayHr.getDuration());  
		}  
                return arrList;
	}
	
	
	
	
}
