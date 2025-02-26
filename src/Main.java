//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RedheadDuck rhd = new RedheadDuck();
        System.out.println("--------------");
        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        rhd.performFly();
        System.out.println("--------------");

        RubberDuck rd = new RubberDuck();
        System.out.println("--------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("--------------");

        MallardDuck md = new MallardDuck();
        System.out.println("--------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("--------------");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}