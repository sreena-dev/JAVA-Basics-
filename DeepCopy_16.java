package basics;

class CopyConstructor{
	
	int a;
	int b;
	
	CopyConstructor(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	//here is the execution of copy constructor
	//copied to obj
	CopyConstructor(CopyConstructor obj){
		this.a=obj.a;
		this.b=obj.b;
	}
	
	int methodCpy(int a,int b) {
		return a+b;
	}
}

class CallCopy{
	int a;
	CopyConstructor cpy;
	
	//passing the class and obj as param
	CallCopy(CopyConstructor cpy){
		this.cpy=cpy;
	}
	
	//copy as shallow for a and deep for b
	CallCopy(CallCopy obj){
		this.a=obj.a;
		this.cpy=new CopyConstructor(obj.cpy);
	}
	
	int methodCpy(int a,int b) {
		return a*b;
	}
}

class DeepCopy_16{
	public static void main(String[] args) {
		
		CopyConstructor oop=new CopyConstructor(2,3);
		CallCopy oop2=new CallCopy(oop);
		
		System.out.println(oop.methodCpy(2, 4));
		System.out.println(oop2.methodCpy(2, 4));
	}
}