package OOPS.Exception_Handling;

public class Throw_Throws {
    public static void main(String[] args) {
        int[]arr=new int[5];
//                ---->>>>>ERROR ROOT CAUSE-1<<<<<-------
//        getNumFrom_Array(arr);

        try{
        getNumFrom_Array(arr);
        }
        catch(Exception e)
        {
            System.out.println("Exception handled "+e.getMessage());
        }


    }


//                ---->>>>>ERROR ROOT CAUSE-1<<<<<-------
//    public static void getNumFrom_Array(int[]arr)
//    {
//        System.out.println(arr[8]);
//    }

//                ---->>>>>SO WILL WILL USE THIS<<<<<-------
public static void getNumFrom_Array(int[]arr) throws ArithmeticException  //toh jaha yeh call hoga
                                                                         // usko try catch m band krdo
    {
        System.out.println(arr[8]);
    }


}
