package OOPS.Exception_Handling;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hieee");

        int[]arr=new int[5];
        try {
            int result=9/0;
            System.out.println(result);
            System.out.println(arr[8]);
        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }


//        catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
//        {
//            System.out.println("yoyo eorror hai re ");
//        }

//        catch(RuntimeException e)
//        {
//            System.out.println("Runtime wali h re" );
//        }

        catch (Exception e) {
            System.out.println("koi bhi ho i will handle mai hoon na");
        }
        System.out.println("Byee");
    }
}
