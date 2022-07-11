public class UnderscoreNumerics {

    public static void main(String[] args) {

        int i = 1_00_000;
        int b = 0b10_10_10;
        int o = 010;
        int h = 0xDEAdCAFE;
        long hl = 0xDEADCAFEl;
        char d = '\n';
        char def = '\u0000';
        String s = null;
        String a = "";

        System.out.println(i+10_00_00);
        System.out.println(b);
        System.out.println(o);
        System.out.println(h + d + hl);
        System.out.println(hl);
        System.out.println(def);
//        s.toLowerCase();
//        a.toLowerCase();

    }
}