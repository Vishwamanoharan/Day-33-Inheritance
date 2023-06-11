package inheritance1;

public class Fruit {
	//States
	String Origin;
	double Price;
	//Constructor
	Fruit(){
		//LI
	}
	Fruit(String Origin,double Price){
		
		this.Origin=Origin;
		this.Price=Price;
		
	}

}
class Apple extends Fruit{
	//states
	String Name,Color,Taste;
	
	Apple()
	{
		
		//LI
	}
	Apple(String Name,String Color,String Taste,String Or,double Pr){
		super(Or,Pr);
		//LI
		this.Name=Name;
		this.Color=Color;
		this.Taste=Taste;
		
	}
	
	public void Details_Of_Apple() {
		System.out.println("Name Of Fruit: "+Name);
		System.out.println("Origin Of Fruit: "+Origin);
		System.out.println("Color Of Fruit: "+Color);
		System.out.println("Price Of Fruit: "+Price);
		System.out.println("Taste Of Fruit: "+Taste);
	}
	
	
	
	
	
	}
