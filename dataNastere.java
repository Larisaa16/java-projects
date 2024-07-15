
//Calculator data nastere
import java.util.Scanner;

public class dataNastere{
    public static int calculVarsta(int anCurent, int lunaCurenta, int ziCurenta, int anNastere, int lunaNastere,  int ziNastere){
        int varsta= anCurent-anNastere;
        if(lunaCurenta<lunaNastere || (lunaCurenta==lunaNastere && ziCurenta<ziNastere)){
            varsta--;
        }  
    return varsta;
    }
    public static void afisare() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Scrieti data curenta (an luna zi): ");
        int anc = scanner.nextInt();
        int lunac = scanner.nextInt();
        int zic = scanner.nextInt();
        
        System.out.print("Scrieti data nasterii (an luna zi): ");
        int ann = scanner.nextInt();
        int lunan = scanner.nextInt();
        int zin = scanner.nextInt();
        
        int varsta = calculVarsta(anc, lunac, zic, ann, lunan, zin);
        System.out.println("Varsta persoanei este: " + varsta + " ani");
        
        scanner.close();
    }

    public static void main(String[] args) {
        afisare();
    }
}


