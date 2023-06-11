package inheritance1;

public class Company_driver {
	
	public static void main(String []args) {
		Employee E1=new Employee("Tect",1200,"Kashimr","Java Developer","Dev","01-12-2001");
		Employee E2=new Employee("Spider",5000,"Jammuh","Front-end Developer","Developer","14-12-2003");

		E1.Details_Emp();
		E2.Details_Emp();
	}
	

}
