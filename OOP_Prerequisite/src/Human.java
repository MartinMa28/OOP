public class Human {
    private String name;
    private int age;
    private double heightInMeter;
    private String eyeColor;

    public Human(String name, int age, double heightInMeter, String eyeColor){
        this.name = name;
        this.age = age;
        this.heightInMeter = heightInMeter;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInMeter + " meters tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eyecolor is " + eyeColor);
    }

    public void eat(){
        System.out.println("eating ...");
    }

    public void work(){
        System.out.println("working ...");
    }

    public void walk(){
        System.out.println("walking ...");
    }
}
