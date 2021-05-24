package atas;

public class Flower extends Plant
{
	enum Intensity {
		veryWeak, weak, middle, strong, veryStrong; 		
	}
	private String name;
	private Intensity smell;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Intensity getSmell() 
        {
            switch (smell)
            {
                case veryWeak:
                    System.out.println("Intensity is  very Weak. ");
                    break;
                case weak:
                    System.out.println("Intensity is Weak. ");
                    break;
                case middle:
                    System.out.println("Intensity is Middle. ");
                    break;
                case strong:
                    System.out.println("Intensity is Strong. ");
                    break;
                case veryStrong:
                    System.out.println("Intensity is very Strong. ");
                    break;
                default:
                    System.out.println("Undefined data!! ");
                    break;
            }
                    
		return smell;
	}
	public void setSmell(Intensity smell) {
		this.smell = smell;
	}
        
        @Override
        public void setWatered(String day, String hour, String duration)
	{
            System.out.println("Scheduled a plan for Flower.");
	}
}
