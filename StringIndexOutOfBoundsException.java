public class StringIndexOutOfBoundsException {


    public static void main(String[] args) {

        String ad = "Alperen";

        try {

            for (int i=0;i<ad.length();i++){
                System.out.print(ad.charAt(i+1)+" ");
            }


        }
        catch (java.lang.StringIndexOutOfBoundsException e){

            System.out.println(e.toString()+" Hatası Meydana Geldi !");

        }


    }
}
