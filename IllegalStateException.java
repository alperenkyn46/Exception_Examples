import java.util.Scanner;

public class IllegalStateException {

    public static void main(String[] args) {

        String [] dersler = {"Matematik","Fizik","Kimya"};
        System.out.println("Matematik\tFizik\tKimya");

        Scanner input = new Scanner (System.in);
        System.out.println("Notunuzu Görmek İstediğiniz Dersi Girin: ");
        String x = input.nextLine();


            for(String ders:dersler){
                switch (x){
                    case "Matematik":
                        System.out.println("Notunuz 50");
                        break;
                    case "Fizik":
                        System.out.println("Notunuz 75");
                        break;
                    case "Kimya":
                        System.out.println("Notunuz 46");
                        break;
                    default:
                        throw new java.lang.IllegalStateException("Hatalı Giriş Yaptınız");
                }
                break;
            }



    }
}
