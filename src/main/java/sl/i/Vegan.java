package sl.i;

public abstract class Vegan extends Animal {

    public final void eat(Food food)  throws IllegalArgumentException {
        Herbal herbal;
        try {
            herbal = (Herbal) food;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(this.getClass().getName() + " can't eat " + food.getClass().getName());
        }

       super.eat(herbal);
    }
}
