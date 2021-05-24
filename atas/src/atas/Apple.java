package atas;

public class Apple extends Fruit 
{
	private String aName;
        
        public Apple(){}
        
	public Apple(String aName) {
		super();
		this.aName = aName;
	}
	
	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}
	
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

}
