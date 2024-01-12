// import Inheritance_Example.classB;
// import Inheritance_Example.classC;
// import Inheritance_Example.classD;
import Inheritance_Example.*;
//I HAVE CREATED PACKAGES HERE

public class another_inheritance 
{
	public static void main(String[] args)
	{
		classB obj_B = new classB();
		obj_B.print_A();
		obj_B.print_B();

		classC obj_C = new classC();
		obj_C.print_A();
		obj_C.print_C();

		classD obj_D = new classD();
		obj_D.print_A();
		obj_D.print_D();
	}
}