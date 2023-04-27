package abstractFactory;
import java.util.ArrayList;
	
abstract public class AbstractFactory {
	    String name;
	    String dough;
	    String sauce;
	    ArrayList toppings = new ArrayList();

	    public String getName() {
	        return name;
	    }

	    public void prepare() {
	        System.out.println("Preparing " + name);
	    }

	    public void bake() {
	        System.out.println("Baking " + name);
	    }

	    public void slice() {
	        System.out.println("Slicing " + name);
	    }

	    public void box() {
	        System.out.println("Boxing " + name);
	    }

	    public String toString() {
	        StringBuffer display = new StringBuffer();
	        display.append("---- " + name + " ----\n");
	        display.append(dough + "\n");
	        display.append(sauce + "\n");
	        for (int i = 0; i < toppings.size(); i++) {
	            display.append((String) toppings.get(i) + "\n");
	        }
	        return display.toString();
	    }
	}
	


