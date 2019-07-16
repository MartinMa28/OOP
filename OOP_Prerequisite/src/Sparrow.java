public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, double weightInPounds){
        super(age, gender, weightInPounds);
    }

    public void fly(){
        System.out.println("Sparrow is flying high ...");
    }
}
