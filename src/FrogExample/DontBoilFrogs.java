package FrogExample;

public class DontBoilFrogs implements FrogBoilable{
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }

    void go(){
        System.out.println(hop());

        //Wrong way to call static method
        //System.out.println(getCtoF(100));
        System.out.println(FrogBoilable.getCtoF(100));
        DontBoilFrogs dbf = new DontBoilFrogs();

        //Can not call static method by instance
        //System.out.println(dbf.getCtoF(100));
    }
}
