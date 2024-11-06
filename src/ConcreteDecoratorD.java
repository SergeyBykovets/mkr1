class ConcreteDecoratorD extends Decorator {
    public ConcreteDecoratorD(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedsize();
    }

    private void addedsize() {
        System.out.println("Повідомлення стиснуто");
    }
}