package location;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Locator {

    public Location getLocation(String ip) {
        Location l = null;
        try {
            URL oracle = new URL("https://ipfind.co/?ip=" + ip);
            URLConnection yc = oracle.openConnection();
            l = new Gson().fromJson(new InputStreamReader(
                    yc.getInputStream()), Location.class);
            if(l.getCity() == null && l.getCountry() == null){
                l.setValid(false);
            }else{
                l.setValid(true);
            }
        } catch (Exception e) {
            l.setValid(false);
            e.printStackTrace();
        } finally {
            return l;
        }
    }

    public static void main(String[] args) {
        Locator l = new Locator();
        String a[] = new String[]{"157.240.23.35", "172.217.166.110", "151.101.1.69", "188.166.244.42"
                , "223.165.26.161","1.2.3.4"};
        for (String s : a) {
            Location location = l.getLocation(s);
            System.out.println(location.toString());
        }
    }
}
