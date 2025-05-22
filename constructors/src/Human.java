public class Human {
    String name;
    int age;
    double weight;
    Human(String name, int age, double height){
        this.name=name;
        this.age=age;
        this.weight= height;
    }

    void eat(){
        System.out.println(this.name +" is eating");
    }
}
