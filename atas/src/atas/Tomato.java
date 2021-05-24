package atas;

import java.util.ArrayList;
import java.util.Iterator;

public class Tomato extends Vegetable
{
	private String kind;

        
	ArrayList<DayHr> arrList = new ArrayList<DayHr>();
	
	public Tomato() {}
        
	public Tomato(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public void prouducts() 
	{
		ArrayList<String> productsKind = new ArrayList<String>();
		productsKind.add("Tomato Soup");
		productsKind.add("Tomato Paste");
		productsKind.add("Ketchup");
		
		System.out.println(productsKind);
	}

	@Override
	public void setWatered(String day, String hour, String duration)
	{		
		System.out.println("Scheduled a plan for Tomato");
                DayHr dayHr2 = new DayHr("Monday","9.00 am","30 min");
		DayHr dayHr3 = new DayHr("Wednesday","9.00 am","30 min");
		DayHr dayHr4 = new DayHr("Friday","9.00 am","30 min");
		
                DayHr dayHr = new DayHr(day, hour, duration);
                arrList.add(dayHr);
		arrList.add(dayHr2);
		arrList.add(dayHr3);
		arrList.add(dayHr4);
	}


	@Override
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
