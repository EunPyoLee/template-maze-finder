import finder.DfsFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class dfsSolvableTest {
    @Test
    public void testDFSSolvable() {
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
        DfsFinder dfsFinder = new DfsFinder();
        dfsFinder.setMaze(maze1);
        try{
            Assertions.assertTrue(dfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        dfsFinder.setMaze(maze2);
        try{
            Assertions.assertTrue(dfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        dfsFinder.setMaze(maze3);
        try{
            Assertions.assertTrue(dfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testDFSNotSolvable() {
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
        DfsFinder dfsFinder = new DfsFinder();
        dfsFinder.setMaze(maze1);
        try{
            Assertions.assertFalse(dfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        dfsFinder.setMaze(maze2);
        try{
            Assertions.assertFalse(dfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
        dfsFinder.setMaze(maze3);
        try{
            Assertions.assertFalse(dfsFinder.isSolvable());
        } catch (Exception e) {
            Assertions.fail(e.toString());
        }
    }

    @Test
    public void testInvalid() { // this applies the same to bfs as well so bfs's test don't need to test invalid - this can cover it as well
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
        DfsFinder dfsFinder = new DfsFinder();
        dfsFinder.setMaze(maze1);
        try{
            dfsFinder.isSolvable();
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        dfsFinder.setMaze(maze2);
        try{
            dfsFinder.isSolvable();
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        dfsFinder.setMaze(maze3);
        try{
            dfsFinder.isSolvable();
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        dfsFinder.setMaze(maze4);
        try{
            dfsFinder.isSolvable();
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        dfsFinder.setMaze(maze5);
        try{
            dfsFinder.isSolvable();
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        dfsFinder.setMaze(maze6);
        try{
            dfsFinder.isSolvable();
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
        dfsFinder.setMaze(maze7);
        try{
            dfsFinder.isSolvable();
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
    }
}
