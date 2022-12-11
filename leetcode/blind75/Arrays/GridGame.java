//2017. Grid Game

package leetcode.blind75.Arrays;
import java.util.*;
public class GridGame {
    public static void main(String[] args) {
        int[][] g = {{2, 5, 4}, {1, 5, 1}};
        System.out.print(gridGame(g));
    }

    public static long gridGame(int[][] g) {
    long top = 0;
    for (int i = 0; i < g[0].length; i++) {
        top += g[0][i];
    }
    long bottom = 0; 
    long res = Long.MAX_VALUE;
    for(int i = 0; i < g[0].length; ++i) {
        top -= g[0][i];
        res = Math.min(res, Math.max(top, bottom));
        bottom += g[1][i];
    }
    return res;        
}
}
