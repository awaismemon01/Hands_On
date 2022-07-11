public class CompareReference {

    public static void main(String[] args) {
        CompareReference a = new CompareReference();
        CompareReference b = new CompareReference();
        CompareReference c = a;

        String s1 = "Bob";
        String s2 = "Bob";
        String s3 = "bob";

        System.out.println("Is reference a==b? " + (a==b));
        System.out.println("Is reference a==c? " + (a==c));

        System.out.println("equals() method");
        System.out.println("Is reference a==b? " + a.equals(b));
        System.out.println("Is reference a==c? " + a.equals(c));
        System.out.println("s1 equals to s2 " + s1.equals(s2));
        System.out.println("s1 equals to s3 " + s1.equals(s3));

    }
}