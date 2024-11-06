class ConcreteDecoratorC extends Decorator {
    public ConcreteDecoratorC(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedname();
    }

    private void addedname() {
        System.out.println("Додано ПІБ");
    }
}