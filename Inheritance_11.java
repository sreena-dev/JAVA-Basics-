package basics;

//class ParentClass{
//	ParentClass(){
//		System.out.println("I am from ParentClass as Constructor ");
//	}
//	void printAll() {
//		System.out.println("I am from ParentClass ");
//	}
//	void printAllFromThis() {
//		System.out.println("I am from ParentClass this ");
//	}
//}
//
//class ParentClass2{
//	void print(int param1,int param2) {
//		System.out.println("I am from ParentClass 2 ");
//	}
//}
//public class Inheritance_11 extends ParentClass {
//
//	Inheritance_11(){
//		super(); //calls the parent class
//	}
//	
//	void show() {
//		this.printAll();
//	}
//	
//	public static void main(String[] args) {
//		Inheritance_11 obj=new Inheritance_11();
//		obj.show();	
//	}
//}


class Phone implements In1,In2{
	public void in() {
		System.out.println("phone rings from interface ");
	}
	
	public void in2() {
		System.out.println("phone rings from interface 2");
	}
	
	void phone() {
		System.out.println("phone rings");
	}
}
class Inheritance_11 extends Phone{
	public static void main(String[] args) {
		Inheritance_11 obj=new Inheritance_11();
		obj.phone();
		obj.in();
		obj.in2();
		Buttonphone obj2=new Buttonphone();
		System.out.print("phone rings from button class super call -> ");
		obj2.phone();
	}
	
}

class Buttonphone extends Phone{
	 Buttonphone() {
		super();
	}
	
}

interface In1{
	void in();
}

interface In2{
	void in2();
}