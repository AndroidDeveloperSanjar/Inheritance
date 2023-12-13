package multi_level;

class MainMultiLevel {
    public static void main(String[] args) {
        Z z = new Z();
        z.methodX(); // Calling X grand class method.
        z.methodY(); // Calling Y parent class method.
        z.methodZ(); // Calling Z class local method.
    }
}
