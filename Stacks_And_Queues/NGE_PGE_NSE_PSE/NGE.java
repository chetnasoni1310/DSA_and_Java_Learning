package Stacks_And_Queues.NGE_PGE_NSE_PSE;
import java.util.Stack;
public class NGE {
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]nge=new int [n];
        Stack<Integer> stack =new Stack<>();
        stack.push(nums[n-1]);
        nge[n-1]=-1;
        for(int i=n-2 ; i>=0 ;i--)
        {
            while(!stack.isEmpty() && nums[i]>=stack.peek())
            {
                stack.pop();
            }


                if(!stack.isEmpty())
                    nge[i]=stack.peek();
                else
                    nge[i]=-1;

            stack.push(nums[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr=nextGreaterElements(new int[]{1,2,3,14,5,6,7});
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
