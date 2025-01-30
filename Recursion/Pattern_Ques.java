package Recursion;

public class Pattern_Ques {
    public static void Right_triangle(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row)
        {
            System.out.print(" * ");
            Right_triangle(row,col+1);
        }
        else{
            System.out.println();
            Right_triangle(row-1,0);
        }
    }
        public static void Normal_Triangle(int row,int col)
        {
            if(row==0)
            {
                return;
            }
            if(col<row)
            {
                Normal_Triangle(row,col+1);
                System.out.print(" * ");

            }
            else{
                Normal_Triangle(row-1,0);
                System.out.println();

            }
        }
    public static void main(String[] args) {
        Right_triangle(4,0);
        Normal_Triangle(4,0);
    }
}
