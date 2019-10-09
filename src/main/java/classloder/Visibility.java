package classloder;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Visibility {

    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();
        m.put(null,"");
        m.put("", null);
        m.put("a", null);
        System.out.println(m);

    }
}
