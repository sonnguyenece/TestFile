public interface InterfaceTestClass {
    void shit();

    default void test() {
        int a=0;
        int b=1;
        System.out.println(a+b);
    }
}
