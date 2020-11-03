import java.util.*;

public class EqualWithObject {

    public static void main(String[] args) {

        Apple a1 = new Apple("green");
        Apple a2 = new Apple("green");
        Apple a3 = new Apple("red");

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a2));
        Set<Apple> setApp = new HashSet<>();
        setApp.add(a1);
        setApp.add(a2);
        setApp.add(a3);

        setApp.forEach(x -> System.out.println("apple color " + x.getColor()));

        System.out.println(a1==a2);


//        for (Apple apple:
//             setApp) {
//            System.out.println(apple.getColor());
//        }

//        Iterator<Apple> it = setApp.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next().getColor());
//        }
    }
}
