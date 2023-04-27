package abstractFactory;

public class CheesePizza extends AbstractFactory {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}

 class VeggiePizza extends AbstractFactory {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("pepper");
    }
}
 class PepperoniPizza extends AbstractFactory {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Onion");
        toppings.add("cheese");
    }
}

