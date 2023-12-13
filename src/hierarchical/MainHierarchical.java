package hierarchical;

class MainHierarchical {
    public static void main(String[] args) {
        // Create objects of classes B, C, and D.
        B obj1 = new B();
        C obj2 = new C();
        D obj3 = new D();

        // Calling inherited function from the base class.
        obj1.msgA();
        obj2.msgA();
        obj3.msgA();
    }
}
