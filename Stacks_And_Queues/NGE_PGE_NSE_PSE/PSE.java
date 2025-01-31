package Stacks_And_Queues.NGE_PGE_NSE_PSE;

import java.util.Stack;

public class PSE {
    public static int[]  PSE_Previous_Smaller_Element(int[]arr) {
        int n=arr.length;
        int[]PSE=new int[n];
        Stack<int[] > stack=new Stack<>();
        //stack.push(new int[]{value ,index});
        stack.push(new int[]{arr[0],0});
        PSE[0]=-1;
        for(int i=1;i<n;i++){

            while(!stack.isEmpty() && stack.peek()[0]>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty()){
                PSE[i]=-1;
            }
            else
                PSE[i]=stack.peek()[0];

            stack.push(new int[] {arr[i] , i});
        }

        return PSE;
    }

    public static void main(String[] args) {
        int[]nums={2,3,10,2,7,3,4,5,13,11};
        int[]PSE=PSE_Previous_Smaller_Element(nums);
        for(int i:PSE)
        {
            System.out.print(i+" ");
        }
    }
}
