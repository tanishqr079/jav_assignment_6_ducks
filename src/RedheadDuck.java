public class RedheadDuck extends Duck {
    public RedheadDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new Fly();
    }


    @Override
    public void display() {
        System.out.println("i am a redhead duck.......");
    }
}
