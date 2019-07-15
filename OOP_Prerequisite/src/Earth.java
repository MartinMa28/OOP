public class Earth {
    public static void main(String args[]){
        Human tom = new Human("Tom", 5, 1.1, "brown");
        Human joe = new Human("Joe", 17, 1.6, "blue");
        tom.speak();
        System.out.println();
        joe.speak();
    }
}
