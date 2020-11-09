import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("shit", "shit4", "shit", "shit1");
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
////        Iterator<String> it = strings.iterator();
//        Iterator<Integer> it = numbers.iterator();
//        while (it.hasNext()) {
//            Integer i = it.next();
//            System.out.println(i);
//            if (i==2) {
//                it.remove();
//            }
//        }
//        System.out.println(numbers);
        System.out.println(strings instanceof List);
        System.out.println(strings.size());
    }
}
