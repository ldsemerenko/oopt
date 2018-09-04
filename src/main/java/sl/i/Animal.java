package sl.i;

public abstract class Animal extends Meat {

    public void eat(Food food) throws IllegalArgumentException {
        if (this.equals(food)) {
            throw new IllegalArgumentException("Animal can't eat itself");
        }

        System.out.println(this.getClass().getName() + " eating " + food.getClass().getName());
    }

}
