package strategy;

public class FlyWithRocket implements FlyBehavior{

    private int speed;

    @Override
    public void fly() {
        System.out.println("fly with Rocket speed " + speed);
    }


}
