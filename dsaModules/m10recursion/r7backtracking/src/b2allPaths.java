import java.util.ArrayList;
import java.util.List;

public class b2allPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        mazeAllPaths("", maze,0,0);
        System.out.println(mazeAllPathsRet("", maze, 0, 0));
    }

    static void mazeAllPaths(String p, boolean[][] maze, int row, int col){
        if(row == 2 && col == 2){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        if(row<2){
            mazeAllPaths(p+'D',maze, row+1, col);
        }
        if(col<2){
            mazeAllPaths(p+'R', maze, row, col+1);
        }
        if(row>0){
            mazeAllPaths(p+'U', maze, row-1, col);
        }
        if(col>0){
            mazeAllPaths(p+'L', maze, row, col-1);
        }
        maze[row][col] = true;
    }

    static List<String> mazeAllPathsRet(String p, boolean[][] maze, int row, int col){
        if(row == 2 && col == 2){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(!maze[row][col]){
            return ans;
        }
        maze[row][col] = false;
        if(row<2){
            ans.addAll(mazeAllPathsRet(p+'D',maze, row+1, col));
        }
        if(col<2){
            ans.addAll(mazeAllPathsRet(p+'R', maze, row, col+1));
        }
        if(row>0){
            ans.addAll(mazeAllPathsRet(p+'U', maze, row-1, col));
        }
        if(col>0){
            ans.addAll(mazeAllPathsRet(p+'L', maze, row, col-1));
        }
        maze[row][col] = true;
        return ans;
    }
}
