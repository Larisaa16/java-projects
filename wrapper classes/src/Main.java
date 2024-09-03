import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Larisa";

        // access to methods

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("salad");
        food.add("apple");

        food.set(0, "sushi"); //replace(index, element)
        food.remove(2);
        food.clear();//erase all

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
        
    }
}