public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 65, 170);
        Human human2 = new Human("Lily", 30, 158);

        System.out.println(human1.name);
        System.out.println(human2.age);

        human2.eat();
    }

}