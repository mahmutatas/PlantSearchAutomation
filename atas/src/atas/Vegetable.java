package atas;

public abstract class Vegetable extends Plant implements Eatable
{
	private String weight;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	@Override
	public String chop() 
	{
		return " Chop the vegetable don't bite it! ";
	}
	
	@Override
	public String eat() 
	{
		return " You should eat vegetables cooked. ";
	}
}
