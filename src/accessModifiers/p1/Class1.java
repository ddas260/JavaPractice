package accessModifiers.p1;

//This 'Class1' is a 'public' class which means it is accessible by any other class in the same or other packages
public class Class1 {
	int var1=4; //This is a 'default' attribute which means this is only accessible for all classes in the same package
	public int var2=4; //This is a 'public' attribute which means this is accessible for all classes in the same or other packages
	protected int var3=4; // This is a 'protected' attribute which means this is accessible for all classes in the same package and subclasses in the same or different packages
	private int var4=4; //This is a 'private' attribute which means this is only accessible within the declared class
	
	
	public int getvar4() {
		return var4;
	}
	public void setlegs4(int var4) {
		this.var4 = var4;
	}
	
	


}
