package keywordStatic;

 class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}

public class AttributeStatic {
    public static void main(String[ ] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.COUNT);
    }
}