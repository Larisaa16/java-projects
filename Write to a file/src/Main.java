import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("The moon is beautiful\n ");
            writer.append("\n(A poem by Larisa)");
            writer.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}