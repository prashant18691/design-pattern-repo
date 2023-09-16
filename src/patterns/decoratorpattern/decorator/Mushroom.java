package patterns.decoratorpattern.decorator;

import patterns.decoratorpattern.BasePizza;

// IS-A & HAS-A relation with BasePizza
public class Mushroom extends ToppingDecorator {

    private final BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
