interface MyInterface {
    int getValue();
}

abstract class MyClass implements MyInterface {
     public int getValue() {
        return 4;
    }
}

public class Outerclass extends MyClass {
    public static void main(String[] args) {
        MyClass puma = new MyClass(){};
        System.out.println(puma.getValue());

    }

//    public int getValue(int length) {
//        return 2;
//    }
}