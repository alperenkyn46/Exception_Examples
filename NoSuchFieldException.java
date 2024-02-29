import java.lang.reflect.Field;

public class NoSuchFieldException {



    public static void main(String[] args) {

        String ad,soyad,bolum;
        int numara;
        ad="Alperen ";soyad="Kayan ";bolum="Yazılım Mühendisliği ";numara=5361;
        try {

            System.out.println(ad+soyad+bolum+numara);
            NoSuchFieldException.class.getField("TC No");



        }
        catch (java.lang.NoSuchFieldException e){
            System.out.println(e.toString()+" Bulunamadı");
        }
    }
}
