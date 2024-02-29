import java.util.Random;

public class NullPointerException {

    //Rastgele 7 harfli kelime üretme

    public static void main(String[] args) {

        Random rnd = new Random();
        String kelime = null;

        try {
            String [] dizi = new String[5];
            System.out.println(dizi[0]);
            if(dizi[0]==null){
           throw  new java.lang.NullPointerException("NullPointerException...");
            }

        }catch (java.lang.NullPointerException e){
            System.out.println("e.toString()");
        }





    }

}
