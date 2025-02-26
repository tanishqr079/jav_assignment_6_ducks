public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("i am mallard duck.....");
    }
}
