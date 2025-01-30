package Recursion;

public class Basic_Recursive_functions {

    public static void print_n_to_1(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print_n_to_1(n-1);
    }
    public static void print_1_to_n(int n)
    {
        if(n==0)
        {
            return;
        }
        print_1_to_n(n-1);
        System.out.println(n);
    }
    public static long factorial(int n)
    {
        if(n==0 ||n==1)
        {
            return 1;
        }
        return (long)factorial(n-1) *n;
    }
    public static int Sum_Of_Digits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%10 + Sum_Of_Digits(n/10);
    }
    public static int reverse_a_number(int n)
    {
       int digits= (int)(Math.log10(n)) +1;
       return helper_in_reverse(n,digits);
    }

    private static int helper_in_reverse(int n, int digits) {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
       return rem* (int)(Math.pow(10,digits-1)) + helper_in_reverse(n/10,digits-1);
    }


    public static boolean isPalindrome(int n) {
       int reverse= reverse_a_number(n);
       return reverse==n;
    }
    public static int countZERO(int n)
    {
        return Count_No_Of_Zeros_Helper(n,0);
    }
  public static int Count_No_Of_Zeros_Helper(int n,int count)
  {
      if(n==0)
      {

          return count;
      }
      int rem=n%10;
      if(rem==0)
      {
          return Count_No_Of_Zeros_Helper(n/10,++count);
      }
     else
          return Count_No_Of_Zeros_Helper(n/10,count);
  }
  public static boolean isSorted_Array(int[]arr,int i)
  {
      if(arr.length<=1) {
          return true;
      }
      int j=i+1;
      if(arr[i]<=arr[j])
      {
          return isSorted_Array(arr,i+1);
      }
      return false;
  }
    public static void main(String[] args) {
        print_n_to_1(1);
        print_1_to_n(1);
        System.out.println(factorial(5));
        System.out.println(Sum_Of_Digits(123499));
        System.out.println(reverse_a_number(5678));
        System.out.println(isPalindrome(11));
        System.out.println(countZERO(100340));
    }
}
