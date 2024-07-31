package recensement;

public class Classroom {

	public static void main(String[] args) {
		
		Wilder student1 =new Wilder("Cecile",true);
		System.out.println(student1.whoAmI());
		
		Wilder student2 =new Wilder("Alexia",true);
		System.out.println(student2.whoAmI());
		
		Wilder student3 =new Wilder("Damien",false);
		System.out.println(student3.whoAmI());
		

	}

}
