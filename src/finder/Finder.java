package finder;

// Abstract Finder whose traverse logic in the algorihtm step can be provided by subclass
public abstract class Finder {
    private int[][] maze;
    private boolean isSet = false;
    protected int[] startPos = new int[2];
    protected int[] endPos = new int[2];
    // provides common method such as checking the validness of input
    public void setMaze(int[][] maze) {
        isSet = true;
        this.maze = maze;
    }
    private boolean isMazeValid() {
        int oneCount = 0; // start pos: only one should exist
        int twoCount = 0; // end pos: only one should exist
        for(int r = 0; r < maze.length; ++r){
            for(int c = 0; c < maze[r].length; ++c){
                switch (maze[r][c]) {
                    case 0: // open path
                    case 3: // wall
                        break;
                    case 1:
                        if(++oneCount > 1){
                            return false;
                        }
                        startPos[0] = r;
                        startPos[1] = c;
                        break;
                    case 2:
                        if(++twoCount > 1) {
                            return false;
                        }
                        endPos[0] = r;
                        endPos[1] = c;
                        break;
                    default:
                        return false;
                }
            }
        }
        if(oneCount != 1 || twoCount != 1){
            return false;
        }
        return true;
    }

    abstract boolean search(int[][] maze);

    public boolean isSolvable() throws Exception{
        if(!isSet){
            throw new Exception("maze is not set yet: please set a maze first");
        }
        if(!isMazeValid()){
            isSet = false;
        }
        return search(maze);
    }
}
