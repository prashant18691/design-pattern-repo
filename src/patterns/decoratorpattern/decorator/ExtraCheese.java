package patterns.decoratorpattern.decorator;

import patterns.decoratorpattern.BasePizza;

// IS-A & HAS-A relation with BasePizza
public class ExtraCheese extends ToppingDecorator{

    private final BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
