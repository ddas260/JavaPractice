package accessModifiers.p2;

import accessModifiers.p1.Class1;

public class Access2_2 extends Class1 {

	public static void main(String[] args) {
		Class1 obj1 = new Class1();
		/*The following code will not print the value of the 'var1' attribute because it has the 'default' access modifier 
		and the 'Access2_2' class doesn't belong to the same package*/
//		System.out.println("This is from Class1: "+obj1.var1);
		/*The following code will print the value of the 'var2' attribute because it has the 'public' access modifier*/
		System.out.println("This is from Class1: "+obj1.var2);
		/*The following code will not print the value of the 'var3' attribute because it has the 'protected' access modifier 
		and the 'Access2_2' class is a subclass of 'Class1' but the 'obj1' is a object of the 'Class1' which has the reference of the 'Class1'*/
// 		System.out.println("This is from Class1: "+obj1.var3);
		/*The following code will not print the value of the 'var4' attribute because it has the 'private' access modifier 
		and the 'Access2_2' class is a different class where this attribute is not declared*/
//		System.out.println("This is from Class1: "+obj1.var4);
 		
 		Class1 obj2 = new Access2_2();
 		/*The following code will not print the value of the 'var1' attribute because it has the 'default' access modifier 
		and the 'Access2_2' class doesn't belong to the same package*/
//		System.out.println("This is from Class1: "+obj2.var1);
 		/*The following code will print the value of the 'var2' attribute because it has the 'public' access modifier*/
		System.out.println("This is from Class1: "+obj2.var2);
		/*The following code will not print the value of the 'var3' attribute because it has the 'protected' access modifier 
		and the 'Access2_2' class is a subclass of 'Class1' but the 'obj2' is a object of the 'Access2_2' which has the reference of the 'Class1'*/
//		System.out.println("This is from Class1: "+obj2.var3);
		/*The following code will not print the value of the 'var4' attribute because it has the 'private' access modifier 
		and the 'Access2_2' class is a different class where this attribute is not declared*/
//		System.out.println("This is from Class1: "+obj2.var4);
		
		Access2_2 obj3 = new Access2_2();
		/*The following code will not print the value of the 'var1' attribute because it has the 'default' access modifier 
		and the 'Access2_2' class doesn't belong to the same package*/
//		System.out.println("This is from Class1: "+obj3.var1);
		/*The following code will print the value of the 'var2' attribute because it has the 'public' access modifier*/
		System.out.println("This is from Class1: "+obj3.var2);
		/*The following code will print the value of the 'var3' attribute because it has the 'protected' access modifier 
		and the 'Access2_2' class is a subclass of 'Class1' 
		and also the 'obj3' is a object of the 'Access2_2' which has the reference of the 'Access2_2'*/
		System.out.println("This is from Class1: "+obj3.var3);
		/*The following code will not print the value of the 'var4' attribute because it has the 'private' access modifier 
		and the 'Access2_2' class is a different class where this attribute is not declared*/
//		System.out.println("This is from Class1: "+obj3.var4);

	}

}
