package method_overriding;

class Hi extends Hello {
    Hi() {
        System.out.println("Hi constructor");
    }

    // Override the show() method.
    @Override
    void show() {
        System.out.println("Hi method");
    }
}
