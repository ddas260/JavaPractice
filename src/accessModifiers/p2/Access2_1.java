package accessModifiers.p2;

import accessModifiers.p1.Class1;
//import accessModifiers.p1.Class2;

public class Access2_1 {
	public static void main(String[] args) {
		    /*Object creation of the 'Class1' is possible here because this class has the 'public' access modifier*/
			Class1 obj1= new Class1(); 
			/*The following code will not print the value of the 'var1' attribute because it has the 'default' access modifier 
			and the 'Access2_1' class doesn't belong to the same package*/
//			System.out.println("This is from Class1: "+obj1.var1);
			/*The following code will print the value of the 'var2' attribute because it has the 'public' access modifier*/
			System.out.println("This is from Class1: "+obj1.var2);
			/*The following code will not print the value of the 'var3' attribute because it has the 'protected' access modifier 
			and the 'Access2_1' class doesn't belong to the same package or a subclass of 'Class1'*/
//			System.out.println("This is from Class1: "+obj1.var3);
			/*The following code will not print the value of the 'var4' attribute because it has the 'private' access modifier 
			and the 'Access2_1' class is a different class where this attribute is not declared*/
//			System.out.println("This is from Class1: "+obj1.var4);
			
			/*Object creation of the 'Class2' is not possible here because this class has the 'default' access modifier 
			and the 'Access2_1' class doesn't belong to the same package*/
//			Class2 obj2 = new Class2();
	}

}

