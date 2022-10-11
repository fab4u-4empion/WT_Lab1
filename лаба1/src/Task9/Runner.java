package Task9;

public class Runner {
    public static void main(String[] args) {
        System.out.println("\nTask 9:");
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.GREEN, 1));
        basket.addBall(new Ball(Color.RED, 2));
        basket.addBall(new Ball(Color.BLUE, 3));
        basket.addBall(new Ball(Color.ORANGE, 1));
        basket.addBall(new Ball(Color.BLUE, 2));
        basket.addBall(new Ball(Color.GREEN, 3));
        basket.addBall(new Ball(Color.RED, 1));
        System.out.println("Count of blue balls = " + basket.countOfBlueBalls());
        System.out.println("Weight of basket = " + basket.calculateWeight());
        System.out.println("===========");
    }
}
