package method_overriding;

class Hello {
    // Declare an instance block.
    {
        show();
    }

    Hello() {
        System.out.println("Hello constructor");
        show();
    }

    void show() {
        System.out.println("Hello method");
    }
}
