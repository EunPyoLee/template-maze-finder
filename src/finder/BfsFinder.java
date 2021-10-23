package finder;

import java.util.LinkedList;
import java.util.Queue;

public class BfsFinder extends Finder{
    public class Coord {
        public Coord(int _r, int _c) {
            r = _r;
            c = _c;
        }
        int r;
        int c;
    }

    @Override
    boolean search(int[][] maze) {
        Queue<Coord> q = new LinkedList<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[startPos[0]][startPos[1]] = true;
        q.add(new Coord(startPos[0], startPos[1]));
        while(!q.isEmpty()){
            int r = q.peek().r;
            int c = q.peek().c;
            q.remove();
            if(r == endPos[0] && c == endPos[1]){
                return true;
            }
            if(boundCheck(maze, visited,r - 1, c)){
                visited[r-1][c] = true;
                q.add(new Coord(r-1, c));
            }
            if(boundCheck(maze, visited, r, c + 1)){
                visited[r][c + 1] = true;
                q.add(new Coord(r, c+1));
            }
            if(boundCheck(maze, visited, r + 1, c)){
                visited[r+1][c] = true;
                q.add(new Coord(r+1, c));
            }
            if(boundCheck(maze, visited, r, c - 1)){
                visited[r][c-1] = true;
                q.add(new Coord(r, c-1));
            }
        }
        return false;
    }

    boolean boundCheck(int[][]maze, boolean[][]visited, int r, int c){
        if(r < 0 || r >= maze.length || c <0 || c >= maze[0].length){
            return false;
        }
        return maze[r][c] != 3 && !visited[r][c];
    }

}
