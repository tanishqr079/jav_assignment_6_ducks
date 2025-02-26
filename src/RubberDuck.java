public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehaviour = new Squeak();
        swimBehaviour = new Floatting();
        flyBehaviour = new CannotFly();
    }


    @Override
    public void display() {
        System.out.println("i am rubber Duck ......");
    }
}
