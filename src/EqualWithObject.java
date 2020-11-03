public class EqualWithObject {

    public static void main(String[] args) {

        Apple a1= new Apple("green");
        Apple a2= new Apple("green");
        Apple a3= new Apple("red");

        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a2));
    }
}
