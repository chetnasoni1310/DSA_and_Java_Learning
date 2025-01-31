package Stacks_And_Queues.NGE_PGE_NSE_PSE;

import java.util.Stack;

public class NSE {
    public static int[]  NSE_(int[]arr) {
        int n=arr.length;
        int[]NSE=new int[n];
        Stack<int[] > stack=new Stack<>();
        //stack.push(new int[]{value ,index});
        stack.push(new int[]{arr[n-1],n-1});
        NSE[n-1]=-1;
        for(int i=n-2;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()[0]>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty()){
                NSE[i]=-1;
            }
            else
                NSE[i]=stack.peek()[0];

            stack.push(new int[] {arr[i] , i});
        }

        return NSE;
    }

    public static void main(String[] args) {
        int[]nums={2,3,10,2,7,3,4,5,13,11};
        int[]NSE=NSE_(nums);
        for(int i:NSE)
        {
            System.out.println(i);
        }
    }
}
