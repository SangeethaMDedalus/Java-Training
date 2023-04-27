package abstractFactory;

public class PizzaStore {
	 SimplePizzaFactory factory;

	    public PizzaStore(SimplePizzaFactory factory) {
	        this.factory = factory;
	    }

	    public AbstractFactory orderPizza(String type) {
	    	AbstractFactory pizza;

	        pizza = factory.createPizza(type);

	        pizza.prepare();
	        pizza.bake();
	        pizza.slice();
	        pizza.box();

	        return pizza;
	    }
}
