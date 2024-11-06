class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedState();
    }

    private void addedState() {
        System.out.println("Додано дату та час");
    }
}