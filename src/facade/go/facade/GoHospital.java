package facade.go.facade;

import facade.go.subsystem.Eat;
import facade.go.subsystem.Move;
import facade.go.subsystem.Wash;

public class GoHospital {
    Wash wash = new Wash();
    Eat eat = new Eat();
    Move move = new Move();

    public void goToHospital() {
        wash.brushTeeth();
        wash.hair();
        eat.eatFood();
        eat.drinkMilk();
        move.walk();
        move.subway();
    }
}
