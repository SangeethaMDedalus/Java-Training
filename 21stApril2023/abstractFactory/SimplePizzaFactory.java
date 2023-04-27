package abstractFactory;

public class SimplePizzaFactory {
    public AbstractFactory createPizza(String type) {
    	AbstractFactory pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        System.out.println(pizza);
        return pizza;
    }

}