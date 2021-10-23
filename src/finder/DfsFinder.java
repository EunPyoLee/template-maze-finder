package finder;

public class DfsFinder extends Finder{
    @Override
    boolean search(int[][] maze) {
        return dfs(maze, startPos[0], startPos[1], endPos[0], endPos[1]);
    }

    boolean boundCheck(int[][]maze, int r, int c){
        if(r < 0 || r >= maze.length || c <0 || c >= maze[0].length){
            return false;
        }
        return maze[r][c] != 3;
    }
    boolean dfs(int[][] maze, int r, int c, int endr, int endc){
        if(r == endr && c == endc){
            return true;
        }
        boolean found = false;
        if(boundCheck(maze, r - 1, c)){
             int oriVal = maze[r-1][c];
             maze[r-1][c]= 3;
             found = dfs(maze, r- 1, c, endr, endc);
             maze[r-1][c] = oriVal;
        }
        if(!found && boundCheck(maze, r, c + 1)){
            int oriVal = maze[r][c + 1];
            maze[r][c + 1]= 3;
            found = dfs(maze, r- 1, c, endr, endc);
            maze[r][c+1] = oriVal;
        }
        if(!found && boundCheck(maze, r + 1, c)){
            int oriVal = maze[r+1][c];
            maze[r+1][c]= 3;
            found = dfs(maze, r + 1, c, endr, endc);
            maze[r+1][c] = oriVal;
        }
        if(!found && boundCheck(maze, r, c - 1)){
            int oriVal = maze[r][c - 1];
            maze[r][c - 1]= 3;
            found = dfs(maze, r, c-1, endr, endc);
            maze[r][c-1] = oriVal;
        }
        return found;
    }
}
