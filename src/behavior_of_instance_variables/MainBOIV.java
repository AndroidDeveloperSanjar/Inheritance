package behavior_of_instance_variables;

class MainBOIV {
    public static void main(String[] args) {
        // Create an object of class Q and call the instance variable using reference variable q.
        Q q = new Q();
        System.out.println("Value of a: " + q.a); // 'a' of Q is called.

        // Declare superclass reference is equal to the child class object.
        P p = new Q();
        System.out.println("Value of a: " + p.a); // 'a' of P is called.
    }
}
