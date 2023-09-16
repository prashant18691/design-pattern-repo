package patterns.decoratorpattern;

import patterns.decoratorpattern.decorator.ExtraCheese;
import patterns.decoratorpattern.decorator.Jalepeno;
import patterns.decoratorpattern.decorator.Mushroom;

class Main {

     public static void main(String[] args) {
         BasePizza farmhouse = new Farmhouse();
         System.out.println("Cost of farmhouse "+farmhouse.cost());
         BasePizza farmhouseWithMushroom = new Mushroom(farmhouse);
         System.out.println("Cost of farmhouseWithMushroom "+farmhouseWithMushroom.cost());
         BasePizza farmhouseWithMushroomExtraCheeseJalepeno = new Jalepeno(new ExtraCheese(farmhouseWithMushroom));
         System.out.println("Cost of farmhouseWithMushroomExtraCheeseJalepeno "+farmhouseWithMushroomExtraCheeseJalepeno.cost());
     }
}
