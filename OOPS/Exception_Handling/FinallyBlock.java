package OOPS.Exception_Handling;

public class FinallyBlock {
    public static void main(String[] args) {
        int[]a=new int[5];
        System.out.println("Hiee jii");

        try{
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Exception handled");
        }


//        catch will work as else if but finally will work as
//    else i.e. it will be only one time
        finally {
            System.out.println("mai toh humesha chalungi chahe tum run ho ya mat ho ");
        }

        System.out.println("Byee jii");
    }
}
