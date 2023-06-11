package inheritance1;

public class Company {
	String Cname;
	String Loc;
	String Designation;

	Company(){
		//L.I
	}

	Company(String Cn,String L,String D){
		
		Cname=Cn;
		Loc=L;
		Designation=D;
	}

	
}

class Employee extends Company
{
	String name;
	double Sal;
	String Hiredate;

	Employee(){
		//super();
		//L.I
	}

	Employee(String n,double s,String H,String Cname,String Loc,String Designation){

		super(Cname,Loc,Designation);

		name=n;
		Sal=s;
		Hiredate=H;
}

public void Details_Emp(){
	System.out.println("Company name: "+Cname);
	System.out.println("Company Location: "+Loc);
	System.out.println("Designation: "+Designation);
	System.out.println("Employee name: "+name);
	System.out.println("Employee Salary: "+Sal);
	System.out.println("Employee Hiredate: "+Hiredate);

}

}
