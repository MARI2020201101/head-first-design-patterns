package strategy;

public class Duck {

    private String name;
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public void swim(){
        System.out.println("i can swim i am free duck~");

    }
    public void display(){
        System.out.printf("my name is %s %s",name,this.getClass().toString());
    }

    public void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }


}
