package InstanceOfComparison;

public class B extends A{
    public static void main(String[] args) {
        A myA = new B();
        m2(myA);
    }

    public static void m2(A a) {
        if(a instanceof B){
            ((B) a).doStuff();
        }
    }

    public static void doStuff(){
        System.out.println("'a' refers to B");
    }
}
