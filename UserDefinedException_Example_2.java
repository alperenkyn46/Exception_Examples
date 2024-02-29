import java.util.Scanner;

public class UserDefinedException_Example_2 {

    public static double HipotenusAl(int a, int b){
        int sonuc=a*a+b*b;
        return Math.sqrt(sonuc);
    }

    public static void main(String[] args) {
        MyException me = new MyException();

        Scanner input = new Scanner(System.in);
        System.out.println("Hipotenüs İçin Gerekli Kenar Uzunluklarını Girin: ");
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            double sonuc=HipotenusAl(a,b);
            if(a>0&&b>0){
                System.out.println(sonuc);
            }
            else if(a<0 || b<0){
                MyException ex = new MyException("Hatalı Giriş Yaptınız !");
                throw ex;
            }

        }catch (Exception e){
           e.printStackTrace();
        }


    }
}
