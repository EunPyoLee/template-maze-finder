package finder;

// Abstract Finder whose traverse logic in the algorihtm step can be provided by subclass
public abstract class Finder {
    private int[][] maze;
    private boolean isSet = false;
    // provides common method such as checking the validness of input
    public void setMaze(int[][] maze) {
        this.maze = maze;
    }
    private boolean isMazeValid() {
        int oneCount = 0; // start pos: only one should exist
        int twoCount = 0; // end pos: only one should exist
        for(int r = 0; r < maze.length; ++r){
            for(int c = 0; c < maze[r].length; ++c){
                switch (maze[r][c]) {
                    case 0:
                        break;
                    case 1:
                        if(++oneCount > 1){
                            return false;
                        }
                        break;
                    case 2:
                        if(++twoCount > 1) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if oneCount != 1 || twoCount != 1 {
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
            throw new Exception("invalid maze: please reset it with a valid one");
        }

        return search(maze);
    }
}
