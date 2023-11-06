package interfaces.static_method;

public interface MyInterface {


    default void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
