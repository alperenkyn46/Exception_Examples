import java.util.Scanner;

public class IOException{
    public static void main(String[] args) throws java.io.IOException {

        //İnput Outpu Hatalarını Gösteren Örnek
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Tarihinizi Giriniz");
        int a = input.nextInt();
        if(a>2024){
            throw new java.io.IOException("Hatalı Giriş Yaptınız !");
        }


    }
}
