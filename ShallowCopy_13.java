package basics;

class NewClass{
	int val1;
	int val2;
	NewClass(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
	}
	
	//method 2 of shallow copy
	NewClass(NewClass object){
		this.val1=object.val1;
		this.val2=object.val2;
		
	}
	void shallowCopy() {
		System.out.println("This is a method from another class");
		System.out.println("sum from new class = "+ (val1+val2));
	}
	
	void shallowCopy2() {
		System.out.println("This is a method from another class");
		System.out.println("sum from new class = "+ (val1*val2));
	}
	
	void shallowCopy3() {
		System.out.println("This is a method from another class");
		System.out.println("sum from new class = "+ (val1/val2));
	}
}
public class ShallowCopy_13 {

	public static void main(String[] args) {
		NewClass obj=new NewClass(4,5);
		obj.shallowCopy();	
		
		//using copy constructor as the parameter
		NewClass copy=new NewClass(obj.val1,obj.val2);
		copy.shallowCopy();
		
		NewClass copyObj=new NewClass(obj);
		copyObj.shallowCopy();
		
		
		obj.shallowCopy();

	}
}
