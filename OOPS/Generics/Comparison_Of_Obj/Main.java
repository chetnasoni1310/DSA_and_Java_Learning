package OOPS.Generics.Comparison_Of_Obj;

public class Main {
    public static void main(String[] args) {


        Student kunal=new Student(23.45f,"Kumal");
        Student rahul=new Student(99.45f,"Rahul");

        if(kunal.compareTo(rahul)>0)
        {
            System.out.println("Rahul has less marks");
            System.out.println(kunal.compareTo(rahul));
        }
        else
        {
            System.out.println("Kunal has less marks");
        }
    }
}
