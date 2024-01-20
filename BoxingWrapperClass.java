public class BoxingWrapperClass {
    public static void main(String[] args) {
        //boxing
        int a=7;
        System.out.println("primitive type - BOXING : "+a);

        //autoboxing
        Integer num=a;
        //Integer num2= new Integer(90);
        System.out.println("AUTOBOXING METHOD 1 : "+num);  
        System.out.println("AUTOBOXING TYPE : "+num.getClass());  
        //System.out.println("AUTOBOXING METHOD 2 : "+ num2);

        //unboxing
        a=num;
        System.out.println("UNBOXING : "+ a); 
    }
}
