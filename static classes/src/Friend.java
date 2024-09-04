public class Friend {

    String name;
    static int numberOffFriends;

    Friend(String name){
        this.name=name;
        numberOffFriends++;
    }

    static void displayFriends(){
        System.out.println("You have "+numberOffFriends+" friends");
    }
}
