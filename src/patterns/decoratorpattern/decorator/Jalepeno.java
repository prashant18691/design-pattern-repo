package patterns.decoratorpattern.decorator;

import patterns.decoratorpattern.BasePizza;

// IS-A & HAS-A relation with BasePizza
public class Jalepeno extends ToppingDecorator {

    private final BasePizza basePizza;

    public Jalepeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 70;
    }
}
