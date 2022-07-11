public class Shadowing {

    static int size = 7;

    //This has a argument variable or local variable which means the copy is created and that copy is shadow variable
    // so the actual size variable is shadowed and is not affected
    static void changeSize(int size){
        size += 200;
        System.out.println("changeSize: " + size);
    }

    // Here the actual size variable is accessed and is changed
    static void changeSize2(){
        size += 200;
        System.out.println("changeSize2: " + size);
    }


    public static void main(String[] args) {
        Shadowing shadowing = new Shadowing();
        System.out.println("Size: " + size);
        changeSize(size);
        System.out.println("Size after change : " + size);
        changeSize2();
        System.out.println("Size after change2 : " + size);
    }
}