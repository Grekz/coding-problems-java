package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int lenA = grid.length, lenB = grid[0].length, neig = 0, islands = 0;
        for (int i = 0; i < lenA; i++){
            for (int j = 0; j < lenB; j++){
                if (grid[i][j] == 1){
                    islands++;
                    if ( i < lenA - 1 && grid[i + 1][j] == 1) neig++;
                    if ( j < lenB - 1 && grid[i][j + 1] == 1) neig++;
                }
            }
        }
        return islands * 4 - neig * 2;
    }
}