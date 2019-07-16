public class Fish extends Animal{

    public Fish(int age, String gender, double weightInPounds){
        super(age, gender, weightInPounds);
    }


    public void swim(){
        System.out.println("swimming ...");
    }

    @Override
    public void move(){
        System.out.println("Fish is swimming ...");
    }
}
