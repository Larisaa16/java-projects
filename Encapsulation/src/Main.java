public class Main {
    public static void main(String[] args) {


        Motocycle bike = new Motocycle("Yamaha R6", "Yamaha", 2022);

        System.out.println(bike.getModel());
        System.out.println(bike.getMake());
        System.out.println(bike.getYear());

        bike.setYear(2020);
        System.out.println(bike.getYear());

    }
}