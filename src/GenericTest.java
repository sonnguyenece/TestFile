import java.util.ArrayList;

public class GenericTest {

    public static <E> void printGeneric(ArrayList<E> arrayList) {
        arrayList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayList<Integer> intergerArr = new ArrayList<>();
        intergerArr.add(1);
        intergerArr.add(2);
        intergerArr.add(3);
        intergerArr.add(4);
        printGeneric(intergerArr);
        System.out.println();

        ArrayList<String> stringArr = new ArrayList<>();
        stringArr.add("a");
        stringArr.add("b");
        stringArr.add("c");
        stringArr.add("d");
        printGeneric(stringArr);
        System.out.println();

        ArrayList<Object> objectArr = new ArrayList<>();
        objectArr.add(1);
        objectArr.add("2");
        objectArr.add("3");
        objectArr.add(4);
        printGeneric(objectArr);


    }

}
