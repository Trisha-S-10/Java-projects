package dice;

public class Dice {
    int max=6;
    int min=1;

    public int diceRoll(){
        double d=(Math.random()*max)+min;
        return (int)d;
    }
}
