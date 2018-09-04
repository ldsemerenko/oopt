package sl.i;

public abstract class Predator extends Animal{

    public final void eat(Food food)  throws IllegalArgumentException {
        Meat meat;
        try {
            meat = (Meat) food;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(this.getClass().getName() + " can't eat " + food.getClass().getName());
        }

        super.eat(meat);
    }
}
