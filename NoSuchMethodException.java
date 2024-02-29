import java.lang.reflect.Method;
import java.util.Scanner;

public class NoSuchMethodException extends Throwable {

    public static void main(String[] args) {


        try {

            Method method = NoSuchMethodException.class.getMethod("Merhaba",String.class);

        }catch (java.lang.NoSuchMethodException e){
System.out.println(e.toString());
        }

// Bu konu hakkında kendi bildiklerimle örnek yapacak kadar bilgi bulamadım hocam.
}
}
