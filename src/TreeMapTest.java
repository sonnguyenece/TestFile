import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap();
        tm.put("ba12", "shit");
        tm.put("ba12 ", "shit");
        tm.put("a", "shit");
        tm.put("zc", "shit");
        tm.put("a2", "shit");
        tm.put("ma6", "shit");
        tm.put("a17", "shit");
        tm.put("17", "shit");
        tm.put("4", "shit");
        tm.put("4", "shit");

        for (Map.Entry me:
             tm.entrySet()) {
            System.out.println(me);
        }

//        HashSet<String> hs = new HashSet<>();
//        hs.add("shit");
//        HashMap<String,String> hm = new HashMap<>();
//        hm.put("shit","shit");
    }
}
