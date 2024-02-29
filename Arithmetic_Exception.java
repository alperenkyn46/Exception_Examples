import java.util.Random;

public class Arithmetic_Exception  {

    public static void main(String[] args) {

        //2 farklı dizideki elemanların bölümlerini ekrana yazdırma

        int [] dizi= {0,1,2,3,4,5,6,7,8,9,10};
        int [] dizi1= {0,1,2,3,4,5,6,7,8,9,10};



        try {

            for (int i=0;i<dizi.length;i++){
                Random rnd = new Random();
                int a= rnd.nextInt(10);
                Random rnd2 = new Random();
                int b = rnd2.nextInt(10);


                    System.out.println(dizi[a]+"Sayısının"+dizi1[b]+"Sayısına Bölümü: "+dizi[a]/dizi1[b]);


            }


        }
        catch (ArithmeticException e){

            System.out.println("Aritmetiksel Hata !"+e.toString());
        }


    }

}
