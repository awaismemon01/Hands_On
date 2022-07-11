package FrogExample;

public interface FrogBoilable {
    static int getCtoF(int ctemp){
        return (ctemp*9/5)+32;
    }
    default String hop(){
        return "hopping";
    }
}
