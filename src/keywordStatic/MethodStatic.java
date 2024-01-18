package keywordStatic;

class Vehicle {
    public static void horn() {
        System.out.println("Beep");
    }
}

public class MethodStatic {
    public static void main(String[ ] args) {
        Vehicle.horn();
    }
}