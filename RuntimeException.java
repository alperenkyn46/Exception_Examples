public class RuntimeException  extends java.lang.RuntimeException {

    public void ThrowEx(){
        throw new java.lang.RuntimeException();
    }

    public static void main(String[] args) {

        try {

            new RuntimeException().ThrowEx();

        }catch (java.lang.RuntimeException e){
            System.out.println(e.toString());
        }

    }
}
