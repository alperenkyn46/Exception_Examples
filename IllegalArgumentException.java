import java.util.Scanner;

public class IllegalArgumentException {

    public static int FaktoriyelAl(int a){
        if(a == 1){
           return a;
        }
        else
            return a*FaktoriyelAl(a-1);
    }



    public static void main(String[] args) {

        String [] dersler = {"Matematik","Fizik","Kimya"};

        System.out.println("Notunuzu Görmek İstediğiniz Dersi Girin: ");
        Scanner input = new Scanner(System.in);


        try {
            System.out.println(FaktoriyelAl(0));


        }
        catch (java.lang.IllegalArgumentException e){

            System.out.println(e.toString());
        }


    }
}
