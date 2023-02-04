package samer.Problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumIslandsTest {

    @Test
    void numIslands1() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        int expected = 3;
        int actual = NumIslands.numIslands(grid);
        assertEquals(expected, actual);
    }

    @Test
    void numIslands2() {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        int expected = 1;
        int actual = NumIslands.numIslands(grid);
        assertEquals(expected, actual);
    }

}