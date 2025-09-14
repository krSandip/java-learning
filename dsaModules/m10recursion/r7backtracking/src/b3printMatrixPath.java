import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b3printMatrixPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        mazeAllPaths("", maze,0,0, path, 1);
    }

    static void mazeAllPaths(String p, boolean[][] maze, int row, int col, int[][] path, int step){
        if(row == 2 && col == 2){
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;
        if(row<2){
            mazeAllPaths(p+'D',maze, row+1, col, path, step+1);
        }
        if(col<2){
            mazeAllPaths(p+'R', maze, row, col+1, path, step+1);
        }
        if(row>0){
            mazeAllPaths(p+'U', maze, row-1, col, path, step+1);
        }
        if(col>0){
            mazeAllPaths(p+'L', maze, row, col-1, path, step+1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }
}

