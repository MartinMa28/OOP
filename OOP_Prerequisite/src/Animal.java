public abstract class Animal {
    private int age;
    private String gender;
    private double weightInPounds;

    public Animal(){

    }

    public Animal(int age, String gender, double weightInPounds){
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }

    public void eat(){
        System.out.println("eating ...");
    }

    public void sleep(){
        System.out.println("sleeping ...");
    }

    public abstract void move();
}
