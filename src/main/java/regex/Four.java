package regex;

import java.util.regex.*;

public class Four {
    public static void main(String[] args) {

    }

    @Override
    public String toString(){
        return "Parent";
    }
}

class ChildFour extends Four{


    void mA(){
        System.out.println("Child");
    }
}
