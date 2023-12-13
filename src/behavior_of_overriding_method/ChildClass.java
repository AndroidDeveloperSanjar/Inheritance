package behavior_of_overriding_method;

class ChildClass extends BaseClass {
    int x = 50;
    int y = 100;

    // Overriding method.
    @Override
    void msg() {
        System.out.println("Child class first method");
    }

    void msg2() {
        System.out.println("Child class second method");
    }
}
