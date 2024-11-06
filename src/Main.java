public class Main {
    public static void main(String[] args) {

        Component message = new ConcreteComponent();

        Component one  = new ConcreteDecoratorA(message);

        Component two = new ConcreteDecoratorD(one);

        Component three = new ConcreteDecoratorB(two);

        Component four = new ConcreteDecoratorC(three);

        four.operation();
    }
}
