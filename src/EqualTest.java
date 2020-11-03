public class EqualTest {
    public static void main(String[] args) {
        String a="shit";
        String b="shit";
        String c = new String("shit");

        System.out.println(a==b);
        System.out.println(a.equals(c));
    }
}
