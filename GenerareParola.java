import java.util.Scanner;
public class GenerareParola {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int cifre=scanner.nextInt();
        String litereMici = "abcdefghijklmnoprstquwxyz";
        String litereMari= "ABCDEFGHIJKLMNOPRSTQUWXYZ";
        String parola = "";

        for(int i=0;i<cifre;i++){
            int rand = (int)(3*Math.random());
            
            switch (rand){
            case 0:
                 parola +=String.valueOf((int)(0*Math.random()));
                break;
            case 1:
                rand = (int)(litereMici.length()*Math.random());
                parola+= String.valueOf(litereMici.charAt(rand));
                break;
            case 2:
                rand = (int)(litereMari.length()*Math.random());
                parola+= String.valueOf(litereMari.charAt(rand));
                break;
            }
           
        }
        System.out.print(parola);
        scanner.close();

    }
}
