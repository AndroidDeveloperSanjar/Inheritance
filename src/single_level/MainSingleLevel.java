package single_level;

public class MainSingleLevel {
    public static void main(String[] args) {
        // Create an object of class B.
        B obj = new B();
        obj.methodA(); // methodA() of B will be called because by default, it is available in B.
        obj.methodB(); // methodB() of B will be called.
    }
}
