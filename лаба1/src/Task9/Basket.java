package Task9;

import java.util.ArrayList;

public class Basket {
    ArrayList<Ball> content;

    public Basket() {
        this.content = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        content.add(ball);
    }

    public int countOfBlueBalls() {
        return (int) content.stream().filter(ball -> ball.getColor() == Color.BLUE).count();
    }

    public double calculateWeight() {
        return content.stream().reduce(0.0, (x, y) -> x + y.getWeight(), Double::sum);
    }
}
