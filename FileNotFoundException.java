import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {

    public static void main(String[] args) {

        try {
            File dosya = new File("G://yazı.txt");

            FileReader fr = new FileReader("G://yazı.txt");

        }catch (java.io.FileNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
