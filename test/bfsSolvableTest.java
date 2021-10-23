import finder.BfsFinder;
import finder.Finder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bfsSolvableTest {
    @Test
    public void testBFSSolvable() {
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
        Finder bfsFinder = new BfsFinder();
        bfsFinder.setMaze(maze1);
        try{
            Assertions.assertTrue(bfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        bfsFinder.setMaze(maze2);
        try{
            Assertions.assertTrue(bfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        bfsFinder.setMaze(maze3);
        try{
            Assertions.assertTrue(bfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testBFSNotSolvable() {
        int[][] maze1 = {
                {0,0,0,3,1,0},
                {0,0,0,0,3,0},
                {0,0,0,3,0,0},
                {0,0,0,3,0,0},
                {0,0,0,2,3,0},
        };
        int[][] maze2 = {
                {0,0,3,0,1,0},
                {0,3,2,3,0,0},
        };
        int[][] maze3 = {
                {0,0,2,3,1,0},
        };
        Finder bfsFinder = new BfsFinder();
        bfsFinder.setMaze(maze1);
        try{
            Assertions.assertFalse(bfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        bfsFinder.setMaze(maze2);
        try{
            Assertions.assertFalse(bfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        bfsFinder.setMaze(maze3);
        try{
            Assertions.assertFalse(bfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
    }
}
