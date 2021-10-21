import org.junit.jupiter.api.Test;

public class IsValidMazeTest {
    @Test
    public void testIsValidWithValidMaze() {
        int[][] maze1 = {
                {0,0,0,0,1,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,2,0,0},
        };
        int[][] maze2 = {
                {0,0,0,0,1,0},
                {0,0,2,0,0,0},
        };
        int[][] maze3 = {
                {0,0,2,0,1,0},
        };
    }

    @Test
    public void testIsValidWithInvalidMaze() {
        int[][] maze1 = { // multiple entries
                {0,0,0,0,1,0},
                {0,0,0,0,0,0},
                {0,0,0,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,2,0,0},
        };
        int[][] maze2 = { // multiple exits
                {0,0,2,0,1,0},
                {0,0,2,0,0,0},
        };
        int[][] maze3 = { // multiple entries and exits
                {0,0,0,0,1,0},
                {0,0,0,0,0,0},
                {0,0,1,1,0,0},
                {0,2,0,0,0,0},
                {0,0,0,2,0,0},
        };
        int[][] maze4 = { // unexpected value
                {0,0,0,0,1,0},
                {0,0,0,0,0,0},
                {0,0,0,3,0,0},
                {0,0,0,0,0,0},
                {0,0,0,2,0,0},
        };
        int[][] maze5 = { // no entry
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,2,0,0},
        };
        int[][] maze6 = { // no exit
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,1,0,0},
        };
        int[][] maze7 = { // no entry and no exit
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
        };
    }
}
