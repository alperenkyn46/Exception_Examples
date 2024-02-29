import java.util.Random;

public class ClassNotFoundException_Ex {
    public static void main(String[] args) {

        try {
           Class.forName("Sınıf");

        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
