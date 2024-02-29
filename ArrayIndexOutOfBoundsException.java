public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        String [] Ogrenciler = {"Alperen","Mehmet","Sıla","Sude"};

        try {

            for(int i=0;i< 7;i++){
                System.out.println("Sınıftaki Öğrenciler: "+Ogrenciler[i]);
            }

        }
        catch (java.lang.ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Hatası ! "+e.getMessage());
        }
    }
}
