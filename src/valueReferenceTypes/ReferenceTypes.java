package valueReferenceTypes;

public class ReferenceTypes {

	public static void main(String[ ] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        System.out.println(j.getAge());
        celebrateBirthday(j);
        System.out.println(j.getAge());
        celebrateBirthday(j);
        System.out.println(j.getAge());
  }
    
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}

class Person {
    private String name;
    private int age;
    
    Person (String n) {
        this.name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        this.age = a;
    }
}
