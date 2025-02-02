public class All_directions_allowed_TotalPaths {
    static void All_Paths(String p,boolean[][]maze,int r,int c)
    {  

         // If the current position is out of bounds or the cell is not open (false), return
         if (r < 0 || r >= maze.length || c < 0 || c >= maze[0].length || !maze[r][c]) {
            return;
        }


       if(r==maze.length-1 && c==maze[0].length-1)
       {
            System.out.println(p);
            return;
       }
  
  

       //This is visited so mark it as false :
       maze[r][c]=false;

       if(r<maze.length)
       {
        All_Paths(p+'D',maze,r+1,c);
       }
       if(c<maze[0].length)
       {
        All_Paths(p+'R',maze,r,c+1);
       }
       if(r>0)
       {
        All_Paths(p+'U',maze,r-1,c);
       }
       if(c>0)
       {
        All_Paths(p+'L',maze,r,c-1);
       }


  /**All the function call have been finished for 1 path
   * so restore the array and mark it again as unvisited
   */
       maze[r][c]=true;
    }
    public static void main(String[] args) {
        boolean[][] board={
           {true,true,true},
           {true,true,true},
           {true,true,true}
        };
        All_Paths("", board, 0, 0);
    }
}
