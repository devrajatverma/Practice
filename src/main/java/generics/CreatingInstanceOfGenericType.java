package generics;

import java.util.List;

public class CreatingInstanceOfGenericType<V> {

    private V value;

    public CreatingInstanceOfGenericType(V value) {
        this.value = value;
    }

    public static <V> void append(List<V> list, Class<V> cls){
        V v = null;
        try {
            v = cls.newInstance();
            list.add(v);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
