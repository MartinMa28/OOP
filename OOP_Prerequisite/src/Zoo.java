public class Zoo {
    public static void main(String[] args){
        Animal dog = new Animal(4, "male", 10.6);
        Animal cat = new Animal(3, "female", 8.8);

        dog.eat();

        cat.sleep();

        Fish fish1 = new Fish();
        fish1.swim();
        fish1.eat();
        fish1.sleep();
    }
}
