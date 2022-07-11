
public class EnumEquals {
    enum Color {RED,BLUE}
    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.BLUE;
        Color c3 = Color.BLUE;

        if(c1==c2){
            System.out.println("==");
        }

        if(c1.equals(c2)){
            System.out.println("dot equals");
        }
        if(c3==c2){
            System.out.println("==");
        }

        if(c3.equals(c2)){
            System.out.println("dot equals");
        }

        for (Color c:
                Color.values()) {
            if(c.equals(Color.BLUE)) break;
            c3=c;
        }
        System.out.println((c1==c3)?"same":"new");
    }
}