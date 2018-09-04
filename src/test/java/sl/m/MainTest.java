package sl.m;

import org.junit.Test;
import sl.i.*;

public class MainTest {

    @Test(expected = IllegalArgumentException.class)
    public void eatSelf() {
        Predator king = new King();
        king.eat(king);
    }

    @Test(expected = IllegalArgumentException.class)
    public void predatorEatGrass() {
        Animal king = new King();
        Food grass = new Grass();
        king.eat(grass);
    }

    @Test(expected = IllegalArgumentException.class)
    public void VeganEatMeat() {
        Animal cow = new Cow();
        Food goat = new Goat();
        cow.eat(goat);
    }

    @Test
    public void success() {
        Animal king = new King();

        Food grass = new Grass();

        Animal cow = new Cow();
        Animal goat = new Goat();

        cow.eat(grass);
        goat.eat(grass);
        king.eat(cow);
    }
}