public class Zoo {
    public static void main(String[] args){

        Fish fish1 = new Fish(1, "male", 1.2);
        fish1.swim();
        fish1.eat();
        fish1.sleep();
        fish1.move();

        Chicken chick = new Chicken(1, "female", 2);
        chick.eat();
        chick.move();

        Sparrow spar = new Sparrow(2, "male", 5.3);
        spar.fly();
        spar.move();
    }
}
