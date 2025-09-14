import java.util.ArrayList;
import java.util.List;

public class b1maze {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
                {true, true, true}
        };
        System.out.println(mazeCount(0,0));
        mazePath("", 0, 0);
        System.out.println(mazePathRet("", 0, 0));
        System.out.println(mazePathDiagonal("", 0, 0));
        System.out.println(mazePathRestriction("", maze, 0, 0));
    }
    static int mazeCount(int row, int col){
        if(row==2 || col==2){
            return 1;
        }
        return mazeCount(row+1, col) + mazeCount(row, col+1);
    }

    static void mazePath(String p, int row, int col){
        if(row == 2 && col == 2){
            System.out.println(p);
            return;
        }
        if(row<2){
            mazePath(p+'H', row+1, col);
        }
        if(col<2){
            mazePath(p+'V', row, col+1);
        }
    }

    static List<String> mazePathRet(String p, int row, int col){
        if(row == 2 && col == 2){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(row<2){
            ans.addAll(mazePathRet(p+'H', row+1, col));
        }
        if(col<2){
            ans.addAll(mazePathRet(p+'V', row, col+1));
        }
        return ans;
    }

    static List<String> mazePathDiagonal(String p, int row, int col){
        if(row == 2 && col == 2){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(row<2 && col<2){
            ans.addAll(mazePathDiagonal(p+'D', row+1, col+1));
        }
        if(row<2){
            ans.addAll(mazePathDiagonal(p+'H', row+1, col));
        }
        if(col<2){
            ans.addAll(mazePathDiagonal(p+'V', row, col+1));
        }
        return ans;
    }

    static List<String> mazePathRestriction(String p,boolean[][] maze, int row, int col){
        if(row == 2 && col == 2){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(maze[row][col] == false){
            return ans;
        }
        if(row<2){
            ans.addAll(mazePathRestriction(p+'H',maze, row+1, col));
        }
        if(col<2){
            ans.addAll(mazePathRestriction(p+'V', maze, row, col+1));
        }
        return ans;
    }
}
