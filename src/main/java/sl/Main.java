package sl;

import sl.i.Herbal;
import sl.i.Predator;
import sl.i.Vegan;
import sl.m.Cow;
import sl.m.Goat;
import sl.m.Grass;
import sl.m.King;

class Main{
public static void main(String[]args){
    Predator king = new King();
    Predator king2 = new King();

    Herbal grass = new Grass();

    Vegan cow = new Cow();
    Vegan goat = new Goat();

    king.eat(king2);
    cow.eat(grass);
    goat.eat(grass);

    goat.eat(king);

    king.eat(king);
    }
}