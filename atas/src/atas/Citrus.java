package atas;

public class Citrus extends Fruit 
{
	private String cName;
        
        public Citrus(){}

	public Citrus(String cName) {
		super();
		this.cName = cName;
	}
	
	
	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
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
