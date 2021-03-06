package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredientFactory.IngredientFactory;

/**
 * Created with IntelliJ IDEA
 */
public class CheesePizza extends Pizza {
    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setCheese(ingredientFactory.makeCheese());
        setSauce(ingredientFactory.makeSauce());
    }

    @Override
    public void finish() {
        System.out.println("芝士披萨完成！\n");
    }
}
