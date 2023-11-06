package interfaces.default_method;

public class ImplClass implements MyInterface{

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");
        return str == null ? true : false;
    }

    public static void main(String args[]){
        ImplClass obj = new ImplClass();
        obj.print("");
        obj.isNull("abc");

    }
}
