public class Bird extends Animal {
    public Bird(int age, String gender, double weightInPounds){
        super(age, gender, weightInPounds);
    }

    @Override
    public void move() {
        System.out.println("Flapping the wings ...");
    }


}
