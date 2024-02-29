import java.util.Scanner;

public class UserDefinedException_Example_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kart Şifrenizi Giriniz: ");

        MyException me = new MyException();

        try {
            int a= input.nextInt();
            if(a<9999){
                System.out.println("Sisteme Giriş Başarılı");
            }
            else if (a>9999) {
            MyException ex = new MyException("Hatalı Giriş Yaptınız !");
            throw ex;
            }

        }catch (Exception e){
            System.out.println("Exception Çalıştı");

            e.printStackTrace();
        }



    }
}
